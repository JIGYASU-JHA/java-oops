public class Fibonacci {
	public static void main(String args[]) {
 		int n=10,n1=0,n2=1, nextterm;
             System.out.println("Fibonacci Series till "+ n +" terms");
		for(int i=1;i<=n;i++){
			System.out.println(n1+"");			
			nextterm=n1+n2;
			n1=n2;
			n2=nextterm;
		} 
	}
}