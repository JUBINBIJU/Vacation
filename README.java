1. Write a Java method to count all vowels in a string-
2. Write a Java method to count all words in a string
3. Write a Java method to print characters between two characters
Note: Prints 20 characters per line
Expected Output:
( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
< = > ? @ A B C D E F G H I J K L M N O
P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
d e f g h i j k l m n o p q r s t u v w
x y z

4. Write a Java method to check whether a string is a valid password. Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
5. Write a Java method (takes a number n as input) to displays an n-by-n matrix
Expected Output:
Input a number: 10
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0
6. Write a Java method to find all twin prime numbers less than 100.
Expected Output:
(3, 5)

(5, 7)
(11, 13)
(17, 19)
(29, 31)
(41, 43)
(59, 61)
(71, 7)
7. Write java program with Stack and Queue classes and perform the operations of both in main
program.
8. write a simple Java program to check if a given String is palindrome or not. A Palindrome is a
String which is equal to the reverse of itself, e.g., "Bob" is a palindrome because of the reverse of
"Bob" is also "Bob."
9. Write a program that creates a 2-d array with int values the first element should be an array containing
32. The second array should be an array containing 500 and 300 .The third element should be an array
containing 39.45 and 600.Declare, allocate and initialize the array display its length and elements.
10. Integer Palindrome An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a
palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234.
11. Reverse words of a sentence
12. Binary search
13. Write a program to check if two given String is Anagram of each other. Your function should
return true if two Strings are Anagram, false otherwise. A string is said to be an anagram if it
contains the same characters and same length, but in a different order, e.g. army and Mary are
anagrams. You can ignore cases for this problem.
14. Design a Vending Machine
15. The first non-repeated character of String
16. Finding Middle element of linked list in one pass
17. Create a binary and perform Pre-order traversal without recursion
18. In order traversal without recursion
19. Print all leaves of a binary tree
20. Sort array using quicksort
21. Write a Java program to print all permutations of a given String. For example, if given String is
"GOD" then your program should print all 6 permutations of this string, e.g. "GOD," "OGD,"
"DOG," "GDO," "ODG," and "DGO."
22. Adding two matrices in Java
23. Removal all white space from String
24. Write a menu driven program to Create a linked list, display contents, find the middle element,
Reverse a linked list , Number of items in a list
25. Check if two string rotation of each other
26. Write a program which accepts two given String and checks if they are the rotation of each. If
they then return true otherwise return false. A String is said to be a rotation of other string if they

contain same characters and the sequence is rotated across any character, e.g. "dabc" is a rotation
of "abcd" but "dbac" is not
27. Write a program to check if given linked list has a loop or not. Sometimes a linked list get
corrupt, and two nodes point to the same node, which forms the loop or cycle in the linked lis
28. Sudoku checking Sudoku is a number puzzle in which the goal is to complete a 9-by-9 table
that is partially filled. When completed, the table must satisfy the following conditions:
• In each row, 1 through 9 must appear exactly once each.
• In each column, 1 through 9 must appear exactly once each.
• The 9-by-9 table can be naturally divided into nine 3-by-3 subtables. The third requirement
Is that in each 3-by-3 subtable, 1 through 9 must appear exactly once each.
Write a method, sudokuSolutionCheck, that receives a 9-by-9 two-dimensional array of
int values as its formal parameter, and then returns whether or not the array represents a
Sudoku solution. The method may halt with ArrayIndexOutOfBoundsExceptions if the row or
column dimension of the array is smaller than 9 or the array contains an element smaller than
or greater than 9.

Object Oriented programming concepts question
l . Define a class called FuelMonitor that will be used to check the amount of fuel that is left over in a
vehicle after travelling a certain distance. The class
should have instance variables tankCapacity to store initial size of the tank and efficiency to store initial
efficiency of the vehicle. Also, set the variable
fuel_ in_ tank to zero that is used to store initial fuel in tank. Include a method that returns ini_tank_size,
ini_effi and fuel_in_tank. Include a method
add_fuel that calculates how much fuel can be filled depending upon the fuel already in the tank and
the capacity of the tank. Also, include a method
driveDistance that returns how much distance can be travelled with the fuel available in the tank with
the efficiency provided.
2. Number manipulation Suppose we are writing a program PlayWithNumbersDecomposed,
in which we have two tasks:
(a) The program receive two integers, a and b, from the user and then prints a + b, a - b,
a * b, a / b, and a % b (we anticipate that the user will not enter 0 for the second number).
(b) The program receives three integers, a, b, and c, from the user and then prints the result of
(a - b) / c for each of the six possible permutations among the three numbers.
Write the code for this program so that it has two separate methods that handle the two tasks. The
method main calls the two methods one after the other. Each non-main method instantiates its
own Scanner object with System.in. Here is an example of how the program may interact
with the user.
Enter two integers: 1000435 345
2 a + b is equal to 1000780
3 a - b is equal to 1000090
4 a * b is equal to 345150075
5 a / b is equal to 2899
6 a % b is equal to 280

7 Enter three integers: 34325 79 -40
8 (a - b)/c is equal to -856
9 (a - c)/b is equal to 435
10 (b - c)/a is equal to 0
11 (b - a)/c is equal to 856
12 (c - a)/b is equal to -435
13 (c - b)/a is equal to 0
3. WAP to create a super class called figure that stores the dimensions of a two dimensional object. It
also defines a method called area () that computes the area of an object. The program derives two sub
classes from figure. The first is rectangle and the second is Triangle. Each of these subclasses
overrides area (), so that it returns the area of a rectangle and a triangle respectively.
4. Define an interface using JAVA that contains a method to calculate the perimeter of an object.
Define two classes circle and Rectangle with suitable fields and methods . Implement the interface
"perimeter" in these classes. Write the appropriate main() method to create object of each class and
test all the methods.
5. Write a program in Java to create a class 'Box' which contains three data members for holding
width, height and length of box and two methods
'area' and 'volume' to calculate and return the area and volume of box. Create another class named
'BoxDemo' which uses Box class.
6. An University has applied promotion criteria for students. According to criteria a student cannot
promote to next academic year if he have less than 4.5 CGP A. A developer is trying to implement
this situation using exception handling in JAVA.
Write a correct Java code to help him.
Define a class Electbill that contains consumer details as follows :-
Data members/Instance variable :
cno (long) consumer number
cname (String) consumer name
cadd (String) consumer address
NOU(long) to store number of units consumed
Member functions/Methods :
(i) Electbill( .... ) : Parameterised constructor to assign values to consumer number consumer name
and address
(ii) void dis play() : Di splay consumers details
(iii) void calculate() :Calculate the monthly bill of consumer according to following slabs and it
should also display the total amount to be paid.
Number of units Rate
consumed
1-100 Rs. 500/- rental charges only
101-200 Rs. 1.00 per call+ rental charges of Rs. 500
201-300 Rs. 1.20 p·er call+ rental charges of Rs. 500
Above300 Rs. 1.50 per call + rental charges of Rs. 500

7. Coordinate system conversion There are two coordinate systems for a point on the two
dimensional space with the origin. One system, the Cartesian system uses a pair of axes that
are perpendicular to each other and specifies the point suing the x and y values of that point.
The other system, the polar system, has one axis and uses the distance from the origin and the
counter-clockwise angle from the axis in the range of −π to π degrees. Write a program named
Coordinate Conversion that demonstrates the conversions between the two. The program
should have two methods, one for converting from the former type to the latter and the other
for converting from the latter type to the former. The method main prompts the user to enter
information and makes the calls to these methods, where the methods perform their respective
conversions and print the results on the screen. Use the fact that the angle (in radian) of (x, y) is
the sign of y times the arc-cosine of y/x and that the cosine is x/sqrt(x
2 + y
2
).

8. Euclidean distance Write a program named Euclidean that takes six double numbers a1,
b1, c1, a2, b2, c2 as parameters, and then prints the Euclidean distance between the
points (a1, b1, c1) and (a2, b2, c2) as sqrt((a1 − a2)

2 + (b1 − b2)

2 + (c1 − c2)
2.
)

9. Writing an interface DateInt Consider the following interface, which is for recording the
year, the month, and the day value of a date on or after January 1, 1900.

public interface DateInt
{
public int getYear ();
public int getMonth ();
public int getDay ();
public static boolean isLeapYear( int year )
{
...
}
}

The static method isLeapYear returns a boolean representing whether or not the year that the
formal parameter specifies is a leap year. After the introduction of the Gregorian calendar in the
year 1582, the determination of a leap year is made using the following rule: a year Y is a leap
year if and only if Y is either a multiple of 400 or a multiple of 4 and not a multiple of 100. For
example, the year 2000 is a leap year but 2100 is not one. Assuming the year to be tested for a leap
year is greater than 1582, write the static method isLeapYear.
10. Write a class named DataZero that implements the
interface DateInt from the previous question. The class has one constructor. The constructor
receives three int values as parameters. The three values represent the year, the month, and the
day. Write the constructor so that if the combination of year, month, and day is invalid, it throws
an IllegalArgumentException.
11. Comparable class StudentBasicInt Write an interface named StudentBasicInt for
recording information of a single student. The interface has three abstract methods that are expected
to be implemented as getters, String getFamilyName(), String getOtherNames(),
and int getRank(). The expected actions of these methods are to return the family name, the
other names, and an integer representing the academic rank (1 for freshman, 2 for sophomore, 3 for
junior, and 4 for senior). The interface should define int constants, FRESHMAN, SOPHOMORE,

JUNIOR, and SENIOR representing these four ranks. The interface must define setters.
void setFamilyName( String o ), void setOtherNames( String o ), and
void setRank( int o ), which store the names and the rank.
Write a class named StudentBase that implements the interface StudentBaseInt from the previous
question. Furthermore, write a class StudentBaseMaster with just one static method public static
StudentBaseInt create( String a, String b, int c ) that returns a StudentBaseInt object instantiated with
the three parameters a, b, and c, that represent the family name, the other names, and the rank.
