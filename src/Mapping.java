import java.util.List;
import java.util.stream.Stream;

public class Mapping {
    // transform value to stream    .map()    . flatMap()

    public static void main(String[] args) {
        show3();
    }

    public static void show1() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        //we are ONLY interested in name of movies
        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                // .map(movie -> movie.getTitle())  //every object in string
                .forEach(System.out::println);   //name -> System.out.println(name)



        /*result:
        10
        15
        20
         */
    }


    public static void show2() {     //every object in stream is list of integers
        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream.forEach(System.out::println);   //list -> System.out.println(list)


        /* result:
        [1, 2, 3]
        [4, 5, 6]
         */
    }


    //.flatMap()   working with individual numbers
    public static void show3() {     //every object in stream is list of integers
        //  .flatMap()   flatten    Stream<List<x>> -> Stream<x>         Stream list of objects to stream of objects

        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream
                .flatMap(list -> list.stream())  //convert each list to stream
                .forEach(System.out::println);   //n -> System.out.println(n)


        /* result:
        1
        2
        3
        4
        5
        6
         */
    }
}
