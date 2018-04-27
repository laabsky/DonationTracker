package CharityNavigator;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Cause{

	@JsonProperty("causeID")
	private int causeID;

	@JsonProperty("image")
	private String image;

	@JsonProperty("charityNavigatorURL")
	private String charityNavigatorURL;

	@JsonProperty("causeName")
	private String causeName;

	public void setCauseID(int causeID){
		this.causeID = causeID;
	}

	public int getCauseID(){
		return causeID;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setCharityNavigatorURL(String charityNavigatorURL){
		this.charityNavigatorURL = charityNavigatorURL;
	}

	public String getCharityNavigatorURL(){
		return charityNavigatorURL;
	}

	public void setCauseName(String causeName){
		this.causeName = causeName;
	}

	public String getCauseName(){
		return causeName;
	}

	@Override
 	public String toString(){
		return 
			"Cause{" + 
			"causeID = '" + causeID + '\'' + 
			",image = '" + image + '\'' + 
			",charityNavigatorURL = '" + charityNavigatorURL + '\'' + 
			",causeName = '" + causeName + '\'' + 
			"}";
		}
}