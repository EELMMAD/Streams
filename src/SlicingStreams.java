import java.util.List;

public class SlicingStreams {
    /*
    .limit(n)
    .skip(n)
    .takeWhile(predicate)   as long as this condition in true, keep taking elements from this stream
    .dropWhile(predicate)
     */

    public static void main(String[] args) {
        show();
    }

    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        /*
        movies.stream()
                .limit(2)
                .forEach(m -> System.out.println(m.getTitle()));

        /*result :
        a
        b
        */

        /*
        movies.stream()
                .skip(2)    //skip first two movies
                .forEach(m -> System.out.println(m.getTitle()));

         */
        /*result :
       c
        */






        /*
        //we have 1000 movies
        //display 10 movies per page
        // we are interested in 3rd page
        //How many movies we should skip
        //Formula:
        //skip(20) = skip( (page -1) * pageSize)              skip((3-1) *  10)     skip(20)
        //limit(10) = Limit(pageSize)


        movies.stream()
                .skip(20)
                .limit(10)
                .forEach(m -> System.out.println(m.getTitle()));

         */



/*
        movies.stream()
                .takeWhile(m -> m.getLikes() < 20)
                .forEach(m -> System.out.println("***" + m.getTitle()));

 */

      /*
      Difference between .filter() and .takeWhile()

      .filter()   iterate the entire data source to find objects that matches our criteria

      .takeWhile() stops the moment predicate return false.

      .dropWhile() which is the opposite of takeWhile(), it is  escape all the elements that match this criteria and
                    then take the rest


       */

        movies.stream()
                .dropWhile(m -> m.getLikes() < 20)
                .forEach(m -> System.out.println("***" + m.getTitle()));

}


}
