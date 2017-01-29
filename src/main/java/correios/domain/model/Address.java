package correios.domain.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "enderecoERP")
public class Address {

	@XmlElement(name = "end")
	private String streetName;

	@XmlElement(name = "cidade")
	private String city;

	public String getStreetName() {
		return streetName;
	}

	public String getCity() {
		return city;
	}

}
