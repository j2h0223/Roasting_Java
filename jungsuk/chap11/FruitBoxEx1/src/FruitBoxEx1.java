import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

class FruitBoxEx1 {
    public static void main(String[] args) {
//        Box<? extends Fruit> box = new Box<Apple>();
//        box.add(new Fruit());
//        box.add(new Apple());
//        Box<? super Apple> box1 = new Box<Fruit>();
//        box.add(new Fruit());
//        box.add(new Apple());

//        1. Box<? super Apple>의 의미:
//
//        Box<? super Apple>은 Apple 클래스 또는 Apple 클래스의 상위 클래스(Fruit, Object 등)의 Box를 의미합니다.
//                즉, Box<Apple>, Box<Fruit>, Box<Object> 등이 될 수 있습니다.
//                컴파일러는 box1이 정확히 어떤 타입의 Box인지 알 수 없습니다. 단지 Apple의 상위 타입 중 하나라는 것만 알고 있습니다.
//        2. box1.add(new Apple())에서 오류가 발생하는 이유:
//
//        box1이 Box<Fruit>로 초기화되었지만, 컴파일러는 box1이 Box<Object>일 수도 있다고 가정합니다.
//                만약 box1이 Box<Object>라면 Apple 객체를 추가하는 것은 타입 안전성을 위반하지 않습니다.
//        그러나, box1이 Box<Apple>이 될 수도 있습니다.
//                만약 box1이 Box<Apple>이라면 Apple 객체를 추가하는 것은 타입 안전성을 위반하지 않습니다.
//        따라서 컴파일러는 box1.add(new Apple()) 메서드 호출을 허용합니다.

        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
//        Box<Grape> grapeBox = new Box<Apple>();   // 에러. 타입 불일치.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());      // OK. void add(Fruit item)

        appleBox.add(new Apple());
        appleBox.add(new Apple());
//        appleBox.add(new Toy());      // error. Box<Apple>에는 Apple만 담을 수 있음.

        toyBox.add(new Toy());
//        toyBox.add(new Apple());      // error. Box<Toy>에는 Apple만 담을 수 없음.

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }   // main end
}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    int size(){
        return list.size();
    }
    public String toString(){
        return list.toString();
    }
}