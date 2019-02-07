# CS2040: Data structures and algorithms
Compilation of CS2040 forum "Soap Operas" (read: problem sets)

1. Difference between dates

    To begin our soap opera, we are interested to find out
    the number of days betwen two give dates. This could be
    used by some banking applications for calculating daily
    based interest, etc. The input are two dates in the format
    ddmmyyyy. 
    
    What you need to do is to identify all the sub-problems
    and then describe your solution to each sub-problem. Your
    solution should not make use of any library routines in any
    programming language. That is, you have to do everything
    yourself.
    
    Please do not be satisfied with the first idea that comes
    to your mind. Think carefully and you may find a better
    solution. In particular, if your solution has many nested if
    statement, you should try to find a better solution.
    
    You do not need to implement your algorithm. Just pseudo
    code will do.  
     As I said during the lecture, you must have a complete
    algorithm before you start coding.  

***

2. Efficient sum query

    Assume that you are working as a customer service officer for a company.
    Each morning you are given an array of great number (billions) of integers
    and throughout the day, your customers will call in and ask you to give them
    the sum of all the integers between index i and j. Most of the customers are
    very impatient. They expect to get an answer instantly. So you have to come
    out with a program to help you do that. But before you implement the program,
    you were told to first write an algorithm that accepts two integers, i and j, which
    are the indices of the array and find the sum of all the numbers from index i to
    index j, inclusive.For example, if the array contains {2, 1, 3, 5, 6, 4, 7, 8, 9, 10),
    given 2 and 7 as i and j respectively, your algorithm should answer 33.  
    Adding the numbers each time a user makes a query is considered very inefficient.
    Devise an algorithm so that the queries can be answered efficiently. You may use
    additional data structure in your algorithm.  

***

3. Biggest number

    Given a 4-digits number, do the following:
    1. check that at least one of the digit is different from the other three.
     For example, 1333 is good but 3333 is not valid.
    2. Use the 4 digits from the original number to form the largest number.
    3. Use the 4 digits from the original number to form the smallest number.
     For example, if the given number is 2315, the largest number formed is
     5321 and the smallest number is 1235.

    You are not allowed to use any sorting method to sort the digits. You should
    not have if statements to rank the digits. You can consider these restrictions
    as hints on how to solve the problem.  

***

4. Run about number

    This episode involves a problem taken from the online judge website, https://uva.onlinejudge.org/
    If you are looking for challenge, you can create an account and try to solve some other
    problems there. A first step to competitive programming.

    RunAround number:
    An N-digit runaround number is characterized as follows:

    It is an integer with exactly N digits, each of which is between 1 and 9, inclusively.
    The digits form a sequence with each digit telling where the next digit in the sequence occurs. This is done by giving the number of digits to the right of the digit where the next digit in the sequence occurs. If necessary, counting wraps around from the rightmost digit back to the leftmost.
    The leftmost digit in the number is the first digit in the sequence, and the sequence must return to this digit after all digits in the number have been used exactly once.
    No digit will appear more than once in the number.
    For example, consider the number 81362. To verify that this is a runaround number, we use the steps shown below:

    1. Start with the leftmost digit, 8  1  3  6  2 
    2. Count 8 digits to the right, ending on 6 (note the wraparound)
    3. Count 6 digits to the right, ending on 2:
    4. Count 2 digits to the right, ending on 1:
    5. Count 1 digit to the right, ending on 3:
    6. Count 3 digits to the right, ending on 8 (where we began):
    Again for this episode, try to think of the sub-problems and think about how to
    solve each of the sub-problems. I am not expecting you to code the program 
    especially not Python program. 

    Just think about how many sub-problems are involved here and whetner
    some of the subproblems can be considered at the same time. 

    We will have a subsequent episode to consider incremental programming.   

***

5. Biggest integer

    Given a list of non negative integers, arrange them
    such that they form the largest possible number.
    For example, given [50, 2, 1, 9], the largest formed number is 95021.
    You can sort the integers if you wish.

    Check your algorithm with [5, 50, 56]  

***

6. Balance array

    Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is               equal to the sum of the numbers on the other side.

    For example,
    canBalance([1, 1, 1, 2, 1]) → true
    canBalance([2, 1, 1, 2, 1]) → false
    canBalance([10, 10]) → true

    This is taken from codingbat.com, another website that provides you with some simple problrms
    for you to practice. You can test your solution by submitting it to the website for the problem Array-3 > canBalance. 

***

