import java.util.Scanner;
class Main{
  public static int greater(int x,int y)
  {
    int great=(x>y) ? x : y ;
    return great;
  }
	public static void main (String[] args){
      Scanner in =new Scanner (System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int gre=greater(n1,n2);
	    if(gre>n3)
        {
          System.out.print(gre);
        }
      else
      {
        System.out.print(n3);
      }
    
	}
}