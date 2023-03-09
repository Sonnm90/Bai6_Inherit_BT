package bai3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MovablePoint test= new MovablePoint(1,2,3,4);
        System.out.println(Arrays.toString(test.getSpeed()));
        System.out.println(test.getXSpeed());
        System.out.println(test.getYSpeed());
        System.out.println(test);

        System.out.println(test.move());



    }
}
