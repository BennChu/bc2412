# Notes
## Week 1
public class .....{
  public static void main(String[] args){}
}

- Date Types (8 primtives) -> DemoDataType.java
  - 6 of them handles numbers
    byte -> short -> int -> long -> float -> double
  - char & boolean

- operator (++x, x++)
  - Division ( divided by 0)
  - Math 
- comparison (> < == != >=)
- String (store zero or many characters)
  - equals() put string inside bracket, length(), charAt() put beg index end index-1
- If else
- for( i=0 ; i<3 ; i++){}
- for + if (loop all elements + filtering)


## Week 2
 - while loop (difference between for loop and while loop)
 - for each loop (simple design for loop: one element per iteration)
 - array (support 17 types) ****important***
 - 8 wrapper classes 對應 8 primitives
 - string methods, example: DemoString
 - Methods (Similar to formula)
 - Method type
 - Method name
 - Method signature = input params + method name
 - BigDecimal (class) for calculation


 ## Week 3
 - Class and Object Example: Customer/ Order/ Item Example: Person     
   Example: Human (bmi)
   Static Variable Example: Supermarket & Worker , Supermarket2 & Worker2
   Static Method Example: Circle, LoanCalculator
 ## Week 4
   Class & Object Example: Deck & Card Example: Library, Book & Librarian
   Static Variable Example: Candy & Student

  extends
  override
  abstract class -> cannot 俾人 new object
      Example: public abstract class Hero
  abstract method() -> child class must provide the implementation of abstract method
      Example: Shape1.class -> abstract double area()
  final
!!very important -> 3 methods to check if they are the same object
eg.Animal.class, Pig.class, Cat.class

Class name 加 's' 用黎放 static methods
e.g. Objects.equals, Objects 內有一個 static method equals()

interface, example: Shape2
interface vs abstract
APIE
huge change after java 8
java 俾工具你
parent class 開 array 可以開 child class array
Example: Animal.class, Shape1.class
enum, Example: Direction, Currency, OrderStatus
generics