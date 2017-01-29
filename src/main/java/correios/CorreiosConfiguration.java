package correios;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import correios.domain.model.CepSearchResponse;
import correios.wsdl.ConsultaCEP;

@Configuration
public class CorreiosConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// marshaller.setContextPath("correios.wsdl");
		marshaller.setClassesToBeBound(ConsultaCEP.class, CepSearchResponse.class);

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
