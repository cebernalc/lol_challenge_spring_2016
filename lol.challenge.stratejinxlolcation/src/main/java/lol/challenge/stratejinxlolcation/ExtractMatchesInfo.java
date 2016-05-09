/**
 * ExtractMatchesInfo.java
 * 
 * Created on May 8, 2016, 6:14:33 PM
 *
 */
package lol.challenge.stratejinxlolcation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import lol.challenge.stratejinxlolcation.helper.LogHelper;
import lol.challenge.stratejinxlolcation.helper.ParserHelper;
import lol.challenge.stratejinxlolcation.helper.RequestDataHelper;

/**
 * {Insert class description here}
 *
 * @author Carlos Bernal
 * @since May 8, 2016
 */
public class ExtractMatchesInfo {
    public static void main(String[] args) throws IOException, InterruptedException {

//        BufferedReader in = null;
//        try {
//            in = new BufferedReader(new FileReader("matches.txt"));
//            String line;
//            boolean half = false;
//            while ((line = in.readLine()) != null) {
//                if (half) {
//                    String response = RequestDataHelper.getMatchesDetail(line);
//                    LogHelper.getInstance("matches_detail.txt").addLine(response);
//                    System.out.println(line + ": done!");
//                    Thread.sleep(4 * 1000);
//                }
//                if (line.equals("269375204")) {
//                    half = true;
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (in != null) {
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    	
    	getChampKillEvents();

    }
    
    public static  ArrayList<ChampKillEvent> getChampKillEvents () throws InterruptedException{
    	ArrayList<ChampKillEvent> events = new ArrayList<ChampKillEvent>();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("matches_detail.txt"));
            String line;
            JsonObject matchInReview;

            while ((line = in.readLine()) != null) {
            	matchInReview = ParserHelper.getJsonObject(line);
            	JsonArray framesInMatch = matchInReview.getAsJsonObject("timeline").getAsJsonArray("frames");
                    for (JsonElement frame : framesInMatch) {
                    	JsonArray eventsInReview = frame.getAsJsonObject().getAsJsonArray("events");
                    	if(eventsInReview != null){
                        	updateChampKilleventList(events, eventsInReview);
                    	}
                    }
            }
            System.out.println("lista " + events);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		return events;

    }

	private static void updateChampKilleventList(ArrayList<ChampKillEvent> events, JsonArray eventsInReview) {
		ChampKillEvent champKillEvent = new ChampKillEvent();
        for (JsonElement eventInReview : eventsInReview) {
        	String eventType = eventInReview.getAsJsonObject().get("eventType").getAsString();
        	if("CHAMPION_KILL".equals(eventType)){
        		champKillEvent.setTimestamp(eventInReview.getAsJsonObject().get("timestamp").getAsLong());
        		champKillEvent.setKillerId(eventInReview.getAsJsonObject().get("killerId").getAsInt());
        		champKillEvent.setVictimId(eventInReview.getAsJsonObject().get("victimId").getAsInt());
        		champKillEvent.setX(eventInReview.getAsJsonObject().get("position").getAsJsonObject().get("x").getAsInt());
        		champKillEvent.setY(eventInReview.getAsJsonObject().get("position").getAsJsonObject().get("y").getAsInt());
        		events.add(champKillEvent);
        		System.out.println("Tamaño actual de lista asesinatos:  " + events.size());
        	}
        }		
	}
   
}
    
    

