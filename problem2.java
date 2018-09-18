public class problem2{
	public static void main(String[] args){
		System.out.println("The sum of all even fibonacci numbers between 1 and 10 is "+evenFibonacciSum(10,1,2));
	}

	public static int evenFibonacciSum(int upperBound,int firstNum, int secondNum){
		int lastNum=firstNum;
		int currNum=secondNum;
		int sum=0;
		if(lastNum%2==0){
			sum+=lastNum;
		}
		while(currNum<=upperBound){
			if(currNum%2==0){
				sum+=currNum;
			}
			lastNum=currNum;
			currNum+=lastNum;
			System.out.println(currNum);
		}
		return sum;
	}
}