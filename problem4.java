public class problem4 extends commafy{
	public static void main(String[] args){
		largestPalindrome(3);
	}

	public static void largestPalindrome(int digit){
		int size=1;
		for(int i=1;i<digit;i++){
			size*=10;
		}
		int num=size;
		String lPali="0";
		for(int i=num;i<size*10-1;i++){
			for(int j=num;j<size*10-1;j++){
				String numS = j*i+"";
				String reverse="";
				
				for(int k=numS.length()-1;k>=0;k--){
					reverse+=numS.substring(k,k+1);
				}
				if(numS.equals(reverse)&&(j*i>Integer.parseInt(lPali))){
					lPali=numS;
				}
			}
		}
		System.out.println(Integer.parseInt(lPali));
	}
}