7. Scanner problem

    This episode shows you a possible problem when you try to create
    two Scanner objects in your program. 

    The program in the attached file is to read in an integer N (1 or 2) .
    if N = 1, it will call the first method to read another integer M and
    then read in the M integers that follow and find their average.
    If N = 2, it will read the follwing integers until eof is encountered
    and find the average of all these integers.

    The program runs properly and produces the correct result if
    input are entered using the keyboard. But if you re-direct the input
    from a input file (attached), the program crashes. Why?

    {Compile the program:
      ```javac TestScanner.java```
        
    Run without re-direction: 
      ```java TestScanner```
        
    then type in the input
    
    Run With re-direction:
      ```java TestScanner  < TScanner1.in```    
      and 
      ```java TestScanner < TScanner2.in```
}

   Note that when yuou use the re-direction operator '<' you are telling
   the system to treat the file as the standard input "System.in".
   You can also use the re-direction operator '>' to treat the file as
   the standard output "System.out". For example, the command
    
     ```java TestSCanner < TScanner1.in > out1.out```

   will run the program TestSCanner and use the file TScanner1.in
   as System.in and out1.out as System.out. You can then check
   whether your program produces the correct output by comparing
   the standard output TScanner1.out with the output produced by
   your program using the command

      ```diff TScanner1.out out1.out```
   
   if the command return nothing, it means the two files are exactly
    the same. Hence your program passed this test.

   Try to find out the reason and make sure that you dont do it during
    any of the programs that you have to submit to codecrunch. That
    is, dont do this during sit-in lab and PE because codecrunch execute
    your program with re-direction.
   
   By the way, eof in unix is CTRL-d. 

***

8. Another scanner problem

    This episode shows you another possible problem when using
    scanner to read input.
    The attached program is supposed to read a matrix of integers
    and then read a line from the standard input.
    But even though there is a line after the matrix, the program read
    an empty line when a textfile (attached) is re-directed as standard
    input. When you enter the input on the keyboard, the program does
    not wait for you to enter the line.
    Again, try to figure out what is happening and try to avoid this
    problem in future lab.

    There are three other things to note:
    1. We can have 2 Scanner objects if the input streams are different.
    2. The input stream can be any valid stream of characters.
    3. See the use of println statements to indicate when the problem
    occurred. A form of debugging. 
    4. You should try to understand how the methods in the Scanner
    class work so that you know when and how to use them in your
    programs.  
    
***

9. What's wrong with this
```java
public class Test {
     private int a = 0, b = 0;

     private int add() {
          return a + b;
     }

     public static void main(String[] args) {
           a = 2;
           b = 3;
           System.out.println(add());
      }
}  
// What is wrong with the above class? How to make it right?
```

***

10. What's wrong with this (part 2)

    In this episode, you should download the two attached files into
    the same working directory.
    First compile ArrayList.java then TestArrayList.java
    You will receive a syntax error saying that the add() method cannot
    be found in the ArrayList class even though you have imported the
    java.util.* in TestArrayList.java. Note that ArrayList is a class in the
    package java.util

    Explain what is wrong and share with us what you have to do to finally
    get it compile.

    Hopefully it would help you when you get the problem in future. 
    
***

11. Magic square

    For this episode, please refer the [this page](http://www.math.hmc.edu/funfacts/ffiles/10001.4-8.shtml)
    there is an algorithm to generate a N*N magic square where N is an odd number.

    Write a java program to implement the algorithm.  
    
***

12. 2048

    This episode is taken from a CS1020 sit-in lab (later become take-home lab)

    One important thing is to practice modular and incremental programming.
    Identify the common thing to do and then create a method to take care
    of it. Then see how the original problem can be reduced into the common
    thing. Then try to take care of each of these sub-problems. 

***

13. Candy crush

    I discourage people on wasting time playing computer games
    especially those that are very addictive. Candy crush is one of 
    them.
    So this episode is not asking you to play the game but rather
    writing a program that will perform one of the funtionalities in the
    game.
    Again, this was one of the previous sit-in lab problem. So take 
    this as an extra practice if you have time.

***

14. LinkedList interview

    When you go for IT job interview, the interviewers might ask you this kind of questions.

    Given two linked lists which have some common nodes at the end, write a method to find and return a linked list that contains those common nodes. For example, in the following diagram, your method should return a linked list containing the last three nodes.
    
    [diagram](https://ivle.nus.edu.sg/v1/ckeditor/getFile.ashx?id=af295c2d-fb03-49fe-94e7-99e9a35ee389&n=image(17).png)

    Assume that the values in the two linked lists are distinct integers sorted in ascending order. Complete the following method.

    You are not allowed to use any additional data structure in your solution but some temporary variables are allowed.
    ```
    /* preCond: head1 and head2 point to two non-empty linked lists with values sorted in ascending order.
        postCond: return a reference pointing to the first node of the common nodes of
                         the two given lists. If there is no common nodes, return null */ 
    ```

***

15. LinkedList interview part II

    This is a variation of Episode 14. In this episode, the values in the linkedlist
    are not distinct and not sorted but you are allowed to use two other data
    structures in your solution. You can only traverse the linkedlists once and
    you are not allowed to go through what you stored in the data structures
    more than once.

    Remember you are to return the reference of the head of the common nodes.
