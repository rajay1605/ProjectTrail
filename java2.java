import java.util.*;
    public class Main
    {
	public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(1,"ABC");
	map.put(2,"PQR");
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id:");
	int id=sc.nextInt();
        System.out.println("Enter BookName:");
	String bname=sc.next();
	for(Map.Entry m:map.entrySet())
	{      
           if(m.getKey().equals(n)){
           System.out.println("Book Already exists");
           System.out.println(m.getKey()+" "+m.getValue());
           break;
	  }
		   
	}
	map.put(id,bname);
	for(Map.Entry m:map.entrySet())
	{
	  System.out.println(m.getKey()+" "+m.getValue()); 
	}
   }
}