public class problem2 extends commafy{
	public static void main(String[] args){
		System.out.println("The sum of all even fibonacci numbers between 1 and 10 is "+commafyInt(evenFibonacciSum(4000000,1,2)));
	}

	public static int evenFibonacciSum(int upperBound,int firstNum, int secondNum){
		int numOne=firstNum;
		int numTwo=secondNum;
		int sum=0;
		while(numTwo<=upperBound){
			if(numTwo%2==0){
				sum+=numTwo;
			}
			int newNum = numOne+numTwo;
			numOne=numTwo;
			numTwo=newNum;
			System.out.println("Num1: "+numOne+"- Num2: "+numTwo);
		}
		return sum;
	}
}