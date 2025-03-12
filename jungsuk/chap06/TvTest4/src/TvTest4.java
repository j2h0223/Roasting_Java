class TvTest4 {
    public static void main(String[] args){
        Tv4[] tvArr = new Tv4[3];  // 길이가 3인 Tv 객체 배열

        // Tv 객체를 생성해서 Tv객체 배열의 각 요소에 저장
        for (int i = 0; i < tvArr.length; i++){
            tvArr[i] = new Tv4();
            tvArr[i].channel = i + 10;
        }

        for (int i = 0; i < tvArr.length; i++){
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
        }
    } // main 종료
}

class Tv4{
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}
