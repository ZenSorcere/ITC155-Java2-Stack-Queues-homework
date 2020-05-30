// isPalindrome method - Ch14, Ex8, p925 - JUnit Test Cases
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class palindromeQueueTest {
	@Test
	void test() {
		// Create three test Queues for various results
				Queue<Integer> test1 = new LinkedList<>();	//is a palindrome
				test1.add(7);
				test1.add(3);
				test1.add(1);
				test1.add(1);
				test1.add(3);
				test1.add(7);
					
				Queue<Integer> test2 = new LinkedList<>();	//is NOT a palindrome
				test2.add(7);
				test2.add(3);
				test2.add(1);
				test2.add(2);
				test2.add(3);
				test2.add(7);
				
				Queue<Integer> test3 = new LinkedList<>(); //is empty - is a palindrome
					
					
					
		// Call the isPalindrome method for each test Queue.
				palindromeQueue.isPalindrome(test1);
				palindromeQueue.isPalindrome(test2);
				palindromeQueue.isPalindrome(test3);
					
					
		// Tests to verify Test Queue's 1 & 3 are actually true, and Queue2 is false.
				assertTrue(palindromeQueue.isPalindrome(test1));
				assertFalse(palindromeQueue.isPalindrome(test2));
				assertTrue(palindromeQueue.isPalindrome(test3));
				
		// Tests to verify output of method maintains Queue order
				assertEquals("[7, 3, 1, 1, 3, 7]", test1.toString());
				assertEquals("[7, 3, 1, 2, 3, 7]", test2.toString());
			    assertEquals("[]", test3.toString());
			    
	}

}
