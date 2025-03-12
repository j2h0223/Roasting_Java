import java.util.*;
import java.io.*;

class PropertiesEx3 {
    public static void main(String[] args){
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "한글");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        try{
            prop.store(new FileOutputStream("jungsuk_0/chap11/PropertiesEx3/out/output.txt"), "Properties Example");
            prop.storeToXML(new FileOutputStream("jungsuk_0/chap11/PropertiesEx3/out/output.xml"), "Properties Example" );
        }catch(IOException e){
            e.printStackTrace();
        }

    }   // main end
}
