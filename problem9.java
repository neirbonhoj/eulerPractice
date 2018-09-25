public class problem9{
	public static void main(String[] args){
		System.out.println(findTriplet(1000.0));
	}

	public static double findTriplet(double x){
		double num=0;
		for(int a=0;a<1000;a++){
			for(int b=0;b<a;b++){
				double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
				if((a+b+c)==x){
					return a*b*c;
				}
			}
		}
		return num;
	}
}