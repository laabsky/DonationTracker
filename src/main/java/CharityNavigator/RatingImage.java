package CharityNavigator;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class RatingImage{

	@JsonProperty("small")
	private String small;

	@JsonProperty("large")
	private String large;

	public void setSmall(String small){
		this.small = small;
	}

	public String getSmall(){
		return small;
	}

	public void setLarge(String large){
		this.large = large;
	}

	public String getLarge(){
		return large;
	}

	@Override
 	public String toString(){
		return 
			"RatingImage{" + 
			"small = '" + small + '\'' + 
			",large = '" + large + '\'' + 
			"}";
		}
}