package correios;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CorreiosConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("correios.wsdl");

		return marshaller;
	}

	@Bean
	public CorreiosClient quoteClient(final Jaxb2Marshaller marshaller) {
		final CorreiosClient client = new CorreiosClient();
		client.setDefaultUri("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);

		return client;
	}

}
