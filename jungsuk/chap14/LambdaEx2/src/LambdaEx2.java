@FunctionalInterface
interface MyFunction {
    void myMethod();        // public abstract void myMethod();
}

class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {};            // MyFunction f = (MyFunction) (()->{});
        Object obj = (MyFunction)(()->{});  // Object 타입으로 형변환이 생략됨
        String str = ((Object)(MyFunction)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//        System.out.println(()->{});
            // error. 람다식은 Object타입으로 행변환 안됨
        System.out.println((MyFunction)(()->{}));
//        System.out.println((MyFunction)(()->{}).toString());
            // error.
        System.out.println(((Object) (MyFunction)(()->{})).toString());
    }
}
