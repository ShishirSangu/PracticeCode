#Lamda Function

I started with lamda function in that I learnt : 

Supplier Lambda: Created a no-parameter lambda function using Supplier to return a greeting message.

Consumer Lambda: Implemented a single-parameter lambda function with Consumer to print a message to the console.

BiFunction Lambda: Defined a two-parameter lambda function using BiFunction to add two integers.

Function Lambda with Block: Used a lambda with a block of code via Function to compute and return the square of an integer.

Stream Filter Lambda: Applied a lambda function within a stream to filter and print names starting with the letter "J".

Stream Map Lambda: Used a lambda function to map a list of numbers to their squares and collected the results into a new list.


#Function Interface

After I utilized Java's Function interface to demonstrate various functional programming concepts:

Checked if a number is even with a function that returns a boolean.
Converted integers to formatted strings using a function.
Calculated the square of integers and used function chaining with andThen to format the result.
Applied and combined functions to perform complex operations and transformations.


#Java Streams

* Operation: Filtered and printed even numbers from a list.
Code: num.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
Learning: Showed how to use filter to process and display elements based on a condition.
Convert Strings to Uppercase:

* Operation: Converted each string in a list to uppercase and printed it.
Code: names.stream().map(String::toUpperCase).forEach(System.out::println);
Learning: Demonstrated the use of map to transform elements in a stream.
Default Natural Sorting:

* Operation: Sorted a list of strings in natural order and printed them.
Code: fruits.stream().sorted().forEach(System.out::println);
Learning: Illustrated how to use sorted for ordering elements in a stream.
Remove Duplicates:

* Operation: Removed duplicate elements from a list and printed the unique values.
Code: numbers.stream().distinct().forEach(System.out::println);
Learning: Showed how to use distinct to filter out duplicate elements.
Perform Action on Each Element:

* Operation: Printed each element of a list.
Code: name.stream().forEach(System.out::println);
Learning: Demonstrated the forEach method for executing an action on each element.
Count Elements in Stream:

* Operation: Counted the number of elements in a list.
Code: long count = name1.stream().count();
Learning: Used count to get the total number of elements in a stream.
Specialized Streams:

* Operation: Summed elements of an IntStream and printed the sum.
Code: IntStream intStream = IntStream.of(1, 2, 3, 4, 5); int sum = intStream.sum();
Learning: Demonstrated the use of IntStream for specialized numeric streams.

# Threads

Threads in Java allow for concurrent execution of tasks, improving the efficiency and responsiveness of applications. 
A thread is a lightweight process that shares the same memory space with other threads but runs independently. 
Java provides built-in support for multithreading, which can be implemented by extending the Thread class or implementing the Runnable interface. 
Key methods include start() to begin thread execution, run() to define the task, sleep() to pause the thread, and join() to wait for a thread to finish. 
Proper use of threads enables efficient multitasking, but synchronization is crucial to prevent issues with shared resources. 
Understanding and utilizing threads effectively is essential for developing high-performance Java applications.


