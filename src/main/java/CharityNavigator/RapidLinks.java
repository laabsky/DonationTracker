package CharityNavigator;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class RapidLinks{

	@JsonProperty("related")
	private Related related;

	public void setRelated(Related related){
		this.related = related;
	}

	public Related getRelated(){
		return related;
	}

	@Override
 	public String toString(){
		return 
			"RapidLinks{" + 
			"related = '" + related + '\'' + 
			"}";
		}
}