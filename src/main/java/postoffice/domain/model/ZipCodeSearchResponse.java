package postoffice.domain.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "consultaCEPResponse")
@Deprecated
public class ZipCodeSearchResponse {

	@XmlElement(name = "return")
	private Address address;

	public Address getAddress() {
		return address;
	}

}
