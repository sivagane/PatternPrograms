package org.test;

public class InvertedTriangle {
public static void main(String[] args) {
	int i,j,k,n=6;
	for(i=n;n<=0;i++) {
		for(j=n;j<=n-i;j--) {
			System.out.print(" ");
		
			for(k=0;k<(2*i)-1;k++) {
				System.out.println("*");
			}
		}
		System.out.println();
	}
}
}
