public class problem7 extends usefulMethods{
	public static void main(String[] args){
		System.out.println(largestPrime(10001));
	}
	public static int largestPrime(int upper){
		int primeCount=1;
		int currPrime=2;
		while(primeCount<upper){
			primeCount++;
			currPrime=findNextPrime(currPrime);
		}
		return currPrime;
	}
}