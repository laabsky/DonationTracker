package CharityNavigator;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Category{

	@JsonProperty("image")
	private String image;

	@JsonProperty("charityNavigatorURL")
	private String charityNavigatorURL;

	@JsonProperty("categoryName")
	private String categoryName;

	@JsonProperty("categoryID")
	private int categoryID;

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

	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}

	public String getCategoryName(){
		return categoryName;
	}

	public void setCategoryID(int categoryID){
		this.categoryID = categoryID;
	}

	public int getCategoryID(){
		return categoryID;
	}

	@Override
 	public String toString(){
		return 
			"Category{" + 
			"image = '" + image + '\'' + 
			",charityNavigatorURL = '" + charityNavigatorURL + '\'' + 
			",categoryName = '" + categoryName + '\'' + 
			",categoryID = '" + categoryID + '\'' + 
			"}";
		}
}