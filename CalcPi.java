// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
		int n= Integer.parseInt(args[0]);
		double x=3;
		double sum=1;
		{
			for(int i=1;i<n;i++)
			{
				if(i%2==0)
				{
					sum=sum+(1/(x));
				}
				else if (i%2!=0)
				{
					sum=sum-(1/(x));
				}
				x=x+2;
			}
			sum=sum*4;
System.out.println("pi acording to Java:     "+Math.PI);
System.out.println("piת approximated:     "+sum);
		}
	}
}