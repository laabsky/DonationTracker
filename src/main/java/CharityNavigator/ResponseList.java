package CharityNavigator;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;


@Generated("com.robohorse.robopojogenerator")
public class ResponseList{

    @JsonProperty("responseList")
    private List<Response> responseList;

    public void setResponseList(List<Response> responseList){
        this.responseList = responseList;
    }

    public List<Response> getResponseList(){
        return responseList;
    }

    @Override
    public String toString(){
        return
                "ResponseList{" +
                        "responseList = '" + responseList + '\'' +
                        "}";
    }
}
