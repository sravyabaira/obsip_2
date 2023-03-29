import java.util.*;
import java.util.Random.*;
class number
{
	public static void main(String[] args)
	{
		int c=0,s=20;
		double r,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your a number ");
		n=sc.nextInt();
		while(c<10)
		{
			r=Math.ceil(Math.random()*100);
			if(n==r)
			{
				System.out.println("number is "+r);
				System.out.println("your guess correct!");
				System.out.println("your score!"+s);
				break;
			}
			else if(n>r)
			{
				System.out.println("number is "+r);
				System.out.println("it is greater");
				c++;
				s=s-2;
			}
			else if(n<r)
			{
				System.out.println("number is "+r);
				System.out.println("it is lesser");
				c++;
				s=s-2;
			}
		}
		System.out.println("your unable to guess!");
		System.out.println("your score! "+s);
	}
}