package correios.domain.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "consultaCEPResponse")
public class CepSearchResponse {

	@XmlElement(name = "return")
	private Address address;

	public Address getAddress() {
		return address;
	}

}
