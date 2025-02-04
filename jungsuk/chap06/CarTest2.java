package jungsuk.chap06;

class Car {
    String color;       // 색상
    String gearType;    // 변속기 종류 - auto, manual
    int door;           // 문 개수

    Car(){
        this("white", "auto", 4);
    }

    Car(String color){
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car(Car c){  // 인스턴스 복사를 위한 생성자
//        color = c.color;
//        gearType = c.gearType;
//        door = c.door;
        this(c.color, c.gearType, c.door);
    }
}

public class CarTest2 {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("blue");
        Car c3 = new Car(c2);

        System.out.println("c1의 color = " + c1.color + ", gearType = "
                + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = "
                + c2.gearType + ", door = " + c2.door);

        c2.door = 2;
        System.out.println("c2의 color = " + c2.color + ", gearType = "
                + c2.gearType + ", door = " + c2.door);
        System.out.println("c3의 color = " + c3.color + ", gearType = "
            + c3.gearType + ", door = " + c3.door);
    }
}
