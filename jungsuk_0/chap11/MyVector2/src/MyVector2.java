import java.util.*;

public class MyVector2 extends MyVector implements Iterator {

    int cursor = 0;
    int lastRet = -1;

    public MyVector2(int capacity) {
        super(capacity);
    }

    public MyVector2() {
        this(10);
    }

    @Override
    public String toString() {
        String tmp = "";
        Iterator it = iterator();

        for (int i =0; it.hasNext(); i++){
            if(i!=0){
                tmp += ", ";
            }
            tmp += it.next();   // tmp += next().toString();
        }
        return "[" + tmp + "]";
    }

    public Iterator iterator(){
        cursor = 0;     // cursor와 lastRet을 초기화
        lastRet = -1;
        return this;
    }

    @Override
    public boolean hasNext() {
        return cursor != size();
    }

    @Override
    public Object next() {
        Object next = get(cursor);
        lastRet = cursor++;
        return next;
    }

    @Override
    public void remove() {
        // 더 이상 삭제할 것이 없으면 IllegalStateException를 발생시킴
        if (lastRet == -1){
            throw new IllegalStateException("empty iterator");
        }
        else{
            remove (lastRet);
            cursor --;      // 삭제 후에 cursor 의 위치 초기화
            lastRet = -1;   // lastRet의 값 초기화
        }
    }
} // class
