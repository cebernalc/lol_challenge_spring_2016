/**
 * ParserHelper.java
 * 
 * Created on May 5, 2016, 1:24:23 PM
 *
 */
package lol.challenge.stratejinxlolcation.helper;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * {Insert class description here}
 *
 * @author Carlos Bernal
 * @since May 5, 2016
 */
public class ParserHelper {

    public static List<String> getMatchIds(String root) {
        List<String> ids = new ArrayList<String>();
        JsonObject rootJson = getJsonObject(root);
        JsonArray asJsonArray = rootJson.getAsJsonArray("matches");
        for (JsonElement match : asJsonArray) {
            String id = match.getAsJsonObject().get("matchId").getAsString();
            ids.add(id);
        }
        return ids;
    }

    public static JsonObject getJsonObject(String json) {
        JsonParser parser = new JsonParser();
        return parser.parse(json).getAsJsonObject();
    }
}
