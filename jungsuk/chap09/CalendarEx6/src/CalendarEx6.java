import java.util.*;

class CalendarEx6 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java CalendarEx6 2025 2");
            return;
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance();     // 시작일
        Calendar eDay = Calendar.getInstance();     // 종료일

        // 월의 경우 0부터 11까지의 값
        // 2025.2.22 : sDay.set(2025.1.22);
        sDay.set(year, month - 1, 1);
//        eDay.set(year, month, 1);
        eDay.set(year, month, sDay.getActualMaximum(Calendar.DATE));

        // 첫째 요일이 어떤 요일인지 저장
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
//        System.out.println(START_DAY_OF_WEEK);

        // 월의 첫날에 하루를 빼면 전달의 마지막날
//        eDay.add(Calendar.DATE, -1);
        // eDay에 지정된 날짜 반환 및 저장
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("      " + args[0] + "년 " + args[1] + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 1일이 어느 요일인지에 따라 공백 출력
        // 만일 1일이 수요일이라면 공백을 세 번 출력
        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.print("   ");
        }

        for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if (n % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
