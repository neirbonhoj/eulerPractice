public class problem2{
	public static void main(String[] args){

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
			currNum+=lastNum;
		}
		return sum;
	}
}