package DS_Algo.CList;

class CLinkedList extends List {

    CLinkedList() {
        clear();
    }

    CLinkedList(Integer data) {
        clear();

        Node newNode = new Node(data);

        tail = newNode;
        newNode.nextNode = newNode;
        size++;
    }

    @Override
    void add(Integer data, boolean Tail) {
        if (isEmpty()) {
            Node newNode = new Node(data);

            tail = newNode;
            newNode.nextNode = newNode;
        } else {
            Node newNode = new Node(data);

            newNode.nextNode = tail.nextNode;
            tail.nextNode = newNode;
            if (Tail) {
                tail = newNode;
            }
        }

        size++;
    }

    void addHead(Integer data) {
        add(data, false);
    }

    void addTail(Integer data) {
        add(data, true);
    }


    @Override
    void insertAt(int index, Integer data) {
        if (isEmpty()) {
            addTail(data);
            return;
        }

        Node newNode = new Node(data);

        Node current = tail;
        for (int i = 0; i < index; i++) {
            current = current.nextNode;
        }
        newNode.nextNode = current.nextNode;
        current.nextNode = newNode;

        size++;
    }

    @Override
    Integer remove(boolean Tail) {
        Integer delData;
        Node before = tail;
        Node current = tail.nextNode;

        if (Tail) {
            while (!current.equals(tail)) {
                before = current;
                current = current.nextNode;
            }
            before.nextNode = current.nextNode;
            tail = before;
        } else {
            before.nextNode = current.nextNode;
        }
        delData = current.data;
//        current = null;
        size--;

        return delData;
    }

    void removeHead() {
        remove(false);
    }

    void removeTail() {
        remove(true);
    }


    @Override
    Integer removeAt(int index) {
        Integer delData;
        Node before = tail;
        Node current = tail.nextNode;

        for (int i = 0; i < index; i++) {
            before = current;
            current = current.nextNode;
        }
        delData = current.data;
        before.nextNode = current.nextNode;

//        current = null;
        size--;

        return delData;
    }

    @Override
    boolean contains(Integer data) {
        Node current = tail.nextNode;

        for (int i = 0; i < size(); i++) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.nextNode;
        }

        return false;
    }

    @Override
    int indexOf(Integer data) {
        int index;
        Node current = tail.nextNode;

        for (index = 0; index < size(); index++) {
            if (current.data.equals(data)) {
                break;
            }
            current = current.nextNode;
        }

        return index;
    }

    @Override
    Integer get(int index) {
        Node current = tail.nextNode;

        for (int i = 0; i < index; i++) {
            current = current.nextNode;
        }

        return current.data;
    }

    @Override
    int size() {
        return size;
    }

    @Override
    boolean isEmpty() {
        return size() < 1;
    }

    @Override
    void clear() {
        tail = null;
        size = 0;
    }

    @Override
    void display() {
        if (isEmpty()) {
            System.out.println("Empty list");
        } else {
            Node current = tail.nextNode;
            for (int i = 0; i < size(); i++) {
                System.out.print(current.data + ", ");
                current = current.nextNode;
            }
            System.out.println();
        }
    }
}
