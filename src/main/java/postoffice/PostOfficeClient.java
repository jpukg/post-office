package postoffice;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import postoffice.domain.model.Address;
import postoffice.domain.model.ZipCodeSearchQuery;
import postoffice.domain.model.ZipCodeSearchResponse;

@SuppressWarnings("deprecation")
public class PostOfficeClient extends WebServiceGatewaySupport {

	private static final Logger LOGGER = LoggerFactory.getLogger(PostOfficeClient.class);

	public Address getAddress(final String zipCode) {
		final ZipCodeSearchQuery query = new ZipCodeSearchQuery(zipCode);
		LOGGER.info("Searching zip code: {}", query);

		final ZipCodeSearchResponse response = (ZipCodeSearchResponse) getWebServiceTemplate().marshalSendAndReceive(query);
		LOGGER.info("Response: {} - {}", response.getClass().getName(), ToStringBuilder.reflectionToString(response));

		return response.getAddress();
	}

}
