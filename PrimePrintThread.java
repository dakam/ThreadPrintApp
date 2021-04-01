package lab1_threads;

import java.util.ArrayList;
import java.util.List;

public class PrimePrintThread extends Thread{
	private int start=0;
	private int end =0;
	private List<Integer> numList=new ArrayList<Integer>();
	
	PrimePrintThread(int start, int end) {
		this.start=start;
		this.end=end;
	
	}
	
	
	@Override
	
	public void run () {
		int count=0;
		for (int i=start;i<=end;i++) {
			
			if(isPrime(i)) {
			
				
				numList.add(i);
				
				
			}
		}
		
		
	}
	
	public List<Integer> getNumbers() {
		
		return numList;
	}
	public boolean isPrime(int n) {
		
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}

}
