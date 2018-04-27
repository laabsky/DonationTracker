package CharityNavigator;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CurrentRating{

	@JsonProperty("rating")
	private int rating;

	@JsonProperty("ratingImage")
	private RatingImage ratingImage;

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setRatingImage(RatingImage ratingImage){
		this.ratingImage = ratingImage;
	}

	public RatingImage getRatingImage(){
		return ratingImage;
	}

	@Override
 	public String toString(){
		return 
			"CurrentRating{" + 
			"rating = '" + rating + '\'' + 
			",ratingImage = '" + ratingImage + '\'' + 
			"}";
		}
}