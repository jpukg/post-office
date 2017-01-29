package postoffice;

import javax.xml.bind.JAXBElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import postoffice.wsdl.ConsultaCEP;
import postoffice.wsdl.ConsultaCEPResponse;
import postoffice.wsdl.EnderecoERP;

public class PostOfficeClient extends WebServiceGatewaySupport {

	private static final Logger LOGGER = LoggerFactory.getLogger(PostOfficeClient.class);

	@SuppressWarnings("unchecked")
	public EnderecoERP getAddress(final String cep) {
		final ConsultaCEP request = new ConsultaCEP();
		request.setCep(cep);

		LOGGER.info("Searching for zip code: " + cep);

		final JAXBElement<ConsultaCEPResponse> response = (JAXBElement<ConsultaCEPResponse>) getWebServiceTemplate().marshalSendAndReceive(request);
		LOGGER.info("JAXB: {} - {}", response.getValue().getClass().getName(), ToStringBuilder.reflectionToString(response.getValue()));

		return response.getValue().getReturn();
	}

}
