package arrays;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctNumberInArray {

	static int countDistinct(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int flag  = 0;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				count++;
			}
		}
		return count;
	}
	
	// Using Hashset O(1)
	static int countDistinctSet(int[] arr) {
		Set<Integer> dis = new HashSet<Integer>();
		for (int i : arr) {
			dis.add(i);
		}
		return dis.size();
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 7, 2, 10, 7};
		System.out.println(countDistinct(arr));
		//System.out.println(countDistinctSet(arr));

	}

}


