import java.util.Scanner;
class Main
{
  public static int square(int no)
  {
    int squ=no*no;
    return squ;
  }
	public static void main (String[] args)
    {
	 Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int square1=square(n);
      System.out.print(square1);
	} 
}