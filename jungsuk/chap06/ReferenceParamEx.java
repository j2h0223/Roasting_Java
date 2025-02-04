package jungsuk.chap06;

class DataRefer{
    int x;
}

public class ReferenceParamEx {
    public static void main(String[] args){
        DataRefer d = new DataRefer();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    } // main end

    static void change(DataRefer d){
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
