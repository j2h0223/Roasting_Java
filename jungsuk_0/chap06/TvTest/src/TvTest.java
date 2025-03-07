class Tv {
    // Tv의 속성 (맴버 변수)
    String color;   // 색상
    boolean power;  // 전원상태 (on/off)
    int channel;    // 채널

    // Tv의 기능 (메서드)
    void power() {
        power = !power;
    } // TV를 켜거나 끄는 기능을 하는 매서드
    void channelUp() {
        ++channel;
    } // TV의 채널을 높이는 기능을 하는 매서드
    void channelDown() {
        --channel;
    } // TV의 채널을 낮추는 기능을 하는 매서드
}

class TvTest {
    public static void main(String[] args){
        Tv t;                   // Tv 인스턴스를 위한 참조변수 선언
        t = new Tv();           // Tv 인스턴스 생성
        t.channel = 7;          // 인스턴스의 맴버변수 channel의 값을 7로 할당
        t.channelDown();        // 인스턴스 매서드 channelDown() 호출
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}