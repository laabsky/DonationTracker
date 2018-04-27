package CharityNavigator;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Active{

	@JsonProperty("_rapid_links")
	private RapidLinks rapidLinks;

	public void setRapidLinks(RapidLinks rapidLinks){
		this.rapidLinks = rapidLinks;
	}

	public RapidLinks getRapidLinks(){
		return rapidLinks;
	}

	@Override
 	public String toString(){
		return 
			"Active{" + 
			"_rapid_links = '" + rapidLinks + '\'' + 
			"}";
		}
}