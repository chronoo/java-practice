package oop;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

abstract public class Parent {
    public int doIt() {
        return 42;
    }
}

class Child extends Parent {
//    @Override
    public int doIt() {


        HashMap<Object, Object> map = new HashMap<>();
        map.put("1", "2");

        List<Object> list = new ArrayList<>();
        list.add(1);

        HashSet<Object> objects = new HashSet<>();
        objects.add(1);

//        List.copyOf()

        Queue<Object> queue = new LinkedList<>();
        queue.peek();
        return 41;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(((Parent) new Child()).doIt());
    }
}
