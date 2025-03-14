/*
새로 생성한 쓰레드에서 고의로 예외를 발생시키고 printStackTrace()를 이용해 예외가 발생한 당시의 호출스택 출력
main Thread의 호출스택은 main이 이미 종료됐기 때문에 없다.
 */

class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();
    }
}

class ThreadEx2_1 extends Thread{
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
