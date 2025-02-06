package jungsuk.chap07;

interface Movable {
    void move(int x, int y);
}

interface Attackable{
    void attack(Unit U);
}

interface Fightable extends Movable, Attackable{

}

class Unit{
    int currentHP;   // 유닛 체력
    int x;           // 유닛 좌표
    int y;
}

class Fighter extends Unit implements Fightable{
    public void move(int x, int y) {

    }
    public void attack(Unit u){

    }
}

class FighterTest {
    public static void main (String[] args){
        Fighter f = new Fighter();

        if (f instanceof Unit){
            System.out.println("f는 Unit클래스의 자손");
        }
        if (f instanceof Fightable){
            System.out.println("f는 Fightable 인터페이스를 구현");
        }
        if (f instanceof Movable){
            System.out.println("f는 Movable 인터페이스를 구현");
        }
        if (f instanceof Attackable){
            System.out.println("f는 Attackable 인터페이스를 구현");
        }
        if (f instanceof Object){
            System.out.println("f는 Object 인터페이스를 구현");
        }
    }
}