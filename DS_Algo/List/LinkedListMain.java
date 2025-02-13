package DS_Algo.List;

import java.util.NoSuchElementException;

class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(2);
        list.add(1);
        list.add(4);
        list.add(5);
        list.printList();
        list.remove();
        list.remove(list.get(1));
        try {
            list.get(8);
        } catch (NoSuchElementException NoElement) {

        }
        list.printList();
        System.out.println(list.size());
        list.clear();
        list.printList();
    }
}
