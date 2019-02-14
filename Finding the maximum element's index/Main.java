import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner (System.in);
    int arr_size =in.nextInt();
    int arr[ ]= new int[arr_size];
    for(int index=0;index<arr_size;index++)
    {
      arr[index]=in.nextInt();
    }
    int max= arr[0]>arr[1] ? arr[0] : arr[1] ;
    for(int index=2;index<arr_size;index++)
    {
      if(max<arr[index])
      {
        max=arr[index];
      }
    }
    for(int index=0;index<arr_size;index++)
    {
      if(max==arr[index])
      {
        System.out.print(index);
      }
    }
                         
                         
                         
  }
}