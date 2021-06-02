package interviewcode;

public class PalindromeNumSum {
	int num=591;
	int rev;
	int sum=0;
	int temp;
	public  boolean isPrimeNum() {
		temp=num;
		  while(num>0) {
			 rev=num%10;
			 sum=(sum*10)+rev;
             num=num/10;			 
		  }if(temp==sum)
			  return true;
		  return false;
	}
	public void sumPrime() {
		int sum1=0;
		  if(isPrimeNum()!=false) {
			  while(sum>0) {
			   int rsum=sum%10;
			 sum1=sum1+rsum;
				sum=sum/10;  
			  }System.out.println("the sum palindrome num->"+temp+"=="+sum1);
		  }  else 
			  System.out.println("not a palindrome number=="+temp);
		}
public static void main(String[] args) {
	//System.out.println(new PalindromeNumSum().isPrimeNum());
	new PalindromeNumSum().sumPrime();
}
}
