import java.util.*;
public class Reverse{
  
  public static void main(String args[])
  {
    
    int a;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    a=s.nextInt();
    String c="";
    String b=String.valueOf(a);
    int l=b.length();
    l=l-1;
    for(int i=l;i>=0;i--)
      {
      
      c+=b.charAt(i);
      }
      System.out.println(c);
      }
      }
