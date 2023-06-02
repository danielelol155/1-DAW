import java.util.Map;
import java.util.HashMap;

public class recorrer {
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();
      
        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "www.geeksforgeeks.org");
          
        // Forma 1
        for (Map.Entry<String,String> entry : gfg.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());


    }
}
