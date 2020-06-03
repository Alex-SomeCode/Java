package hw_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> str = new ArrayList<>();
        str.add("22");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("5");
        str.add("6");
        str.add("7");
        str.add("8");
        str.add("9");
        str.add("10");

        Optional<String> any = str.parallelStream().findAny();
        System.out.println(any);
//        str.forEach(System.out::println);


        List<String> collect = str.stream().filter(b -> b.equals("1")).collect(Collectors.toList());

        collect.forEach(book-> System.out.println(book));

//        collect.forEach(System.out.println());


    }
}
