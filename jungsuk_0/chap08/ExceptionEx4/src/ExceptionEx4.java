class ExceptionEx4 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시킴");
            throw e;    // 예외 발생
//            throw new Exception("고의로 발생시킴");
        } catch (Exception e){
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
