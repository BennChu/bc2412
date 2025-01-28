import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {
        
            int[] arr = new int[] {1, 2, 3, 4};
            for (int i = 0 ; i < arr.length ; i++) {
                System.out.println(arr[i]);
            }

            // for (int integer : arr) {
            //     System.out.println(arr[integer]);
            // }

            //int[], Integer[], ArrayList[]
            //Stream is a class
            //this is happened after java 8 (2014), java 8 JDK
            //List -> Stream -> List
            //before java 8, for loop (List), for loop + if 
            //filter = for loop + if

            List<Integer> integers = Arrays.asList(1, 2, 3, 4);
            
            //this is not List
            //now is stream Integer
            //List<Integer> = integers.stream()
            //List 冇 filter(), 所以轉 stream has filter
            //strong type
            List<Integer> newIntegers = integers.stream() //Steam<Integer>
                                                 .filter(e -> e % 2 == 0) //冇 e is boolean
                                                 .collect(Collectors.toList());//always return new ArrayList

            System.out.println(integers);
            System.out.println(newIntegers);
        

            //Declare String array with some elements
            //filter string length>5
            List<String> s1 = Arrays.asList("abcefghj", "defde", "ijke");
            List<String> newS1 = s1.stream()
                                .filter( e -> e.length() > 5)//可以 filter 2 times, similar && ||
                                .collect(Collectors.toList());
            
            System.out.println(s1);
            System.out.println(newS1);

            //Define a book list
            //filter book name contain "Herry" case incensitive
            List<Book> books = Arrays.asList(new Book("ABC Ben Potter"),
                                            new Book("CDE Potter Potter"),
                                            new Book("EFU Herry Potter"),
                                            new Book("ijk herry herry"));


            //books 係 Book 形態, 所以要 stream() 先用到 filter
            //你唔 create newBooks, 就冇野裝住佢
            List<Book> newBooks = books.stream()
                                    .filter(book -> book.getName().equalsIgnoreCase("Herry"))
                                    //"Herry.equalsIgnoreCase.getName()
                                    //e.getName().toUpperCase().contains("HERRY")"
                                    .collect(Collectors.toList());

            System.out.println(books);
            System.out.println(newBooks);


            //map() : Change the object type, but will not change the quantity of element
            //change 形態
            //filter + map
            //re structure + filter + map + collect + for each(action)
            //for loop + if + procedures
            //map 唔可以改變數, 只可以改變形態
            List<String> bookNames = 
                books.stream().map(e -> e.getName()).collect(Collectors.toList());
            System.out.println(bookNames);

            // books.stream().map(e -> e.getName().toUpperCase().conains("HERRY"))
            //             .

            //convert these names to 3 book name
            List<String> bookName2 = List.of("abc", "herry", "def");
            List<Book> newBookName2 = bookName2.stream()
                                                .map(e -> new Book(e))
                                                .collect(Collectors.toList());
            System.out.println(newBookName2);


            //sorted()
            //collection.sort() + Comparator
            //Arrays.sort()
            //int[], Integer[] no parent child relationship
            Integer[] arr2 = new Integer[] {2, 4, -1, 1, -3};
            Arrays.sort(arr2, (i1, i2) -> i1 > i2 ? -1 : 1);//Lambda expression of Comparator
            System.out.println(Arrays.toString(arr2));


            //Integer[] -> Stream<Integer>, 任何形態轉去 Stream 形態
            //sort 無參數, 小至大
            //可以 sort 再 filter
            //filter 再 sort 再 map
            //大至小
            List<Integer> sortedInteger = 
                        Arrays.stream(arr2).sorted((i1, i2) -> i1 > i2 ? -1 : 1)
                                            .collect(Collectors.toList());
            System.out.println(sortedInteger);

            

            //Set, no repeat
            //has toList(), toSet(), toMap()
            List<String> fruits = Arrays.asList("orange", "apple", "orange", "lemon");
            Set<String> newFruits = fruits.stream().collect(Collectors.toSet());
            System.out.println(newFruits);//[orange, apple, lemon]

            //List to Stream
            //Stream to List
            //distinct() remove duplicate
            List<String> newFruits2 = fruits.stream().distinct().collect(Collectors.toList());
            System.out.println(newFruits2);//[orange, apple, lemon]


      }//main
      
    //   Convert from List of Object A (more fields) to List of Object B (less fields)
    //   public static List<Book2> getBookListForSearch(List<Book2> books) {
    //     return books.stream()
    //                 .map(e -> new Book(e.getName())
    //                 .collect(Collectors.toList());
    //   }



      //static class
      public static class Book2 {
        private String name;
        private double price;

        public Book2(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return this.name;
        }

        public double getPrice() {
            return this.price;
        }
      }
      
      
      
      
      
      
      public static class Book {

           private String name;

           public Book(String name) {
              this.name = name;
          }

          public String getName() {
            return this.name;
          }

          @Override
          public String toString() {
                return "["
                        + "Name: "
                        + this.name
                        + "]";
          }

      }//end static class





}
