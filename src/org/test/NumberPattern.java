package org.test;

public class NumberPattern {
public static void main(String[] args) {
	int n=10,i,j,count;
	for(i=1;i<=n;i++) {
		count=0;
		for(j=1;j<=n;j++) {
			if(count<i-1) {
				if(!(j<n-i+1)) {
					System.out.print(j);
					count++;
				}
			}
		}
		System.out.print("0");
		count=0;
		j--;
		for(--j;j>=1;j--) {
			if(count<i-1) {
				System.out.print(j);
				count++;
			}
		}
	System.out.println();
	}
	}
}
