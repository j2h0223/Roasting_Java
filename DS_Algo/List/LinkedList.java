package DS_Algo.List;

//import java.io.*;

import java.util.*;

//import DS_Algo.List.Node.*;

class LinkedList extends DS_Algo.List.List {

    LinkedList() {
        initList();
    }

    LinkedList(Integer data) {
        initList();
        add(data);
    }

    @Override
    void initList() {
        // 리스트 초기화
        head = new Node();  // 더미 노드 생성
        numOfNode = 0;
    }

    @Override
    boolean isEmpty() {
        // list empty check
        return numOfNode < 1;
    }

    @Override
    void add(Integer data) {
        // 노드 추가 (head에 추가)
        Node newNode = new Node(data);

        newNode.nextNode = head.nextNode;
        head.nextNode = newNode;

        numOfNode++;
    }

    @Override
    Node get(Integer key) throws NoSuchElementException {
        // 특정 값을 가진 노드의 이전 노드 반환
        if (isEmpty()) {
            throw new NoSuchElementException("Empty List.");
        }

        Node prevNode = head;

        while (prevNode.nextNode != null) {
            if (prevNode.nextNode.data.equals(key)) {
                return prevNode;
            }
            prevNode = prevNode.nextNode;
        }

        throw new NoSuchElementException(key + " isn't exist.");
    }

    @Override
    void remove() throws NoSuchElementException{
        // 노드 삭제
        if (isEmpty()) {
            throw new NoSuchElementException("Empty List.");
        }

        Node delNode = head.nextNode;
        head.nextNode = delNode.nextNode;
        delNode = null;

        numOfNode--;
    }


    @Override
    void remove(Node prevNode) {
        // 특정 노드 삭제
        Node delNode = prevNode.nextNode;
        prevNode.nextNode = delNode.nextNode;
        delNode = null;

        numOfNode--;
    }

    @Override
    void clear() {
        // 리스트 삭제
        Node delNode= head;

        while(delNode != null){
            head = delNode.nextNode;
            delNode = null;
            delNode = head;
            numOfNode--;
        }
    }

    @Override
    void printList() {
        // 리스트 출력
        if (numOfNode < 1){
            System.out.println("Empty list");
            return;
        }

        Node currentNode = head;
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
            System.out.print(currentNode.data + " ");
        }
        System.out.println();
    }

    @Override
    int size() {
        // 리스트 내 노드 수 반환
        return numOfNode;
    }
}
