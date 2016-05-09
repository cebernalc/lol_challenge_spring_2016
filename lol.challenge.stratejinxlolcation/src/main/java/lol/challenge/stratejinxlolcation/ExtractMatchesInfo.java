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

import lol.challenge.stratejinxlolcation.helper.LogHelper;
import lol.challenge.stratejinxlolcation.helper.RequestDataHelper;

/**
 * {Insert class description here}
 *
 * @author Carlos Bernal
 * @since May 8, 2016
 */
public class ExtractMatchesInfo {
    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("matches.txt"));
            String line;
            boolean half = false;
            while ((line = in.readLine()) != null) {
                if (half) {
                    String response = RequestDataHelper.getMatchesDetail(line);
                    LogHelper.getInstance("matches_detail.txt").addLine(response);
                    System.out.println(line + ": done!");
                    Thread.sleep(4 * 1000);
                }
                if (line.equals("269375204")) {
                    half = true;
                }
            }
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

    }
}
