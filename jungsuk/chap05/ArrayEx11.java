package jungsuk.chap05;

public class ArrayEx11 {
    public static void main(String[] args){
        int[] numArr = new int[10];
        int[] counter = new int[10];

//        for (int i=0; i < numArr.length; i++){
        for (int i : numArr){ // 향상된 for
//            numArr[i] = (int)(Math.random() * 10);
//            System.out.print(numArr[i]);
            System.out.print(numArr[i] = (int)(Math.random()*10));
        }
        System.out.println();

//        for (int i = 0; i < numArr.length; i++){
        for(int i : numArr){ // 향상된 for
            counter[numArr[i]]++;
        }

        for (int i =0; i < numArr.length; i++){
            System.out.println(i + "의 개수 : " + counter[i]);
        }
    } // end main
}
