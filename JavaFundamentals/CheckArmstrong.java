/*
Check Armstrong

Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,

371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634 
 */
package JavaFundamentals;
import java.util.Scanner;
public class CheckArmstrong {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c,r,f,sum=0,i,n=0;
		c=s.nextInt();
		a=c;
		b=c;
		while(c>0)
		{
			c=c/10;
			n++;
		}
		while(a>0)
		{
			f=1;
			r=a%10;
			for(i=1;i<=n;i++)
				f=f*r;
			sum=sum+f;
			a=a/10;
		}
		if(b==sum)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
