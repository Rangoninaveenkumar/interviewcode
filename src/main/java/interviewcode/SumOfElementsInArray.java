package interviewcode;

public class SumOfElementsInArray {
	public static int  sumEleArray(int[] arr) {
		int sum=0;
		for(int i:arr)
			sum +=i;
		return sum;
	}
	 public static void main(String[] args) {
	int arr[]= {1,3,5,7,9};
	System.out.println("the sum elements in an array="+sumEleArray(arr));
	
}
}
