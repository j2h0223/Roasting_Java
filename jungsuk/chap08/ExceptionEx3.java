package jungsuk.chap08;

class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException ae) {
                ae.printStackTrace();
                System.out.println("예외 메시지 : " + ae.getMessage());
//                System.out.println(ae);
                System.out.println("inf");
            } // try-catch end
        } // for end
    }
}
