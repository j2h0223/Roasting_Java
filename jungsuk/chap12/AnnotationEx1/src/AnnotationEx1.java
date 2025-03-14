class Parent{
    void parentMethod(){

    }
}

class Child extends Parent{
//    @Override
//    void parentmethod(){
//
//    }

    @Override
    void parentMethod() {
        super.parentMethod();
    }
}


public class AnnotationEx1 {
    public static void main(String[] args) {
        System.out.println();
    }
}
