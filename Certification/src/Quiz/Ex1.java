package Quiz;

public class Ex1 {
	
	
	public static void main ( String [] args) {
		
		
		int [] valores = {200,300,100};
		System.out.println(average(valores));
		
		
	}
	
	
	public static float average ( int [] nums ) {
		
		float result = 0 ; 
		for(int i =0; i < nums.length; i++) {
			result += nums[i];
		}
		return result/nums.length;
	}

}
