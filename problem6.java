public class problem6{
	public static void main(String[] args){
		System.out.println(differenceOfSquares(100));
	}
	public static int differenceOfSquares(int upper){
		int sumSquares=0;
		int squaredSum=0;
		for(int i=1;i<=upper;i++){
			sumSquares+=(i*i);
			squaredSum+=i;
		}
		squaredSum*=squaredSum;
		return (squaredSum-sumSquares);
	}
}