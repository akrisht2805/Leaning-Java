package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("AKRISHT");
        // list.add(1234); // shows error bcoz it is type safe
        System.out.println(list);

        List genericList = new ArrayList<>();
        genericList.add("YADAV");
        genericList.add(1234);
        System.out.println(genericList);

        // It is not type safe it is not good by this we might get run time error.
        Generic g1 = new Generic(1);
        Generic g2 = new Generic("Hello this is Stirng");
        System.out.println(g1.getValue());
        System.out.println(g2.getValue());

        // TYPE SAFE
        Box<Integer> b1 = new Box<Integer>(1234);
        Box<String> b2 = new Box<String>("Hello World");
        System.out.println(b1.getValue());
        System.out.println(b2.getValue());

    }

}
