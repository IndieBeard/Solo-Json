/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package solojson;

import java.io.File;
import java.io.FileNotFoundException;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
//import solojson.Student;

/**
 *
 * @author andyr
 */
public class SoloJSON {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) throws IOException {
        objToJSON();
    }
    
    static void objToJSON() throws FileNotFoundException, IOException{
    //String _fName, String _lName, double _GPA, int _currentCredits, int _totalCredits
        Student[] students = new Student[3];
    
    
        students[0] = new Student("Andy", "Robert", 4.0, 140, 155);
        students[1] = new Student("John", "Smith", 4.0, 135, 155);
        students[2] = new Student("Jane", "Doe", 4.0, 24, 155);
        
        
        JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();
        
        for (Student student : students) {
            jsonArrayBuilder.add(Json.createObjectBuilder()
                .add("fName", student.getFName())
                .add("lName", student.getLName())
                .add("GPA", student.getGPA())
                .add("currentCredits", student.getCCredits())
                .add("totalCredits", student.getTCredits())
            );
        }

        //Return the json array holding employee details
        JsonArray studentsArray = jsonArrayBuilder.build();

        //Create new file
        //File file = new File("Students.json");
        //if(!file.exists())
        //    file.createNewFile();
        //write the array to file
        //OutputStream outputStream = new FileOutputStream(file);
        OutputStream outputStream = new FileOutputStream("Students.json");
        JsonWriter jsonWriter = Json.createWriter(outputStream);
        jsonWriter.writeArray(studentsArray);

        //Close the stream to clean up the associated resources
        outputStream.close();
        jsonWriter.close();

    }
}
