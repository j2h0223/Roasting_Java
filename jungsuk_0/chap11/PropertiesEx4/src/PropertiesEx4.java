import java.util.*;

class PropertiesEx4 {
    public static void main(String[] args){
        Properties sysProp = System.getProperties();
        System.out.println("java.version : " + sysProp.getProperty("java.version"));
        System.out.println("user.languaage : " + sysProp.getProperty("user.language"));
        System.out.println();
        sysProp.list(System.out);
    }
}
