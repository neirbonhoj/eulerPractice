public class problem7{
	public static void main(String[] args){
		System.out.println(largestPrime(10001));
	}
	public static int largestPrime(int upper){
		int primeCount=1;
		int currPrime=2;
		while(primeCount<upper){
			boolean foundPrime=false;
			for(int i=currPrime+1;foundPrime==false;i++){
				System.out.println(i);
				if(isPrime(i)){
					foundPrime=true;
					currPrime=i;
					primeCount++;
				}
			}
		}
		return currPrime;
	}

	public static boolean isPrime(int x){
		if(x<2){
			return false;
		} else if(x==2){
			return true;
		} else if(x%2==0){
			return false;
		}
		for(int i=3;i*i<=x;i+=2){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}
}