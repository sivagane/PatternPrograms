package org.test;

public class CrossPattern {
public static void main(String[] args) {
	int i,j,lines=8;
	for(i=1;i<=lines;i++) {
      for(j=1;j<=lines/2;j++) {
			if(i==j) {
				System.out.print(j);
			}
			else 
				if(i>4&&j==lines-i) {
					System.out.print(j);
			}
				else {
					System.out.print(" ");
				}
      }
      j=j-2;
while( j>=1) {
		if(i==j) {
			System.out.print(j);
		}
		else
			if(i>4&&j==lines-i){
				System.out.print(j);
			}
			else {
				System.out.print(" ");
			}
	j--;
}
System.out.println();
}
}
}
