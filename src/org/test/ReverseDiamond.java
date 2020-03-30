package org.test;

public class ReverseDiamond {
public static void main(String[] args) {
	int space,lines=10;
	space=(lines*2)-2;
	
	for (int i=1;i<=(lines/2);i++) {
		boolean flagl=false;
		for(int j=1;j<=i;j++) {
			if(!flagl) {
				System.out.print("*");
				flagl=true;
			}
			else {
				System.out.print(" ");
				System.out.print("*");
			}
		}
	for(int j=0;j<space;j++) {
		System.out.print(" ");
	}
	space= space-4;
	boolean flagr=false;
	for(int j=1;j<=i;j++) {
		if(!flagr) {
			System.out.print("*");
		    flagr=true;
		}
		else {
			System.out.print(" ");
			System.out.print("*");
		}
	}
	System.out.println();
	}
	space=space+4;
	for(int i=(lines/2);i>0;i--) {
		boolean flagl=false;

		for(int j=1;j<=i;j++) {
			if(!flagl) {
				System.out.print("*");
				flagl=true;
			}
			else {
				System.out.print(" ");
				System.out.print("*");
			}
		}
       for(int j=0;j<space;j++) {
    	   System.out.print(" ");
	}
       space=space+4;
       boolean flagr=false;
       for(int j=1;j<=i;j++) {
    	   if(!flagr) {
    		   System.out.print("*");
    		   flagr=true;
    	   }
    	   else {
    		   System.out.print(" ");
    		   System.out.print("*");
    	   }
       }
	   System.out.println();
}
}
}
