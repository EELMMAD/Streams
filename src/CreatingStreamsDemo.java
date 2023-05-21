import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void main(String[] args) {
        show();
    }
    public static void show(){

        /*
        //From collection
        Collection<Integer> x;
        x.stream()



       //From ArrayList
        var list = new ArrayList<>();
        list.stream()



        //From Arrays
        int[] numbers = {1, 2, 3};       //THERE IS NOOOOOOO     number.stream()
        Arrays.stream(numbers)
                .forEach(System.out::println);      //n -> System.out.println(n)



       //From an arbitrary number of object
        Stream.of(1, 2, 3, 4)


      //Infinite /Finite stream
       var stream = Stream.generate(() -> Math.random());
       stream
               .limit(3)
               .forEach(n -> System.out.println(n));
         */

      Stream.iterate(1, n -> n+1)  //we start from 1 and evey time when we want to generate a value, add 1 to the previous value
              .limit(10)
              .forEach(n -> System.out.println(n));

    }
}
