public class problem4{
	public static void main(String[] args){
		largestPalindrome(2);
	}

	public static void largestPalindrome(int digit){
		int size=1;
		for(int i=1;i<digit;i++){
			size*=10;
		}
		int num1=size;
		int num2=size;
		System.out.println(num1+","+num2);
	}
}