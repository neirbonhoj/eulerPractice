public class eulerProblems{
	public static void main(String[] args){
		System.out.println(multiples35(10));
	}

	public static int multiples35(int upperBound){
		int sum=0;
		for(int i=0;i<=upperBound;i++){
			if(i%3==0 || i%5==0){
				sum+=i;
			}
		}
		return sum;
	}
}