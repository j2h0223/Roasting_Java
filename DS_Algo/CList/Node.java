package DS_Algo.CList;

class Node {
    Integer data;
    Node nextNode;

    Node(){
        data = null;
        nextNode = null;
    }

    Node(Integer data){
        this.data = data;
        nextNode = null;
    }
}

abstract class List {
    Node tail;
    int size;

    abstract void add(Integer data, boolean Tail);      // 노드 삽입
    abstract void insertAt(int index, Integer data);    // 특정 위치에 삽입

    // 노드 삭제 메서드
    abstract Integer remove(boolean Tail);              // 노드 삭제
    abstract Integer removeAt(int index);               // 특정 위치 노드 삭제

    // 조회 및 탐색 메서드
    abstract boolean contains(Integer data);            // 특정 데이터 포함 여부 확인
    abstract int indexOf(Integer data);                 // 특정 데이터의 인덱스 반환
    abstract Integer get(int index);                    // 특정 위치의 데이터 반환

    // 기타 메서드
    abstract int size();                                // 리스트 크기 반환
    abstract boolean isEmpty();                         // 리스트가 비었는지 확인
    abstract void clear();                              // 리스트 초기화
    abstract void display();                            // 리스트 내 노드 수 반환
}