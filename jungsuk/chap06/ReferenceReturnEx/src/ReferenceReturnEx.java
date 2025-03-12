class Data_ReferReturn{
    int x;
}

public class ReferenceReturnEx {
    public static void main(String[] args){
        Data_ReferReturn d = new Data_ReferReturn();
        d.x = 10;

        Data_ReferReturn d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d.x = " + d2.x);
    }

    static Data_ReferReturn copy(Data_ReferReturn d){
        Data_ReferReturn temp = new Data_ReferReturn();
        temp.x = d.x;

        return temp;  // 복사한 객체의 주소를 반환
    }
}
