package homeworksAndLabs;

public class ArrayLab {

	public static void main(String[] args) {
		double[] aveArray = {1,3,4,5};
			
		double sum = 0;
		
		
		for(int i = 0; i < aveArray.length; i++) {
			
			sum += aveArray[i];			
			
			System.out.println(sum/aveArray.length);
		}
		
		
		String[] stringArray = {"hordus", "maki", "hordus", "templar", "templar", "victus", "templar"};
//		String[] arrayHolder = [];
		for(int i = 0; i < stringArray.length; i++) {
			int counter = 0;
			
			if(stringArray[i].equalsIgnoreCase(stringArray[i]));
			counter++;
			System.out.println(counter);
		}
							
		
//		System.out.println(search(stringArray));
		
		
		// =============== end of line
	}
	
	public static int search(String[] arr, String s) {
		
		int counter = 0;
		for(int j = 0; j < arr.length ; j ++)
			if(s.equals(arr[j]))
				counter++;
		
		return counter;
		
	}
	
	

}
