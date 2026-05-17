public class LargestNumber
{
  public static void main(String args[])
   {
     int i= Integer.parseInt(args[0]);
     int j= Integer.parseInt(args[1]);
     int k= Integer.parseInt(args[2]);
if (i >= j && i >= k) 
            System.out.println(i + " is largest. ");
else if (j >= i && j >= k)
             System.out.println(j + " is largest. ");
else
          System.out.println(k + " is largest. ");
    }
}





