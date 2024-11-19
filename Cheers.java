// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) 
        {
	    String cheers= args[0];
            int n= Integer.parseInt(args[1]);
            int i=0;
            String sn=cheers.toUpperCase();
            while (i<sn.length())
            {
                if(sn.charAt(i)=='A' || sn.charAt(i)=='E'|| sn.charAt(i)=='F'|| sn.charAt(i)=='H'|| sn.charAt(i)=='I'|| sn.charAt(i)=='L'|| sn.charAt(i)=='M'|| sn.charAt(i)=='N'|| sn.charAt(i)=='O'|| sn.charAt(i)=='R'|| sn.charAt(i)=='S'|| sn.charAt(i)=='X')
                {
                        System.out.println("Give me an "+sn.charAt(i)+": "+sn.charAt(i)+"!");
        
                }
                else
                {
                        System.out.println("Give me a  "+sn.charAt(i)+": "+sn.charAt(i)+"!");
                }
                i++;
            }
            System.out.println("What does that spell?");
            for(int j=0;j<n;j++)
            {
             System.out.println(sn+"!!!");   
            }
        }
}
