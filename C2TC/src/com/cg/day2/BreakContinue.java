package com.cg.day2;

public class BreakContinue {

	public static void main(String[] args) {
	    for(int i=1;i<10;i++) {
	    	if(i==4) {
	    		// the iteration will be skipped
	    		continue;
	    	}
			System.out.println(i);
	    	if(i==7) {
	    		break;
	    	}
	    }
	}
}
