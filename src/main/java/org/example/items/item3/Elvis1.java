package org.example.items.item3;

/**
 * public static final 필드 방식의 싱글턴
 */
public class Elvis1 {

    public static void main(String[] args) {
        Elvis1 elvis1 = Elvis1.INSTANCE;
    }

    public static final Elvis1 INSTANCE = new Elvis1();

    private Elvis1() {
    }
}
