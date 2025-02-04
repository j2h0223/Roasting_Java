package jungsuk.chap06;

class MyMath2{
    long a, b;

    // 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다
    long add() {
        return a + b;
    }
    long subtract () {
        return a - b;
    }
    long multiply () {
        return a * b;
    }
    long divide () {
        return a / b;
    }

    // 인스턴스변수와 관계없이 매개변수만으로 작업 가능
    static long add (long a, long b){
        return a + b;
    }
    static long subtract (long a, long b){
        return a - b;
    }
    static long multiply (long a, long b){
        return a * b;
    }
    static long divide (long a, long b){
        return a / b;
    }
}

public class MyMathTest2 {
    public static void main (String[] args){
        // 클래스매서드 호출. 인스턴스 생성 없이 호출가능
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;

        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
