public class problem4{
	public static void main(String[] args){
		largestPalindrome(2);
	}

	public static void largestPalindrome(int digit){
		int size=1;
		for(int i=1;i<digit;i++){
			size*=10;
		}
		int num=size;
		String lPali="";
		for(int i=num;i<size*10-1;i++){
			for(int j=num;j<size*10-1;j++){
				String numS = num+"";
				String reverse="";
				for(int k=numS.length()-1;k>=0;k--){
					reverse+=numS.substring(k,k+1);
				}
				if(numS.equals(reverse)){
					lPali=numS;
				}
			}
		}
		System.out.println(lPali);
	}
}