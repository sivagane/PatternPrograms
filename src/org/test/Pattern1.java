package org.test;

public class Pattern1 {
public static void main(String[] args) {
	int i,j,lines=5;
	for(i=1;i<=lines;i++) {
		for(j=lines;j>=1;j--) {
			if(i!=j) {
				System.out.print(j);
			}
			else {
				System.out.print("*");
			}
				}
		System.out.println();
	}
	}
}
