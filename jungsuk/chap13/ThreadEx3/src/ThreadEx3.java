/*
run()을 이용해 호출해 새로운 call stack이 생성되지 않고,
main Thread의 호출스택 위에 run()이 생성되었다.
따라서 main 메서드가 포함되어 있다.
 */

class ThreadEx3 {
    public static void main(String[] args) {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();
    }
}

class ThreadEx3_1 extends Thread{
    public void run(){
        throwException();
    }
    public void throwException(){
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
