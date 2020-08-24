package restcountries.getcountries;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;

import org.testng.annotations.Test;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;




public class Readjsonfromfile 
{
	@Test
    public void writeData() throws FileNotFoundException, IOException 
    {  
		
		BufferedWriter writer = Files.newBufferedWriter(Paths.get("payload.json"));
        
        
        JsonObject cake = new JsonObject();
        cake.put("id", "001");
        cake.put("type", "donut");
        cake.put("name", "cake");
        
        
        JsonObject batters = new JsonObject();
        batters.put("id", "1001");
        batters.put("type", "Regular");
        
        cake.put("batters",batters);
        
        JsonArray topping = new JsonArray();
        JsonObject p1 = new JsonObject();
        p1.put("id", "5001");
        p1.put("type","None");
        
        JsonObject p2 = new JsonObject();
        p2.put("id", "5002");
        p2.put("type","Glazed");
        
        JsonObject p3 = new JsonObject();
        p3.put("id", "5005");
        p3.put("type","Sugar");
        
        JsonObject p4 = new JsonObject();
        p4.put("id", "5007");
        p4.put("type","Powered Sugar");
        
        JsonObject p5 = new JsonObject();
        p5.put("id", "5006");
        p5.put("type","Chocolate with sprinkles");
        
        JsonObject p6 = new JsonObject();
        p6.put("id", "5003");
        p6.put("type","Chocolate");
        
        JsonObject p7 = new JsonObject();
        p7.put("id", "5004");
        p7.put("type","Maple");
        
        
        topping.addAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7));
        
        cake.put("topping",topping);
        
        Jsoner.serialize(cake, writer); 
        
        writer.close();   
        
    }
	@Test(dependsOnMethods="writeData")
    public void readData() throws FileNotFoundException, IOException, JsonException 
    {   	 
		
		
		Reader reader = Files.newBufferedReader(Paths.get("payload.json"));
		JsonObject jsonobject = (JsonObject) Jsoner.deserialize(reader);
		String id = (String)jsonobject.get("id");
        String type = (String)jsonobject.get("type");
        
        
        System.out.println("id: " +id);
        System.out.println("type: " +type);
       
		
        
       // Map<Object, Object> address = (Map<Object, Object>) jsonobject.get("batters");
       // address.forEach((key, value) -> System.out.println("Batters :"+key + ": " + value));
        
      
        JsonArray projects = (JsonArray) jsonobject.get("topping");
        
       // JsonPath
        
        for(Object a : projects)
        {
        	System.out.println(a);
        }
        
       // projects.forEach(entry -> {
         //   JsonObject project = (JsonObject) entry;
          //  System.out.println(project.get("id"));
           // System.out.println(project.get("type"));
       // });
      
    }
		
	
       
      
     }
 
