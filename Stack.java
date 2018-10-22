/****************************************************************************
 *
 * Created by: Peter Zhu
 * Created on: Oct
 * This is a program about stack which import MrCoxallClass
 *
 ****************************************************************************/


import java.util.*;

public class Stack {
	
	public static void main(String[] args) {
		System.out.println("Enter an Integer that can put on the stack. ");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		MrCoxallStack stack = new MrCoxallStack();
		
		stack.push(user);
		stack.print();

	}
	
}
