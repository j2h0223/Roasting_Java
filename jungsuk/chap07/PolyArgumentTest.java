package jungsuk.chap07;

import java.util.*;

class Product {
    int price;          // 제품 가격
    int bonusPoint;     // 제품 구매 시 제공하는 보너스 점수

    Product() {
        this.price = 0;
        this.bonusPoint = 0;
    }

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);     // 제품가격의 10%
    }
}

class Book extends Product {
    Book() {
        super(100);
    }

    public String toString() {
        return "Book" + " (" + this.price + ")";
    }
}

class Audio extends Product {
    Audio() {
        super(10);
    }

    public String toString() {
        return "Audio" + " (" + this.price + ")";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer" + " (" + this.price + ")";
    }
}

class Buyer {
    private int money;
    private int bonusPoint;
    //    private Product[] item = new Product[10];   // 구입한 제품을 저장하기 위한 배열
//    private int itemCounter = 0;
    private Vector item = new Vector();

    Buyer() {
        this.money = 1000;
        this.bonusPoint = 0;
    }

    void buy(Product p) {
        if (this.money < p.price) {
            System.out.println("잔액이 부족합니다");
            return;
        }

        this.money -= p.price;
        this.bonusPoint += p.bonusPoint;
//        item[itemCounter++] = p;
        item.add(p);    // 구입한 제품을 Vector에 저장
        System.out.println(p + "을/를 구입");
    }

    void refund(Product p) {
        if (item.remove(p)) {        // 제품을 Vector 객체제어 제거
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품");
        } else {
            System.out.println("구입 목록 중 해당 제품 없음");
        }
    }

    void currentMoneyBonus() {
        System.out.println("현재 잔액 : " + this.money);
        System.out.println("현재 보너스포인트 : " + this.bonusPoint);
    }

    void summary() {             // 구매한 물품 정보 요약
        int sum = 0;            // 가격 합계
        String itemList = "";   // 구입한 물품 목록

        if (item.isEmpty()) {
            System.out.println("제품을 구입하지 않음");
            return;
        }
        for (int i = 0; i < item.size(); i++) {
            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }

        System.out.println("구입 총액 : " + sum);
        System.out.println("구입 제품 : " + itemList);
    }
}


class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Book book1 = new Book();
        Book book2 = new Book();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(book1);
        b.buy(book2);
        b.buy(com);
        b.buy(audio);
        b.summary();
        b.currentMoneyBonus();

        System.out.println();

        b.refund(book2);
        b.summary();
        b.currentMoneyBonus();
    }
}
