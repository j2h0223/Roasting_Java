@FunctionalInterface
interface MyFunction{
    void myMethod();
}

class Outer{
    int val = 20;       // Outer.this.val

    class Inner{
        int val = 20;       // this.val

        void method(int i){         // void method (final int i)
            int val = 30;       // final int val = 30;
//            i = 10;             // error. 상수 값 변경 불가. sout(i)에서 오류 발생

            MyFunction f = () -> {
                System.out.println("             i : " + i++);        // 여기
                System.out.println("           val : " + val);
                System.out.println("      this.val : " + ++this.val);
                System.out.println("Outer.this.val : " + ++Outer.this.val);
            };

            f.myMethod();

        }
    }   // class Inner
}   // class Outer

class LambdaEx3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}
