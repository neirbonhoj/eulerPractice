public abstract usefulMethods{
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
}