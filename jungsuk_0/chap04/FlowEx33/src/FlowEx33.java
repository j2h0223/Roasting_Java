public class FlowEx33 {
    public static void main(String[] args) {
        Loop1: // for문에 Loop1이라는 이름을 붙임
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5)
                    break Loop1;
//                    break;
//                    continue Loop1;
//                    continue;
                System.out.println(i + "*" + j + "=" + i * j);
            } // end of for i
            System.out.println();
        } // end of Loop1
    }
}
