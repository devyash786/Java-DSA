package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi1 {
    public static void main(String[] args) {
        List<Integer> myList = List.of(2,3,4,5,88,77,11,70);

        Stream<Integer> stream=myList.stream();
        List<Integer> newList=stream.filter(x->x%2==0).collect(Collectors.toList());

        int arr[] = new int[]{1,2,3,4,5};
        IntStream inStream= Arrays.stream(arr);
        inStream.forEach(e->{
            System.out.println(e);;
        });

        System.out.println(newList);

        System.out.println(myList.stream().filter(x->x>11).collect(Collectors.toList()));

        List<Integer> leapYear = List.of(2000,2001,2002,5000,2008,5004,2010,2018,2020);
        System.out.println(leapYear.stream().filter(e->(e%4==0 && e%100!=0) || e%400==0).collect(Collectors.toList()));
        leapYear.stream().forEach(System.out::println);

        List<Integer> myList1 = List.of(2,3,4,5,88,77,11,70);

        Stream<Integer> stream1=myList1.stream();
        //stream1.map(i->i*i).forEach(System.out::println);
       // stream1.sorted().forEach(System.out::println);

        //System.out.println("min"+stream1.min((x,y)->x.compareTo(y)).get());
        System.out.println("min"+stream1.max((x,y)->x.compareTo(y)).get());

    }
 
}
