import javax.lang.model.type.ArrayType;
import java.util.*;

import static java.util.Collections.*;

class CollectionsEx {
    public static void main(String[] args) {
        System.out.println();

        List list = new ArrayList();
        System.out.println(list);
        System.out.println();


        addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);
        System.out.println();

        rotate(list, 2);        // 오른쪽으로 두 칸씩 이동
        System.out.println(list);
        System.out.println();

        swap(list, 0, 2);          // 첫번째와 세번째를 교환
        System.out.println(list);
        System.out.println();

        shuffle(list);                  // 저장된 요소의 위치를 임의로 변경
        System.out.println(list);
        System.out.println();

        sort(list, reverseOrder());     // 역순 정렬 reverse(list);와 동일
        System.out.println(list);
        System.out.println();

        sort(list);                     // 정렬
        System.out.println(list);
        System.out.println();

        int idx = binarySearch(list, 3);    // 3이 저장된 위치(index)를 반환
        System.out.println("index of 3 = " + idx);
        System.out.println();

        System.out.println("max = " + max(list));
        System.out.println("min = " + min(list));
        System.out.println("min = " + max(list, reverseOrder()));
        System.out.println();

        fill(list, 9);              // list를 9로 채운다.
        System.out.println(list);
        System.out.println();

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경 불가
        List newList = nCopies(list.size(), 2);
        System.out.println("newList = " + newList);
        System.out.println();

        System.out.println(disjoint(list, newList));    // 공통요소가 없으면 true
        System.out.println();

        copy(list, newList);
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);
        System.out.println();

//        replaceAll(newList, 2, 1);
//        System.out.println("newList = " + newList);
//        System.out.println();
        // 변경 불가

        replaceAll(list, 2, 1);
        System.out.println("list = " + list);
        System.out.println();

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);
        System.out.println();

        System.out.println("list2 = " + list2);
        System.out.println();
    }

}
