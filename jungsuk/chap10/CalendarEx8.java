package jungsuk.chap10;

class CalendarEx8 {
    public static void main(String[] args) {
        String date1 = "202502";
        String date2 = "202401";

        // 년과 월을 substring으로 잘라 정수로 변환
        // 년에 12를 곱해 월로 변환 후 뺄셈을 통해 개월차 계산
        int month1 = Integer.parseInt(date1.substring(0, 4)) * 12
                + Integer.parseInt(date1.substring(4));
        int month2 = Integer.parseInt(date2.substring(0, 4)) * 12
                + Integer.parseInt(date2.substring(4));

        System.out.println(date1 + "과 " + date2 + "의 차이는 " + Math.abs(month1 - month2) + "개월 입니다.");
    }
}
