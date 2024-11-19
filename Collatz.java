// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[])
	 {
	    int n= Integer.parseInt(args[0]);
		String mode= args[1];
		int s=0;
		int count=1;

		if(mode.equals("v"))
		{
			for(int i=1;i<=n;i++)
		{
			s=i;
			System.out.print(s+" ");
				do{
					if(s%2==0)
				{
					s=s/2;
					System.out.print(s+" ");
				}
				else
				{
					s= s*3+1;
					System.out.print(s+" ");
				}
				count++;
				}
			while(s!=1);
			System.out.println("("+count+")");
			count=1;
			}
			System.out.println("Every one of the first "+n+" hailstone sequences reached 1");
		}
		if(mode.equals("c"))
		{
			for(int i=1;i<=n;i++)
		{
			{
				s=i;
					do{
						if(s%2==0)
					{
						s=s/2;
						
					}
					else
					{
						s= s*3+1;
					
					}
					
					}
				while(s!=1);
				}
			}
			System.out.println("Every one of the first "+n+" hailstone sequences reached 1");
		}

		
	}
}
