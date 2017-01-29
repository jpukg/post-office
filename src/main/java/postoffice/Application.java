package postoffice;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(final String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	CommandLineRunner lookup(final PostOfficeClient client) {
		return args -> {
			String ticker = "13219201";

			if (args.length > 0) {
				ticker = args[0];
			}

			final Object response = client.getAddress(ticker);
			LOGGER.info("Response: {}", ToStringBuilder.reflectionToString(response, ToStringStyle.JSON_STYLE));
		};
	}

}
