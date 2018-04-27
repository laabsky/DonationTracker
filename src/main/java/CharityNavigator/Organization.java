package CharityNavigator;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Organization{

	@JsonProperty("charityNavigatorURL")
	private String charityNavigatorURL;

	@JsonProperty("_rapid_links")
	private RapidLinks rapidLinks;

	@JsonProperty("charityName")
	private String charityName;

	@JsonProperty("ein")
	private String ein;

	public void setCharityNavigatorURL(String charityNavigatorURL){
		this.charityNavigatorURL = charityNavigatorURL;
	}

	public String getCharityNavigatorURL(){
		return charityNavigatorURL;
	}

	public void setRapidLinks(RapidLinks rapidLinks){
		this.rapidLinks = rapidLinks;
	}

	public RapidLinks getRapidLinks(){
		return rapidLinks;
	}

	public void setCharityName(String charityName){
		this.charityName = charityName;
	}

	public String getCharityName(){
		return charityName;
	}

	public void setEin(String ein){
		this.ein = ein;
	}

	public String getEin(){
		return ein;
	}

	@Override
 	public String toString(){
		return 
			"Organization{" + 
			"charityNavigatorURL = '" + charityNavigatorURL + '\'' + 
			",_rapid_links = '" + rapidLinks + '\'' + 
			",charityName = '" + charityName + '\'' + 
			",ein = '" + ein + '\'' + 
			"}";
		}
}