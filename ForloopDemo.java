package in.satheesh.coreJbasics;

/*
 * Initialization condition: Here, we initialize the variable in use. It marks the start of a for loop. An already declared variable can be used or a variable can be declared, local to loop only.
Testing Condition: It is used for testing the exit condition for a loop. It must return a boolean value. It is also an Entry Control Loop as the condition is checked prior to the execution of the loop statements.
Statement execution: Once the condition is evaluated to true, the statements in the loop body are executed.
Increment/ Decrement: It is used for updating the variable for next iteration.
Loop termination:When the condition becomes false, the loop terminates marking the end of its life cycle.
 */
public class ForloopDemo {

	public static void main(String[] args) {
		 // for loop begins when x=1 
        // and runs till x <=4 
        for (int x = 1; x <= 4; x++) 
        {
            System.out.println("Value of x:" + x); 
        }
        for(int y=1; y<=5; ++y)
        {
        	
        	System.out.println("value of Y :"+y);
        }

	}

}
