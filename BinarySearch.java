/*
Binary search exercise

This code simply returns true or False based
on the presence or absence of a given value 
in a given array.

*/

import java.util.Arrays;

public class BinarySearch{

public static boolean findTarget(int[] arr, int target) {
	Arrays.sort(arr);

	boolean found = binSearch(arr, target);

	return found;
}

public static boolean binSearch(int[] arr, int target){
	int arr_len = arr.length;

	if (arr_len == 1){
		if(arr[0] == target){
			return true;
		}else{
			return false;
		}
	}

	int mid_index = (int) Math.floor(arr_len / 2);

	if(arr[mid_index] == target){
		return true;
	}else if(arr[mid_index] < target){
		int[] new_arr = Arrays.copyOfRange(arr, mid_index, arr_len-1);
		return binSearch(new_arr, target);
	}else{
		int[] new_arr = Arrays.copyOfRange(arr, 0, mid_index);
		return binSearch(new_arr, target);
	}
}


public static void main(String[] args) {
	int[] main_arr = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
	int target=90;

	boolean found = findTarget(main_arr, target);
	System.out.println(found);
}

}