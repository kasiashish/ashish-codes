import java.util.*;

public class mahesh 
{
	static int low(int p,int r,int x)
	{
		for(int i=p;i<=r;i++)
		{
			String s=String.valueOf(i);
			int sum=0;
			for(int j=0;j<s.length();j++)
			{
				sum+=Integer.parseInt(s.charAt(j)+"");
			}
			if(sum==x)
			{
				return i;
			}
		}
		return 0;
	}
	static int high(int p,int r,int x)
	{
		for(int i=r;i>=p;i--)
		{
			String s=String.valueOf(i);
			int sum=0;
			for(int j=0;j<s.length();j++)
			{
				sum+=Integer.parseInt(s.charAt(j)+"");
			}
			if(sum==x)
			{
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		int x=sc.nextInt();
		System.out.println(low(p,r,x));
		System.out.println(high(p,r,x));
	}
	
}