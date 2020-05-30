// Stutter method - Ch14, Ex2, p925 - JUnit Test Cases
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import java.util.*;
class stutterStackTest {

	@Test
	void test() {
			
		// Create two test Stacks--test1 has elements, while test2 is empty.
			Stack<Integer> test1 = new Stack<>();
			test1.push(7);
			test1.push(3);
			test1.push(1);
			
			Stack<Integer> test2 = new Stack<>();
			
			
			
		// Call the stutter method for each test Stack.
			stutterStack.stutter(test1);
			stutterStack.stutter(test2);
			
			
		// Tests to verify output of methods are correct by calling the toString method.
			assertEquals("[7, 7, 3, 3, 1, 1]", test1.toString());
		    assertEquals("[]", test2.toString());
		    
		    
		}


}
