import java.util.*;
   public class Main
   {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	char b[]=new char[str.length()];
	for(int l=0;l<str.length();l++)
	{
	    b[l]=str.charAt(l);    
	}
	for(int i=0;i<str.length();i++)
	{
          for(int j=i+1;j<str.length();j++)
	    {
		 if(str.charAt(i)==str.charAt(j))
		    {
		         b[i]='*';
		         b[j]='*';
		    }
            }
	}
	System.out.println(b);	
   }
}