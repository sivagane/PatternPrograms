package org.test;

public class Pattern {
public static void main(String[] args) {
	int i,j,lines=4;
	for(i=0;i<lines;i++) {
		for(j=1;j<=lines;j++) {
			if(j<(lines-i)) {
				System.out.print(j);
			}
			else {
				System.out.print("*");
			}
		}
		for(j=lines;j>=1;j--) {
			if(j>=(lines-i)) {
				System.out.print("*");
			}
			else {
				System.out.print(j);
			}
		}
		System.out.println();
		}
		}
}
