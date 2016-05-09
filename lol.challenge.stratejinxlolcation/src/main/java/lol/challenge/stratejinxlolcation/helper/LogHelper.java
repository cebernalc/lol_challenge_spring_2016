/**
 * LogHelper.java
 * 
 * Created on Oct 18, 2013, 7:25:04 AM
 */
package lol.challenge.stratejinxlolcation.helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * {Insert class description here}
 * 
 * @author Carlos Bernal
 * @since Oct 18, 2013
 */
public class LogHelper {

    private static LogHelper INSTANCE;
    private static Writer output;
    private boolean printLog = true;

    private LogHelper() {
    }

    private static void createFile(String fileName) {
	// System.out.println("new object " + fileName);
	try {
	    System.out.println(fileName);
	    System.out.println(fileName.substring(0, fileName.lastIndexOf(File.separator)));
	    File f = new File(fileName.substring(0, fileName.lastIndexOf(File.separator)));
	    if (!f.exists()) {
		f.mkdirs();
		f.createNewFile();
	    }
	    output = new BufferedWriter(new FileWriter(fileName, true));
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static LogHelper getInstance() {
	return getInstance("Log.log");
    }

    public static LogHelper getInstance(String fileName) {
	createFile(fileName);
	if (INSTANCE != null) {
	    return INSTANCE;
	} else {
	    INSTANCE = new LogHelper();
	    return INSTANCE;
	}
    }

    public void addLine(String line) {
	try {
	    output.append(line);
	    output.append("\n");
	    if (printLog) {
		System.out.println(line);
	    }
	    output.flush();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public void printLog(boolean print) {
	printLog = print;
	if (print) {
	    System.out.println("Log ON console");
	} else {
	    System.out.println("Log OFF console");
	}
    }
}
