public class eulerProblems{
	public static void main(String[] args){
		System.out.println("Problem 1: Sum of multiples of 3 and 5 below 1,000 is "+multiples35(1000)+".");
	}

	public static int multiples35(int upperBound){
		int sum=0;
		for(int i=0;i<upperBound;i++){
			if(i%3==0){
				sum+=i;
			} else if(i%5==0){
				sum+=i;
			}
		}
		return sum;
	}
}