package CharityNavigator;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    @Test
    public void testCharityNavigator() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.data.charitynavigator.org/v2/Organizations?app_id=af6bdcf3&app_key=092ed7ffde8aa8c3818496c099b6dc1a&rated=true&state=WI&city=madison&minRating=3");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        String configResponse = "{\"responseList\": " + response + "}";
        ObjectMapper mapper = new ObjectMapper();
        ResponseList results = mapper.readValue(configResponse, ResponseList.class);
        Response result = results.getResponseList().get(0);
        assertEquals(3, result.getCurrentRating().getRating());
        assertEquals("River Food Pantry", result.getCharityName());
    }
}

