/****************************************************************************
 *
 * Created by: Peter Zhu
 * Created on: Oct
 * This is a program about stack class that can import to other class
 *
 ****************************************************************************/

import java.util.ArrayList;

public class MrCoxallStack {
	
	ArrayList<Integer> list = new ArrayList<Integer> ();
	
	public void push(int userInput) {
		list.add(userInput);
	}
	
	public void print() {
		System.out.print(list);
	}
}
