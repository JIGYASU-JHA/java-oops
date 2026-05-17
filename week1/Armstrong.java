public class Armstrong
{
  public static void main(String args[])
  {
   int n=371, size=0, remainder, sum=0; 
    for(int temp=n; temp!=0;temp/=10)size++;
    for(int temp=n;temp!=0;temp/=10){
      remainder=temp%10;
      sum += Math.pow(remainder,size);    
     }
     if(sum==n){
        System.out.println("Number is an  armstrong");
      }
     else{
         System.out.println("Number is  not an armstrong");
      }
  }
}