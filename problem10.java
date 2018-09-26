public class problem10 extends usefulMethods{
	public static void main(String[] args){
		System.out.println(sumPrimes(2000000));
	}

	public static long sumPrimes(int upper){
		long sum=0;
		long i=1;
		while(i<upper){
			System.out.println(i);
			if(isPrime(i)){
				sum+=i;
			}
			i=findNextPrime((int)i);
		}
		return sum;
	}
}