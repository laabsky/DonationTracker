package CharityNavigator;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@JsonProperty("currentRating")
	private CurrentRating currentRating;

	@JsonProperty("advisories")
	private Advisories advisories;

	@JsonProperty("charityNavigatorURL")
	private String charityNavigatorURL;

	@JsonProperty("tagLine")
	private String tagLine;

	@JsonProperty("cause")
	private Cause cause;

	@JsonProperty("charityName")
	private String charityName;

	@JsonProperty("ein")
	private String ein;

	@JsonProperty("mission")
	private String mission;

	@JsonProperty("irsClassification")
	private IrsClassification irsClassification;

	@JsonProperty("websiteURL")
	private String websiteURL;

	@JsonProperty("mailingAddress")
	private MailingAddress mailingAddress;

	@JsonProperty("organization")
	private Organization organization;

	@JsonProperty("donationAddress")
	private DonationAddress donationAddress;

	@JsonProperty("category")
	private Category category;

	public void setCurrentRating(CurrentRating currentRating){
		this.currentRating = currentRating;
	}

	public CurrentRating getCurrentRating(){
		return currentRating;
	}

	public void setAdvisories(Advisories advisories){
		this.advisories = advisories;
	}

	public Advisories getAdvisories(){
		return advisories;
	}

	public void setCharityNavigatorURL(String charityNavigatorURL){
		this.charityNavigatorURL = charityNavigatorURL;
	}

	public String getCharityNavigatorURL(){
		return charityNavigatorURL;
	}

	public void setTagLine(String tagLine){
		this.tagLine = tagLine;
	}

	public String getTagLine(){
		return tagLine;
	}

	public void setCause(Cause cause){
		this.cause = cause;
	}

	public Cause getCause(){
		return cause;
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

	public void setMission(String mission){
		this.mission = mission;
	}

	public String getMission(){
		return mission;
	}

	public void setIrsClassification(IrsClassification irsClassification){
		this.irsClassification = irsClassification;
	}

	public IrsClassification getIrsClassification(){
		return irsClassification;
	}

	public void setWebsiteURL(String websiteURL){
		this.websiteURL = websiteURL;
	}

	public String getWebsiteURL(){
		return websiteURL;
	}

	public void setMailingAddress(MailingAddress mailingAddress){
		this.mailingAddress = mailingAddress;
	}

	public MailingAddress getMailingAddress(){
		return mailingAddress;
	}

	public void setOrganization(Organization organization){
		this.organization = organization;
	}

	public Organization getOrganization(){
		return organization;
	}

	public void setDonationAddress(DonationAddress donationAddress){
		this.donationAddress = donationAddress;
	}

	public DonationAddress getDonationAddress(){
		return donationAddress;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"currentRating = '" + currentRating + '\'' + 
			",advisories = '" + advisories + '\'' + 
			",charityNavigatorURL = '" + charityNavigatorURL + '\'' + 
			",tagLine = '" + tagLine + '\'' + 
			",cause = '" + cause + '\'' + 
			",charityName = '" + charityName + '\'' + 
			",ein = '" + ein + '\'' + 
			",mission = '" + mission + '\'' + 
			",irsClassification = '" + irsClassification + '\'' + 
			",websiteURL = '" + websiteURL + '\'' + 
			",mailingAddress = '" + mailingAddress + '\'' + 
			",organization = '" + organization + '\'' + 
			",donationAddress = '" + donationAddress + '\'' + 
			",category = '" + category + '\'' + 
			"}";
		}
}