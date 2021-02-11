import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.io.*;

public class EntryPoint {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream input = new FileInputStream("src/runtime.properties");
        Properties props = new Properties();
        props.load(input);
        System.out.println(props.getProperty("custIdRange"));
    }


}
