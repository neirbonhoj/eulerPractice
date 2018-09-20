public class problem3 extends commafy{
	public static void main(String[] args){
		System.out.println("Largest factor of 600851475143 is "+largestPrimeFactor(600851475143.0));
	}

	public static double largestPrimeFactor(double num){
		double largestPrime=1;
		for(double i=1;i<Math.sqrt(num);i++){
			if(num%i==0){
				double factor=i;
				double factorCount=0;
				for(double j=2;j<factor;j++){
					if(factor%j==0){
						factorCount++;
						break;
					}
				}
				if(factorCount==0&&factor>largestPrime){
					largestPrime=factor;
				}
			}
		}
		return largestPrime;
	}
}