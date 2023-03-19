### Solution #1. With additional array

Steps to solve the problem:
1. We first create a new array (list) to store the end result
2. Then loop through the given array 
3. If the number is not even (% 2 != 0) then we add it to result 
4. We return the result after the loop is ended 

**Note:** I always prefer using ArrayList than array as it is more dynamic  

Time Complexity: O(n)  
Space Complexity: O(n)  

*Try to implement the solution yourself before jumping into the solution!*

#### Link to the solution:
[Solution in Java](../../../solutions/java/datastructures/array/RemoveEvenIntegersS1.java)

Solution in Python (to be added later)

### Solution #2. Using filter method in Java Stream API

Steps to solve the problem:
1. Open a stream using Arrays class and provide the given array as input
2. Filter the odd numbers 
3. Convert the stream to a list and return

**Note:** You need to use additional boxed() method int the stream to convert int to Integer

Time Complexity: O(n)  
Space Complexity: O(n)

*Try to implement the solution yourself before jumping into the solution!*

#### Link to the solution:
[Solution in Java](../../../solutions/java/datastructures/array/RemoveEvenIntegersS2.java)
