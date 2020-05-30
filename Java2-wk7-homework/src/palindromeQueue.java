//*******************************************************************
// isPalindrome - Ch14, Ex8, p925
//  
// Write a method called isPalindrome that accepts a queue of integers as
//   a parameter and returns true if the numbers in the queue are the same
//   in reverse order. For example, if the queue stores [3, 8, 17, 8, 3],
//   the method should return true.  Empty queue should be considered a
//   palindrome. Method must restore the parameter queue to its original
//   state before returning. Use one stack as auxiliary storage.
// 
// By: Michael Gilson
// Date: 5/30/2020
//*******************************************************************

import java.util.*;

public class palindromeQueue {

	public static void main(String[] args) {
		
// Create test Queues, and add elements to them
		Queue<Integer> test1 = new LinkedList<>();	//is a palindrome
		test1.add(3);
		test1.add(8);
		test1.add(17);
		test1.add(8);
		test1.add(3);
		
		Queue<Integer> test2 = new LinkedList<>();	//is NOT a palindrome
		test2.add(1);
		test2.add(5);
		test2.add(10);
		test2.add(7);
		test2.add(1);
		
// Display test queues and results of isPalindrome methods on each
		System.out.println("Test Queue:  \t\t" + test1);
		System.out.println("Palindrom status: \t" + isPalindrome(test1));	//returns true
		System.out.println("Test Queue, after: \t" + test1);
		System.out.println();
		System.out.println("Test Queue: \t\t" + test2);
		System.out.println("Palindrom status: \t" + isPalindrome(test2));	//returns false
		System.out.println("Test Queue, after: \t" + test2);
		

	} //end main
	
	
// Method isPalindrome with Queue of Integers as a parameter
	public static boolean isPalindrome (Queue<Integer> q) {
		
// Create auxiliary Stack of Integers
// Create variables for queue size and boolean return, defaulted to true.
		Stack<Integer> s = new Stack<>();
		int size = q.size();
		boolean isPal = true;
		
// For loop goes through queue a number of times equal to starting queue size. Removes 
//   the front item from the queue, and simultaneously adds it to the end of the queue 
//   as well as entered to the stack. 
		for (int i = 0; i < size; i++) {
			int n = q.remove();
			q.add(n);
			s.push(n);
		} //end for loop
		
// For loop will go through both the queue and stack a number of times equal to queue size,
//   removing the front/top element from each, and adds the queue item back to the end of the queue.
// Compares the removed stack element to the removed queue element. If they are not equal,
//   the Queue is not a palindrome, so the variable isPal is set to false.
		for (int i = 0; i < size; i++) {
			int a = s.pop();
			int b = q.remove();
			q.add(b);
			if (a != b) {
				isPal = false;
				
			} //end if
		} //end for loop

// Returns to boolean value, as required by the method header
		return isPal;
		
	} //end isPalindrome method

} // end class
