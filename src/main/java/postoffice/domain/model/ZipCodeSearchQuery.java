package postoffice.domain.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "consultaCEP")
@Deprecated
public class ZipCodeSearchQuery {

	@XmlElement(name = "cep")
	private String zipCode;

	protected ZipCodeSearchQuery() {
	}

	public ZipCodeSearchQuery(final String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return zipCode;
	}

	public String getzipCode() {
		return zipCode;
	}

}
