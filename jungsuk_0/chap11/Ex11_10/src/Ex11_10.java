import java.util.*;

class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            set.add(Integer.valueOf((int) (Math.random() * 45) + 1));
        }

        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
