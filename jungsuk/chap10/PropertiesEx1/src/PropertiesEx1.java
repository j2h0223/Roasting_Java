import java.util.*;

class PropertiesEx1 {
    public static void main(String[] args){
        Properties prop = new Properties();

        // prop에 키, 값 저장
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        // prop에 저장된 요소들을 Enumeration을 이용해 출력
        Enumeration e = prop.propertyNames();

        while(e.hasMoreElements()){
            String element = (String)e.nextElement();
            System.out.println(element + "=" + prop.getProperty(element));
        }

        System.out.println();
        prop.setProperty("size", "20");     // size 값 변경
        System.out.println("size = " + prop.getProperty("size"));
        System.out.println("capacity = " + prop.getProperty("capacity", "20"));
        System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));

        System.out.println();
        System.out.println(prop);       // prop에 저장된 요소들을 출력한다
        System.out.println();
        prop.list(System.out);          // prop에 저장된 요소들을 화면(System.out)에 출력



        System.out.println();
    }
}
