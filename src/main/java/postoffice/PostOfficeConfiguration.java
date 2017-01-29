package postoffice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class PostOfficeConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("postoffice.wsdl");

		return marshaller;
	}

	@Bean
	public PostOfficeClient quoteClient(final Jaxb2Marshaller marshaller) {
		final PostOfficeClient client = new PostOfficeClient();
		client.setDefaultUri("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);

		return client;
	}

}
