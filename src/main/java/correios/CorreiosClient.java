package correios;

import javax.xml.bind.JAXBElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import correios.domain.model.CepSearchResponse;
import correios.wsdl.ConsultaCEP;
import correios.wsdl.ConsultaCEPResponse;

public class CorreiosClient extends WebServiceGatewaySupport {

	private static final Logger LOGGER = LoggerFactory.getLogger(CorreiosClient.class);

	public Object getAddress(final String cep) {
		final ConsultaCEP request = new ConsultaCEP();
		request.setCep(cep);

		LOGGER.info("Requesting quote for " + cep);

		final Object response = getWebServiceTemplate().marshalSendAndReceive(request);

		if (response instanceof JAXBElement) {
			final JAXBElement<?> element = (JAXBElement<?>) response;
			LOGGER.info("JAXB: {} - {}", element.getValue().getClass().getName(), ToStringBuilder.reflectionToString(element.getValue()));

			return ((ConsultaCEPResponse) element.getValue()).getReturn();
		}

		LOGGER.info("Object: {} - {}", response.getClass().getName(), ToStringBuilder.reflectionToString(response));
		return ((CepSearchResponse) response).getAddress();
	}

}
