package de.neuefische;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


            List<Integer> list = List.of( 12, 15, 14, 11);

//        for (Integer i : list.stream().filter(integer -> integer % 2 == 0).toList()) {
//            System.out.println(i);
//        }

            List<Integer> list1 = list.stream().filter(integer -> integer % 2 == 0).toList();
            System.out.println(list1);

            List<Integer> list2 = list.stream().map(integer -> integer * 2).toList();
            System.out.println(list2);

            System.out.println(list.stream().sorted((o1, o2) -> o2-o1).toList());

            Integer reduce = list.stream().reduce(0, (integer, integer2) -> integer + integer2);
            System.out.println(reduce);

            Integer reduce1 = list.stream().reduce(0, Integer::sum);
            System.out.println(reduce1);


            list.forEach(System.out::println);

            List<Integer> collect = list.stream().map(integer -> integer * 3).collect(Collectors.toList());
            System.out.println(collect);


    }
  }
