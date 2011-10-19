/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agiles;

/**
 *
 * @author Berra
 */
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
 
public class GsonExample {
    public static void main(String[] args) {
 
	DataObject obj = new DataObject();
	Gson gson = new Gson();
 
	// convert java object to JSON format,
	// and returned as JSON formatted string
	String json = gson.toJson(obj);
 
	try {
		//write converted json data to a file named "file.json"
		FileWriter writer = new FileWriter("/Users/Berra/Desktop/file.json");
		writer.write(json);
		writer.close();
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
	System.out.println(json);
 
    }
}