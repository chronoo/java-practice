package oop;

class A {
    protected int speed;

    public A() {
        System.out.println("A");
        move();
    }

    public void move() {
        System.out.println(speed);
    }
}

class B extends A {
    public B() {
        speed = 10;
        System.out.println("B");
        move();
    }

    @Override
    public void move() {
        speed++;
        System.out.println(speed);
    }
}

public class Inh {
    public static void main(String[] args) {
        B b = new B();
    }
}
