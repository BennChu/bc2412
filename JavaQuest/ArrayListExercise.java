
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;


public class ArrayListExercise {

    public static void main(String[] args) {
        
        // Exercise 1: Array List Basic Operations
    
        // 1a. Create an ArrayList of integers.
        // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
        // 1c. Print all the elements in the list.
        // 1d. Remove the number 30 from the list.
        // 1e. Print the size of the list.
    
        //Use List
        //List<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(10);//index 0, add() return boolean
        arrList.add(20);//index 1
        arrList.add(30);//index 2
        arrList.add(40);//index 3
        arrList.add(50);//index 4

        System.out.println(arrList);//因為 arrList 裹面係 value, 所以可以就咁 print

        
        for (int i = 0 ; i < arrList.size() ; i++ ) {
            if (arrList.get(i) == 30) {
                arrList.remove(i);
            }
        }

        //remove all occurrences of the integer 30
        //remove by Collection interface, return boolean, false
        System.out.println(arrList.removeAll(Arrays.asList(30)));
        
        //remove by index, remove() return Integer, 40
        System.out.println(arrList.remove(2));

        //ensure remove an Object not index, remove() return boolean, false
        System.out.println(arrList.remove(Integer.valueOf(30)));
        

        System.out.println(arrList.size());//5







        // Exercise 2: Search and Update
    
        // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
        // "Orange".
        // 2b. Check if "Grapes" exists in the list.
        // 2c. If it doesn’t exist, add it to the list.
        // 2d. Update "Mango" to "Peach".
        // 2e. Print the final list.
    
        //Use List
        //List<String> fruits = new ArrayList<>()
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Orange"));

        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Mango");
        // fruits.add("Orange");

        //contains() need to pass Object o
        //if pass primitive, need Wrapper class Integer.valueOf(40)
        boolean hasGrapes = fruits.contains("Grapes");
        //if (!hasGrapes)
        //  fruits.add("Grapes");
        boolean found = false;
        for (String fruit : fruits) {       // (裹面係乜野 type : loop 乜野)
            if (fruit.equals("Grapes")) {
                found = true;
                break;
            }
         }
         //
        if (found)
            System.out.println("Found grapes");
        else {
            System.out.println("No grapes, then will add it to the list");
            fruits.add("Grapes");//ArrayList add to the last
        }
        //System.out.println("Old list " + fruits);


        //fruits.replaceAll(fruit -> "Mango".equals(fruit) ? "Peach" : fruit);
        String s = "Mango";
        String s1 = "Peach";
        int idx;
        for (String fruit : fruits) {
            if (fruit.equals(s)) {
                idx = fruits.indexOf(s);
                fruits.remove(idx);
                fruits.add(idx, s1);
                break;
            }
         }
         System.out.println(fruits);








        // Exercise 3: Remove Duplicates
    
        // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
        // 3b. Remove duplicates from the list using a HashSet.
        // 3c. Print the list after removing duplicates.

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 40, 20, 50));
        // nums.add(10);
        // nums.add(20);
        // nums.add(10);
        // nums.add(30);
        // nums.add(40);
        // nums.add(20);
        // nums.add(50);
        System.out.println(nums);

        HashSet<Integer> newNums = new HashSet<>();

        for (Integer num : nums) {
            newNums.add(num);
        }
        System.out.println(newNums);





    
    
        // Exercise 4: HashSet Basic Operations
    
        // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
        // 4b. Add "Canada" to the set.
        // 4c. Add "India" again. Print the result.
        // 4d. Print all elements in the set.

        HashSet<String> names = new HashSet<>(Arrays.asList("USA", "India", "China", "Japan"));
        
        names.add("Canada");
        System.out.println(names);
        names.add("India");
        System.out.println(names);




    
        // Exercise 5: Check the numbers
    
        // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
        // 5b. Check if the set contains the number 3.3
        // 5c. Remove the number 2.2 from the set.
        // 5d. Print the size of the set.
    
        //Set<Double> .......= new HashSet<>
        HashSet<Double> nums1 = new HashSet<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));//?? Float cannot??

        //nums1.contains(3.3);//return boolean
        found = false;
        for (Double num : nums1) {
            if (num == 3.3) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("The list contains 3.3");
        else
            System.out.println("No 3.3 in the list");

        System.out.println(nums1.size());

        nums1.removeAll(Arrays.asList(2.2));
        //nums1.remove(2.2);//remove() method 放 value
        found = false;
        for (Double num : nums1) {
            if (num == 2.2) {
                nums1.remove(2.2);
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("2.2 is removed");
        else
            System.out.println("No 2.2");
        
        System.out.println(nums1.size());






        // Exercise 6: Intersection of Sets
    
        // 6a. Create two HashSets:
        // 6b. Set 1: 10, 20, 30, 40
        // 6c. Set 2: 30, 40, 50, 60
        // 6d. Find the common numbers of the two sets.
        // 6e. Print the resulting set.


        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30, 40));

        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50, 60));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer i : set2) { // (inside is Integer type : loop set2 hashset)
            if(!set1.add(i)) { //if cannot add to set1, means repeated, so add to new ArrayList
                result.add(i);
            }
        }
        System.out.println(result);

        // set1.toArray();
        // for (Integer num : set1) {
        //     if (set1.contains(set2))
        //         System.out.println("testing");
        // }
        





    
        // Exercise 7: Convert HashSet to ArrayList
    
        // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
        // 7b. Convert the HashSet to an ArrayList.
        // 7c. Print the converted list.

        HashSet<String> arr1 = new HashSet<>(Arrays.asList("Cherry", "Steve", "Chole", "Jenny", "Vicky"));
        System.out.println(arr1);

        //List<String> arr2 = new ArrayList<>(arr1);
        ArrayList<String> arr2 = new ArrayList<>();

        for (String s2 : arr1) {//loop arr1 放落 arr2 度
            arr2.add(s2);
        }

        System.out.println(arr2);

    




        // Exercise 8: ArrayList of Students
        // 8a. Create an ArrayList to store Student objects.
        // Add the following students:
        // ID: 1, Name: Alice
        // ID: 2, Name: Bob
        // ID: 3, Name: Charlie
        // 8b. Iterate over the ArrayList and print each student's details.
        // 8c. Remove the student Bob.
        // 8d. Write a static method to search for a student by ID and return their name. If the student is
        // not found,
        // return "Student not found".
        // 8e. Create another ArrayList to store student with name starts with 'A'

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1,"Alice"));
        students.add(new Student(2,"Bob"));
        students.add(new Student(3,"Charlie"));


        Iterator<Student> listIterator = students.iterator();
        while (listIterator.hasNext()) { //當 namesIterator 有下一個 element
            System.out.println(listIterator.next());
        }

        // for (Student s3 : students) {
        //     System.out.println( "Id: " + s3.getId() +"," + " Name: " + s3.getName());
        // }


        //String s2 = ArrayListExercise.search(3, students);
        System.out.println(ArrayListExercise.search(3, students));

        found = false;
        ArrayList<Student> students3 = new ArrayList<>();
        for (Student s4 : students) {
            if (s4.getName().startsWith("A")) {
                students3.add(s4);
                found = true;
            }
                
        }
        if (found) {
            for (Student s5 : students3)
                System.out.println(s5.getName());
        }
            //System.out.println(students3);
        else
            System.out.println("No student with name starts with A");
        







    
        // Exercise 9: HashSet of Students
        // 9a. Create two HashSets of Student objects:
        // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
        // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
        // 9b. Find the common students of the two sets
        // 9c. Print the result.
        
        HashSet<Student> students1 = new HashSet<>();
        students1.add(new Student(1, "Alice"));
        students1.add(new Student(2, "Bob"));
        students1.add(new Student(3, "Charlie"));
        //System.out.println(students1);//students1 is object reference, this is printing object reference

        HashSet<Student> students2 = new HashSet<>();
        students2.add(new Student(2, "Bob"));
        students2.add(new Student(3, "Charlie"));
        students2.add(new Student(4, "David"));
        //System.out.println(students2);//students2 is object reference, this is printing object reference

        ArrayList<Student> result1 = new ArrayList<>();

        for (Student student : students2) {
            if (!students1.add(student)) {
                result1.add(student);
            }
        }
        System.out.println(result1);


      }
    
      public static class Student {
        private int id;
        private String name;
    
        // Constructor
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        // getter, setter, etc.
        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;

            if (!(obj instanceof Student))
                return false;

            Student student = (Student) obj;
            return Objects.equals(student.getId(), this.id)
                    && Objects.equals(student.getName(), this.name);

        }

        @Override
        public int hashCode() {
            return Objects.hash(this.id, this.name);
        }




        @Override
        public String toString() {
            return "[ "
                    + "Id = " + this.getId() + ", "//寫 this, not student
                    + "Name = " + this.getName()
                    + "]"
                    ;
        }




      }

       public static String search(int id, ArrayList<Student> students) {
             for (Student s : students) {
                    if (s.id == id) 
                    return s.name;

             }
             return "Student not found";
       }
      
}
