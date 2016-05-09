/**
 * RequestDataHelper.java
 * 
 * Created on May 5, 2016, 1:09:53 PM
 *
 */
package lol.challenge.stratejinxlolcation.helper;

import java.io.IOException;
import java.util.List;

/**
 * {Insert class description here}
 *
 * @author Carlos Bernal
 * @since May 5, 2016
 */
public class RequestDataHelper {

    private static final String MATCH_ID = "https://lan.api.pvp.net/api/lol/lan/v2.2/matchlist/by-summoner/<ID>?rankedQueues=TEAM_BUILDER_DRAFT_RANKED_5x5,RANKED_SOLO_5x5,RANKED_TEAM_3x3,RANKED_TEAM_5x5&seasons=SEASON2016&api_key=c7053b35-f2e2-4da9-a975-07c7ad93cff9";
    private static final String MATCH_DETAIL = "https://lan.api.pvp.net/api/lol/lan/v2.2/match/<ID>?includeTimeline=true&api_key=c7053b35-f2e2-4da9-a975-07c7ad93cff9";

    public static void main(String[] args) {
        RequestDataHelper helper = new RequestDataHelper();

        String id = "299314";
        try {
            helper.getMatchesByPlayer(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getMatchesByPlayer(String playerId) throws IOException {
        String url = MATCH_ID.replace("<ID>", playerId);
        String request = HttpRequestHelper.sendGet(url);
        return ParserHelper.getMatchIds(request);
    }

    /**
     * @param id
     * @throws IOException
     */
    public static String getMatchesDetail(String id) throws IOException {
        String url = MATCH_DETAIL.replace("<ID>", id);
        return HttpRequestHelper.sendGet(url);
    }

}
