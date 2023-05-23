package arrays;

import java.util.ArrayList;

public class CompareTwoIndexOfTwoDifferentArrays {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] arr1 = {1,3,6,9,11};
		int[] arr2 = {2,3,0,9,13};
		
		for(int i =0;i<arr1.length;i++) {
			if(arr1[i]==arr2[i]) {
				al.add(arr1[i]);
			}
		}
	
		for (int i:al) {
			System.out.print(i+" ");
		}
	}

}
