package DS_Algo.CList;

class CLinkedListMain {
    public static void main(String[] args) {
        CLinkedList cll = new CLinkedList();

        cll.addTail(7);
        cll.addHead(3);
        cll.addTail(1);
        cll.addTail(4);
        cll.addHead(2);
        cll.addTail(9);
        cll.addHead(5);

        cll.insertAt(1,8);

        cll.display();
        System.out.println(cll.size());

        cll.removeHead();
        cll.removeTail();

        cll.display();
        System.out.println(cll.size());

        cll.removeAt(4);

        cll.display();
        System.out.println(cll.size());

        if(cll.contains(9)){
            System.out.println("9 exists.");
        }else {
            System.out.println("9 doesn't exist.");
        }
        if(cll.contains(7)){
            System.out.println("7 exists.");
        }
        else{
            System.out.println("7 doesn't exists.");
        }

        cll.display();
        System.out.println(cll.size());

        System.out.println(cll.get(6));

        cll.clear();
        System.out.println(cll.size());
        cll.display();
    }
}