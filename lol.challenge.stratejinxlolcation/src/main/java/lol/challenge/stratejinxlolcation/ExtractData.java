/**
 * ExtractData.java
 * 
 * Created on May 4, 2016, 6:58:05 PM
 *
 */
package lol.challenge.stratejinxlolcation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import lol.challenge.stratejinxlolcation.helper.LogHelper;
import lol.challenge.stratejinxlolcation.helper.RequestDataHelper;

/**
 * {Insert class description here}
 *
 * @author Carlos Bernal
 * @since May 4, 2016
 */
public class ExtractData {

    public static void main(String[] args) throws InterruptedException {
        JsonObject jsonObject = new JsonObject();

        try {
            JsonParser parser = new JsonParser();
            String fileName = "challenger.txt";
            JsonElement jsonElement = parser.parse(new FileReader(fileName));
            jsonObject = jsonElement.getAsJsonObject();

            JsonArray asJsonArray = jsonObject.getAsJsonArray("entries");
            boolean half = false;
            for (JsonElement players : asJsonArray) {
                String playerId = players.getAsJsonObject().get("playerOrTeamId").getAsString();
                if (half) {
                    List<String> matches = RequestDataHelper.getMatchesByPlayer(playerId);
                    for (String match : matches) {
                        LogHelper.getInstance("matches.txt").addLine(match);
                    }
                    System.out.println("Player: " + playerId + " processed");
                    Thread.sleep(3 * 1000);
                }
                if (playerId.equals("34591")) {
                    half = true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
