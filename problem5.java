public class problem5{
	public static void main(String[] args){
		System.out.println(smallestNumWithMultiples(20));
	}

	public static int smallestNumWithMultiples(int upper){
		boolean found = false;
		int i=upper;
		while(found==false){
			found = true;
			for(int j=1;j<=upper;j++){
				if(i%j!=0){
					found = false;
				}
			}
			if(found==false){
				i++;
			}
		}
		return i;
	}
}