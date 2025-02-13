package DS_Algo.List;

class Node {
    Integer data;
    Node nextNode;

    Node() {
        data = null;
        nextNode = null;
    }

    Node(Integer data) {
        this.data = data;
        nextNode = null;
    }
}

abstract class List {
    Node head;
    int numOfNode;

    abstract void initList();                // 리스트 초기화
    abstract boolean isEmpty();              // list empty check
    abstract void add(Integer data);         // 노드 추가
    abstract Node get(Integer key);          // 특정 값을 가진 노드 반환
    abstract void remove();                  // 노드 삭제
    abstract void remove(Node delNode);      // 특정 노드 삭제
    abstract void clear();                   // 리스트 삭제
    abstract void printList();               // 리스트 출력
    abstract int size();                     // 리스트 내 노드 수 반환
}

