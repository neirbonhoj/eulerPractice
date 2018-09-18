public class commafy{
	public static void main(String[] args){
		System.out.println(commafyInt(1403087168));
	}
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
}