package CharityNavigator;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class IrsClassification{

	@JsonProperty("deductibility")
	private String deductibility;

	@JsonProperty("subsection")
	private String subsection;

	@JsonProperty("nteeType")
	private String nteeType;

	@JsonProperty("foundationStatus")
	private String foundationStatus;

	@JsonProperty("nteeSuffix")
	private String nteeSuffix;

	@JsonProperty("nteeClassification")
	private String nteeClassification;

	@JsonProperty("deductibilityDetail")
	private Object deductibilityDetail;

	@JsonProperty("nteeCode")
	private String nteeCode;

	@JsonProperty("nteeLetter")
	private String nteeLetter;

	public void setDeductibility(String deductibility){
		this.deductibility = deductibility;
	}

	public String getDeductibility(){
		return deductibility;
	}

	public void setSubsection(String subsection){
		this.subsection = subsection;
	}

	public String getSubsection(){
		return subsection;
	}

	public void setNteeType(String nteeType){
		this.nteeType = nteeType;
	}

	public String getNteeType(){
		return nteeType;
	}

	public void setFoundationStatus(String foundationStatus){
		this.foundationStatus = foundationStatus;
	}

	public String getFoundationStatus(){
		return foundationStatus;
	}

	public void setNteeSuffix(String nteeSuffix){
		this.nteeSuffix = nteeSuffix;
	}

	public String getNteeSuffix(){
		return nteeSuffix;
	}

	public void setNteeClassification(String nteeClassification){
		this.nteeClassification = nteeClassification;
	}

	public String getNteeClassification(){
		return nteeClassification;
	}

	public void setDeductibilityDetail(Object deductibilityDetail){
		this.deductibilityDetail = deductibilityDetail;
	}

	public Object getDeductibilityDetail(){
		return deductibilityDetail;
	}

	public void setNteeCode(String nteeCode){
		this.nteeCode = nteeCode;
	}

	public String getNteeCode(){
		return nteeCode;
	}

	public void setNteeLetter(String nteeLetter){
		this.nteeLetter = nteeLetter;
	}

	public String getNteeLetter(){
		return nteeLetter;
	}

	@Override
 	public String toString(){
		return 
			"IrsClassification{" + 
			"deductibility = '" + deductibility + '\'' + 
			",subsection = '" + subsection + '\'' + 
			",nteeType = '" + nteeType + '\'' + 
			",foundationStatus = '" + foundationStatus + '\'' + 
			",nteeSuffix = '" + nteeSuffix + '\'' + 
			",nteeClassification = '" + nteeClassification + '\'' + 
			",deductibilityDetail = '" + deductibilityDetail + '\'' + 
			",nteeCode = '" + nteeCode + '\'' + 
			",nteeLetter = '" + nteeLetter + '\'' + 
			"}";
		}
}