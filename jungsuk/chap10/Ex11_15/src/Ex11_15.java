import java.util.*;

class Ex11_15 {
    public static void main (String[] args){
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for(int i = 0; i < score.length; i++){
            set.add(Integer.valueOf(score[i]));     // set.add(score[i]); 도 가능
        }

        System.out.println("50보다 작은 값 : " + set.headSet(Integer.valueOf(50)));
        System.out.println("50보다 큰 값 : " + set.tailSet(Integer.valueOf(50)));
    }
}
