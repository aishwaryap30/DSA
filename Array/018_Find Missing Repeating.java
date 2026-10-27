public class FindMissingRepeating {

	//brute
	public static void findmissingreapeating(int[] arr) {
		
		int missing = -1;
		int repeating = -1;
		
		for (int i =1; i<= arr.length; i++) {
			int count=0;
			
			for(int j=0; j<=arr.length; j++) {
				
				if(arr[j] == i) {
					count ++;
				}
				if(count ==0) {
					missing = i;
				}
				else if(count ==2) {
					repeating= i;
				}
			}
		}
	}
	
	//optimal 
	public static void findmissingreapeating2(int[] arr) {

		int[] freq = new int[arr.length+1];
		
		for(int num : arr) {
			freq[num]++;
		}
		
		int repeating = -1;
		int missing =-1;
		
		for(int i =0; i<arr.length; i++) {
			if(freq[i]==2) {
				repeating=i;
			}
			else if(freq[i]==0) {
				missing =i;
			}
		}
}
		
	}
