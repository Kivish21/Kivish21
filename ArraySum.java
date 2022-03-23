import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		
		int[] arr = {19, 14, 20, 18, 2};
		int sum = 0;
		
		System.out.println("Array: "+Arrays.toString(arr)); 	//print Array
		
		for(int i = 0; i < arr.length; i++) {	
			sum = sum + arr[i];					//sum
		}
		System.out.println("The sum of the array is: "+sum);
		double avg = (sum/arr.length);		//average
		System.out.println("The average of the array is: "+avg);	

	}

}