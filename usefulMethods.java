public class usefulMethods{
	public static String commafyInt(int num){
		String toReturn="";
		if(num>=1000){
			if(num%1000>=100){
				toReturn+=commafyInt(num/1000)+","+num%1000;
			} else {
				toReturn+=commafyInt(num/1000)+",0"+num%1000;
			}
			
		} else {
			return num+"";
		}
		return toReturn;
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
	//data type long isPrime
	public static boolean isPrime(long x){
		if(x<2){
			return false;
		} else if(x==2){
			return true;
		} else if(x%2==0){
			return false;
		}
		for(long i=3;i*i<=x;i+=2){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}

	public static int findNextPrime(int x){
		boolean foundPrime=false;
		int prime=0;
		for(int i=x+1;foundPrime==false;i++){
			if(isPrime(i)){
				foundPrime=true;
				prime=i;
			}
		}
		return prime;
	}
	//data type long findNextPrime
	public static long findNextPrime(long x){
		boolean foundPrime=false;
		long prime=0;
		for(long i=x+1;foundPrime==false;i++){
			if(isPrime(i)){
				foundPrime=true;
				prime=i;
			}
		}
		return prime;
	}
}