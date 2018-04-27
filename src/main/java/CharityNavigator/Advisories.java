package CharityNavigator;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Advisories{

	@JsonProperty("severity")
	private Object severity;

	@JsonProperty("active")
	private Active active;

	public void setSeverity(Object severity){
		this.severity = severity;
	}

	public Object getSeverity(){
		return severity;
	}

	public void setActive(Active active){
		this.active = active;
	}

	public Active getActive(){
		return active;
	}

	@Override
 	public String toString(){
		return 
			"Advisories{" + 
			"severity = '" + severity + '\'' + 
			",active = '" + active + '\'' + 
			"}";
		}
}