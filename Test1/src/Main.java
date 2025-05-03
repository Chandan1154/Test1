import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Stream represents a sequence of emlemnt an support parallel and aggregate operations
        // Streams can be created from collections, arrary. or iterators
       // Stream are abratraction for processing collections of value
        // list -> stream - > filter() -> sort() -> limit()
        //                     intermediate operation  and terminal operation
        //                    result -> stream         and print
        // stream will not store element
        // it kind of pipeline
        // pipeline of operations
        // create a stream
        // Specify intermediate operation for transforming the intial stream intot another stream
        // apply a terminal operation to produce a result
        // next the  stream can no longer be used

        // list -> stream

        // ex;
//        List<String> courseList = Arrays.asList("java","Spring","Anguar","Html");
//        // to covert list into stream method called stream
//        courseList.stream().filter(str -> str.contains("a"))
//                .sorted() //comparator
//                .forEach(System.out::println);
//
//// assume you don't want to convert into foreach if you want to convert back to list use collect method
//        List<String> course = courseList.stream()
//                //.filter(str -> str.contains("a"))
//                .sorted() //comparator
//                .limit(3)
//                .collect(Collectors.toList());
//           for( String l : course){
//               System.out.println(l);
//           }
//
//
//        // using Array with  stream api
//        String[] arr = {"chandna", "Ram","Shaam", "karana","strea"};
//        // import stream method of()
//        Stream.of(arr).sorted().skip(2).forEach(System.out::println);
//        Arrays.stream(arr, 2,5).forEach(System.out::println);

        // function interface
        // it's type of interface which as only on abstract method
        // how to use fuction interface

//        Function<Employee, String>  emp = (e ) -> e.getName();
//        System.out.println(emp.apply(new Employee(123, "chandan", 4004)));
//
        // get the any primitive  values like string, double, integer and char
//        Function<Employee, Integer> emp = (e)-> e.getId();
//        System.out.println(emp.apply(new Employee(123, "chandan",2343)));
//
//        // how to use in stream api there is method called map which is user functional interface
//        List<Employee> employeeList = Arrays.asList(
//                new Employee(123, "chadnan", 4000),
//                new Employee(124, "ramd",45999)
//                );
//      List<Integer> emiD =  employeeList.stream().map((e)-> e.getId()).collect(Collectors.toList());
//
//                emiD.forEach(System.out::println);


    }
}