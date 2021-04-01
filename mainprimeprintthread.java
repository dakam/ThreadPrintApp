package lab1_threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mainprimeprintthread {
	static List<Integer> numList = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		//displayprime5threads();//part 4
		displayprime10threads();   //part5 and 6 included
	
	}
	
	static void displayprime5threads() {
	for(int i=1;i<=1000000;i=i+200000) {
			
			PrimePrintThread pt = new PrimePrintThread(i, (i+200000-1));
			pt.start();
			
		}
	}
	
	
	static void displayprime10threads() {
	for(int i=1;i<=1000000;i=i+100000) {
			
			PrimePrintThread pt = new PrimePrintThread(i, (i+100000-1));
			pt.start();
			
			  try { 
				  pt.join(); 
				  
				  numList.addAll(pt.getNumbers());
			  
			  } catch (InterruptedException e) { 
			  e.printStackTrace(); }		 		
		}
	Collections.sort(numList);
	
	for(int i=0;i<numList.size();i++) {
		System.out.println(numList.get(i));
		
	}
	
	
	}
	
	

}
