//*******************************************************************
// Stutter - Ch14, Ex2, p925
//  
// Write a method called stutter that accepts a stack of integers as a
//   parameter and replaces every value in the stack with two occurrences
//   of that value. Preserve the original relative order. For example,
//   if the stack stores [3, 7, 1, 14, 9], the method should change it
//   to store [3, 3, 7, 7, 1, 1, 14, 14, 9, 9]. Use a single queue as
//   auxiliary storage.
// 
// By: Michael Gilson
// Date: 5/30/2020
//*******************************************************************

import java.util.*;

public class stutterStack {

	public static void main(String[] args) {
		
// Create test Stack, and add elements to it
		Stack<Integer> test = new Stack<>();
		test.push(10);
		test.push(43);
		test.push(1);
		test.push(77);
		
// Display starting test Stack state
		System.out.println("Original Stack: " + test);
		
// Run stutter method on the test Stack
		stutter(test);
		
// Display post-stutter stack results
		System.out.println("Stuttered Stack: " + test);

	} //end main
	
// Method stutter with Stack of Integers as a parameter
	public static void stutter (Stack<Integer> s) {

// Create auxiliary queue of integers
		Queue<Integer> q = new LinkedList<>();
		
// While there are still elements in the stack, keep removing top element
//   and save it in a variable. Add the variable twice to the queue. 
		while (!s.isEmpty()) {
			int n = s.pop();
			q.add(n);
			q.add(n);
		}  //end while
		
// Move all elements from the queue into the stack.
		while (!q.isEmpty()) {
			s.push(q.remove());
		} //end while
		
// Because the stack is not in it's original order, we need to reverse
//   the order by pop all elements from the stack back into the queue.
		while (!s.isEmpty()) {
			q.add(s.pop());
		} //end while
		
// And then move them back to the stack again, returning them to the
//   original order they were in.
		while (!q.isEmpty()) {
			s.push(q.remove());
		} //end while
		
		
		
	} //end stutter method 
	
} //end class
