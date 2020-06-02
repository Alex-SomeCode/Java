package hw_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        List<String> str = new ArrayList<>();
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("5");
        str.add("6");
        str.add("7");
        str.add("8");
        str.add("9");
        str.add("10");

        Optional<String> any = str.stream().findAny() ;
        System.out.println(any);
    }
}
