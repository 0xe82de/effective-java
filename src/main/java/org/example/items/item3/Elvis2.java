package org.example.items.item3;

/**
 * 정적 팩터리 방식의 싱글턴
 */
public class Elvis2 {

    public static void main(String[] args) {
        Elvis2 elvis2 = Elvis2.getInstance();
    }

    private static final Elvis2 INSTANCE = new Elvis2();

    private Elvis2() {
    }

    public static Elvis2 getInstance() {
        return INSTANCE;
    }
}
