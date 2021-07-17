import java.util.*;
import java.lang.*; // packages to be included
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner s=new Scanner(System.in); // reading new lines
     int t=s.nextInt();
     while (t-->0){
         long c=s.nextLong();
         long d=s.nextLong();
         long l=s.nextLong();
         long m=0;
         if (c>2*d)
             m=c-(2*d);
         if (l%4==0 && l<=((c+d)*4) && l>=(d+m)*4 )
             System.out.println("yes");
         else
             System.out.println("no");
     }
		
	}
}
