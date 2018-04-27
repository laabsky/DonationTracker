package CharityNavigator;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class MailingAddress{

	@JsonProperty("country")
	private Object country;

	@JsonProperty("stateOrProvince")
	private String stateOrProvince;

	@JsonProperty("city")
	private String city;

	@JsonProperty("postalCode")
	private String postalCode;

	@JsonProperty("streetAddress1")
	private String streetAddress1;

	@JsonProperty("streetAddress2")
	private Object streetAddress2;

	public void setCountry(Object country){
		this.country = country;
	}

	public Object getCountry(){
		return country;
	}

	public void setStateOrProvince(String stateOrProvince){
		this.stateOrProvince = stateOrProvince;
	}

	public String getStateOrProvince(){
		return stateOrProvince;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setStreetAddress1(String streetAddress1){
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress1(){
		return streetAddress1;
	}

	public void setStreetAddress2(Object streetAddress2){
		this.streetAddress2 = streetAddress2;
	}

	public Object getStreetAddress2(){
		return streetAddress2;
	}

	@Override
 	public String toString(){
		return 
			"MailingAddress{" + 
			"country = '" + country + '\'' + 
			",stateOrProvince = '" + stateOrProvince + '\'' + 
			",city = '" + city + '\'' + 
			",postalCode = '" + postalCode + '\'' + 
			",streetAddress1 = '" + streetAddress1 + '\'' + 
			",streetAddress2 = '" + streetAddress2 + '\'' + 
			"}";
		}
}