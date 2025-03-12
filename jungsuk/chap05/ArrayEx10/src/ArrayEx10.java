public class ArrayEx10 {
    public static void main(String[] args){
         int[] numArr = new int[10];

         for (int i = 0; i < numArr.length; i++){
             System.out.print(numArr[i] = (int)(Math.random() * 10));
         }
         System.out.println();

         for (int i = 0; i < numArr.length-1; i++){
             boolean changed = false; // 자리바꿈 유무확인

             for (int j = 0; j < numArr.length - 1 - i; j++){
                if (numArr[j] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    changed = true;  // 자리바꿈 발생

//                    System.out.print("\t");
//                    for (int k : numArr){ // 향상된 for
//                        System.out.print(numArr[k]);
//                    }
//                    System.out.println();
                }
             } // end for j

             if(!changed){ // 자리 바꿈이 없으면 반복문 종료
                 break;
             }
//             System.out.println();

//             for (int k = 0; k < numArr.length; k++){
             for(int k : numArr){ // 향상된 for
                System.out.print(numArr[k]);
             }
             System.out.println();
         } // end for i
    }
}
