import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.LongStream.LongMapMultiConsumer;

public class StreamExercise {


    public static class Student {
        private String name;
        private int score;
        
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getName() {
            return this.name;
        }

        public int getScore() {
            return this.score;
        }

        //this is instance method, can use this.
        @Override
        public String toString() {
            return "["
                    + "Name: " + this.name
                    + ", "
                    + "Score: " + this.score
                    +"]"
                    ;
        }
    }//end class Student


    public static class Employee {

        private String name;
        private int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return this.name;
        }

        public int getSalary() {
            return this.salary;
        }

        @Override
        public String toString() {
            return "["
                    + "Name: " + this.name
                    + ", "
                    + "Salary: " + this.salary
                    +"]"
                    ;
        }
    }//static class Employee

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return "["
                    + "Name: " + this.name
                    + ", "
                    + "Age: " + this.age
                    +"]"
                    ;
        }
    }


    public static enum Gender {
        Female,
        Male,
        ;

    }

    public static class Staff {
        private String name;
        private Gender gender;

        public Staff(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return this.name;
        }

        public Gender getGender() {
            return this.gender;
        }

        @Override
        public String toString() {
            return "[ "
                    + "Name: " + this.name
                    + "]";
        }
    }

    public static class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return this.name;
        }

        public int getPrice() {
            return this.price;
        }
    }



    public static class Worker {
        private String name;
        private String department;

        public Worker(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return this.name;
        }

        public String getDepartment() {
            return this.department;
        }

        public String toString() {
            return "["
                    //+ "Department: "
                    //+ this.department
                    //+ ","
                    + " Name: "
                    + this.name
                    + "]"
                    ;
        }
    }

    public static class Children {
        private String name;
        private int score;

        public Children(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return this.name;
        }

        public int getScore() {
            return this.score;
        }

        @Override
        public String toString() {
            return //"["
                    this.name;
                    //+"]";
        }
    }

    //Collector is an generic interface public interface Collector<T, A, R>
    //Integer input type
    //Set<Integer> result type
    public static Collector<Integer, ?, Set<Integer>> toRemoveDuplicateSet() {
        return Collector.of(HashSet::new,
                                Set::add,
                                (set1, set2) -> {
                                    set1.addAll(set2);
                                    return set1;
                                }
                            );
    }


     public static void main(String[] args) {

    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.

    //Arrays.asList() 
    //CANNOT add and remove, can read and modify
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16, 4]

    List<Integer> newNumbers = numbers.stream()
                                        .filter(e -> e % 2 == 0)
                                        .map(e -> e * e)//use Math.pow is return double, 唔好煩
                                                        //map(), the result is a new stream
                                        .sorted((e1, e2) -> e1 > e2 ? -1 : 1 )
                                        //.sorted(Comparator.reverseOrder()) 
                                        //好用既 method 可以做 static 成日 call 佢
                                        .collect(Collectors.toList());

    System.out.println(newNumbers);//








    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    // // Output: [Alice, Annie, Alex]

    List<String> names1 = names.stream()
                                .filter(e -> e.startsWith("A"))
                                .collect(Collectors.toList());
    
    System.out.println(names1);//[Alice, Annie, Alex]












    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    // Output: Max: 30
    // Output: Min: 5

    List<Integer> sortedNumbers2 = numbers2.stream()
                                            .sorted()//sorted(), default is 小至大
                                            .collect(Collectors.toList());


    System.out.println("Max: " + sortedNumbers2.get(numbers2.size()-1));//Max: 30
    System.out.println("Min: " + sortedNumbers2.get(0));//Min: 5
    

    //如果冇野, 點計 max
    //Optional 可以裝 null
    //Optional<Integer> box = numbers2.stream().max((e1, e2) -> e1.compareTo(e2));
    

    //Optional is a public final class
    Optional<Integer> box = numbers2.stream().max((e1, e2) -> e1 < e2 ? -1 : 1);


    //上面個結果放係 box, 但係 box 可能 null, 所以要 check
    int maxNum = Integer.MIN_VALUE;
    if (box.isPresent()) {
        maxNum = box.get();
    }

    int minNum = numbers2.stream().min((e1, e2) -> e1 < e2 ? -1 : 1).orElse(-1);
    //orElse() is 如果個 box 計唔到 min, 所以null, 就俾 -1
    
    
    System.out.println("Max: " + maxNum);//30
    System.out.println("Min: " + minNum);//5










    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)

    List<Integer> lengthOfWords = words.stream()
                                       .map(e -> e.length())
                                       .collect(Collectors.toList());

    System.out.println(lengthOfWords);//[5, 6, 4]











    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
     List<String> words1 = Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4

    List<String> lengthGreaterThan3 = words1.stream()
                                            .filter(e -> e.length() > 3)
                                            .collect(Collectors.toList());

    System.out.println(lengthGreaterThan3.size());//4


    long count = words1.stream()
                .filter(e -> e.length() > 3)
                .count()//return long
                ;
                //count() is a terminal operator, similar to collect, 收尾, 離開 stream 形態
                //similar to collect(), max(), min()
                //個個都用 long 唔用 int

    System.out.println(count);//4
    System.out.println(words1.stream().filter(e -> e.length() > 3).count());//4
















    // Here are more advanced exercises focused on using filter, map, and collect to transform data into
    // different data structures:
    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // // Output: [15, 20]

    Set<Integer> numbers3Set =
            numbers3.stream().filter(e -> e > 10)
                    .sorted((x1, x2) -> x1 > x2 ? 1 : -1).collect(Collectors.toSet());

    System.out.println(numbers3Set);










    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)

    // Output: {Alice=85, Bob=75}

        //java 9: List.of()
        //List.of() can read object, cannot add/remove/modify
        //1. it is an immutable object, cannot modify data stucture
        //2. use List.of(), 我不打算改變 new Student , Student object 唔可以變, 但 name and score 可以改
        // List
        //3. Array.asList() 好 fixibale 有多
        //CANNOT add and remove, can read and modify element only
        //array final 左, 長短不能改
        //runtime checker
        //java 平衡,  runtime and readilibity
        List<Student> students = List.of(new Student("Alice", 85),
                                            new Student("Bob", 75));
        System.out.println(students);//before override
        //[StreamExercise$Student@4f3f5b24, StreamExercise$Student@15aeb7ab]
        //after override
        //[[Name: Alice, Score: 85], [Name: Bob, Score: 75]]
        
        //cannot set(0), has exception
        //students.set(0, new Student("Vincent", 90));//UnsupportedOperationException
        //get(0) is ok
        //students.get(0).setScore(80);//ok

        //for loop 都做到, 但要寫好多行 code
        //由 List to Map
        Map<String, Integer> studentsMap = 
        students.stream().collect(Collectors.toMap(stu -> stu.getName(), stu -> stu.getScore())); 

        System.out.println(studentsMap);//{Bob=75, Alice=85}








    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)

    // Output: [John, Jane]

    List<Employee> employees = List.of(new Employee("John", 65000),
                                        new Employee("Jane", 55000),
                                        new Employee("Doe", 40000));


    Map<String, Integer> employeesMap = employees.stream()
                                            .filter(e -> e.getSalary() > 50000)
                                            .collect(Collectors.toMap(e -> e.getName(), e -> e.getSalary()));
    System.out.println(employeesMap.keySet());//[John, Jane]












    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)

    // // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)

    List<Person> personList = List.of(new Person("Alice", 30),
                                    new Person("Bob", 25),
                                    new Person("Charlie", 30));

    Map<Integer, List<Person>> personMap = personList.stream()
                                                    .collect(Collectors.groupingBy(e -> e.getAge()));
                                    
    System.out.println(personMap);
    //{25=[[Name: Bob, Age: 25]], 30=[[Name: Alice, Age: 30], [Name: Charlie, Age: 30]]}











    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)

    // // Output: {false=[Alice], true=[Bob, Charlie]} (Map)

    List<Staff> staffs = Arrays.asList (new Staff("Alice", Gender.Female),
                                        new Staff("Bob", Gender.Male),
                                        new Staff("Charlie", Gender.Male));
    
    Map<Boolean, List<Staff>> staffByGender = staffs.stream()
                                                    .collect(Collectors.partitioningBy(
                                                        s -> s.getGender() == Gender.Male));

    System.out.println(staffByGender);
    //without override {false=[StreamExercise$Staff@70177ecd, StreamExercise$Staff@1e80bfe8], true=[StreamExercise$Staff@66a29884]}
    //with override false=[[ Name: Alice]], true=[[ Name: Bob], [ Name: Charlie]]}

















    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    // Output: [30, 40, 60]

    List<Integer> newNumbers4 = numbers4.stream()
                                        .filter (e -> e > 10)
                                        .map (e -> e * 2)
                                        .collect(Collectors.toList());
    System.out.println(newNumbers4);//[30, 40, 60]






    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

    List<String> names12 = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]

    List<Person> names12WithAge = names12.stream()
                                        .map(e -> new Person (e, defaultAge))
                                        .collect(Collectors.toList());
    System.out.println(names12WithAge);
    //[Name: Alice, Age: 30], [Name: Bob, Age: 30], [Name: Charlie, Age: 30]]



    
    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    List<String> words13 = Arrays.asList("hello", "world", "java");
    // Output: [HELLO, WORLD, JAVA] (Deque)

    Deque<String> words13Deque = words13.stream()
                                        .map(e -> e.toUpperCase()) //.map(String::toUpperCase); is the same
                                        .collect(Collectors.toCollection(ArrayDeque::new));
  
    System.out.println(words13Deque);//[HELLO, WORLD, JAVA]








    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    List<Integer> numbers14 = Arrays.asList(1, 2, 3, 4);
    // Output: [1, 4, 9, 16]

    ArrayList<Integer> numbers14Array = numbers14.stream()
                                                .map(e -> e * e)
                                                .collect(Collectors.toCollection(ArrayList::new));

    System.out.println(numbers14Array);//[1, 4, 9, 16]

    System.out.println(numbers14);//[1, 2, 3, 4]










    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)

    // Output: 22

    List<Product> products = Arrays.asList(new Product("Book", 10),
                                            new Product("Pen", 5),
                                            new Product("Notebook", 7));

    int totalPrice = products.stream()
                             .map(e -> e.getPrice())
                             .reduce(0, Integer::sum);
    System.out.println(totalPrice);










    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}

    List<Worker> workers = Arrays.asList(new Worker("Alice", "HR"),
                                        new Worker("Bob", "IT"),
                                        new Worker("Charlie", "HR"),
                                        new Worker("David", "IT"));

    //group by department, department should be the key
    //department is String
    //Worker::getDepartment
    Map<String, List<Worker>> workersMap = workers.stream()
                                                    .collect(Collectors.groupingBy(Worker::getDepartment));

    System.out.println(workersMap);
    //{HR=[StreamExercise$Worker@7eda2dbb, StreamExercise$Worker@6576fe71], IT=[StreamExercise$Worker@76fb509a, StreamExercise$Worker@300ffa5d]}
    //HR=[[ Name: Alice], [ Name: Charlie]], IT=[[ Name: Bob], [ Name: David]]}

    System.out.println(workers);
    //[[ Name: Alice], [ Name: Bob], [ Name: Charlie], [ Name: David]]








    
    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Output: 55

    int numbers5Sum = numbers5.parallelStream()//return a possibly parallel stream with this collection
                              .mapToInt(n -> n)//this is a method inside Stream interface
                                                //converts the stream of Integer objects into an IntStream.
                              //map function in Java's streams API does not accept two parameters directly
                              .sum();//return int, calculates the sum of the elements in the IntStream.
                            
    System.out.println(numbers5Sum);//55


    List<Integer> numbers5List2 = numbers5.parallelStream().collect(Collectors.toList());
    System.out.println(numbers5List2);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    int numbers5Sum1 = numbers5.stream()//return a possibly parallel stream with this collection
                                .mapToInt(n -> n)
                                .sum();
    System.out.println(numbers5Sum1);//55









    
    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );
    // Output: [6, 7, 8, 9]

    List<Integer> numbersGreater5 = listOfIntegers.stream()
                                                    .flatMap(List::stream)//transforms each list within the stream into a separate stream of strings.
                                                    .filter(e -> e > 5)
                                                    .collect(Collectors.toList());
    System.out.println(numbersGreater5);//[6, 7, 8, 9]




    




    
    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Output: [apple, banana, grape, orange]
    
    Set<String> fruitsSet = fruits.stream()
                                    .collect(Collectors.toSet());
    
    System.out.println(fruitsSet);//[banana, orange, apple, grape] 
                                  //but not in alphatetical order
    
    List<String> fruitsOrder = fruitsSet.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
    System.out.println(fruitsOrder);//[apple, banana, grape, orange]


    List<String> fruitsOrder1 = fruits.stream()
                                    .collect(Collectors.toSet())
                                    .stream()
                                    .sorted()
                                    .collect(Collectors.toList());
    System.out.println(fruitsOrder1);//[apple, banana, grape, orange]

















    // 20. Partitioning By
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and failing
    // groups (pass if score >= 50).
    // Create Student first.
    
    // Create Children Class
    // new Children("Alice", 45)
    // new Children("Bob", 55)
    // new Children("Charlie", 40)
    // new Children("David", 70)
    
    // Output: {false=[Alice, Charlie], true=[Bob, David]}

    List<Children> childrenList = Arrays.asList(new Children("Alice", 45),
                                                new Children("Bob", 55),
                                                new Children("Charlie", 40),
                                                new Children("David", 70));

    Map<Boolean, List<Children>> passingFailing = childrenList.stream()
                                                    .collect(Collectors.partitioningBy(s -> s.getScore() >= 50));
    System.out.println(passingFailing);
    //without override {false=[StreamExercise$Children@2e0fa5d3, StreamExercise$Children@5010be6], true=[StreamExercise$Children@685f4c2e, Str
    //with override {false=[Alice, Charlie], true=[Bob, David]}





    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.
    
    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    // Output: "Java, Python, Rust, R, Go"

    List<String> joiningString = languages.stream()
                                        .map(e -> e)
                                        .collect(Collectors.toList());
    System.err.println(joiningString);//[Java, Python, Rust, R, Go]














    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);
    
    // Output: 9

    List<Integer> agesdivby3 = ages.stream()
                                    .filter( e -> e % 3 == 0)
                                    .sorted()
                                    .limit(1)
                                    .collect(Collectors.toList());
    System.out.println(agesdivby3);






    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.
    
    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [4, 5, 6, 7, 8]
    
    List<Integer> limitandskip = elements.stream()
                                        .limit(8)
                                        .skip(3)
                                        .collect(Collectors.toList());
    System.out.println(limitandskip);//[4, 5, 6, 7, 8]






    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.
    
    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]

    List<Integer> amountsDouble = amounts.stream()
                                  .map(e -> e * 2)
                                  .peek(System.out::println)
                                  .collect(Collectors.toList());
    System.out.println(amountsDouble);//2 4 6 8
                                      //[2, 4, 6, 8]











    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.
    
    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
    // Output: Optional[tiger]

    Optional<String> animalsOpt = animals.stream()
                                        .filter(e -> e.length() > 4)
                                        .map(Object::toString)
                                        .findFirst();

    String nullOrElse = animalsOpt.orElse("Null");
    System.out.println(nullOrElse);//tiger
    
    if (animalsOpt.isPresent()) {
        System.out.println(animalsOpt.get());
    }else {
        System.out.println("Null");
    }


    String animalsString = animals.stream()
                                    .filter(e -> e.length() > 4)
                                    .limit(1)
                                    .map(Object::toString)
                                    .collect(Collectors.joining());
    
    System.out.println(animalsString);//tiger



    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional[null]

    Optional<String> animals2Opt = animals2.stream()
                                            .filter(e -> e.length() > 4)
                                            .map(Object::toString)
                                            .findFirst();

    String nullOrElse1 = animals2Opt.orElse("Null");
    System.out.println(nullOrElse1);//Null

    // if (animals2Opt.isPresent()) {
    //     System.out.println(animals2Opt.get());
    // }else {
    //     System.out.println("Null");//Null
    // }

    //System.out.println(animals2Opt.get());
    //java.util.NoSuchElementException: No value present




    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates
    
    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    // Output: [1, 2, 3, 4, 5, 6] (Set)
    Set<Integer> removeDuplicates = duplicates.stream()
                                            .collect(toRemoveDuplicateSet());
    
    System.out.println(removeDuplicates);//[1, 2, 3, 4, 5, 6]








    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.
    
    List<String> keywords = Arrays.asList("stream", "filter", "map", "sorted", "collect");
    // Output: 28

    int totalNumber = keywords.stream()
                              .mapToInt(e -> e.length())
                              .sum();
    System.out.println(totalNumber);//28
                    



    //aggragate function: count(), max(), min(), sum(), subtract(), average()


    }



}
