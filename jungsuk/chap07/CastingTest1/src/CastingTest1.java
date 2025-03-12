class CastingTest1 {
    public static void main(String[] args){
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   // car = (car)fe;
//        car.water();
        fe2 = (FireEngine)car;
        fe2.water();
    }
}

class Car{
    String color;
    int door;

    void drive(){   // 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop(){    // 멈추는 기능
        System.out.println("Stop!!!");
    }
}

class FireEngine extends Car{
    void water(){   // 물뿌리는 기능
        System.out.println("water!!!");
    }
}