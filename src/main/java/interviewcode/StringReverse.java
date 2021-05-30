package interviewcode;

public class StringReverse {
	public static void reverseStr(String s) {
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}

	public static void main(String[] args) {
		String str="naveen kumar";
		reverseStr(str);
	}

}
