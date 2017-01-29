package postoffice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import postoffice.domain.model.ZipCodeSearchQuery;
import postoffice.domain.model.ZipCodeSearchResponse;

@Configuration
@SuppressWarnings("deprecation")
public class PostOfficeConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(ZipCodeSearchQuery.class, ZipCodeSearchResponse.class);

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
