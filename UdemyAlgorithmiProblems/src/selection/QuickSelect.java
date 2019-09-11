package selection;

import java.util.Random;

public class QuickSelect {

	private static int[] nums = {1, 5, 4, 8, -2};
	
	public static void main(String[] args) {
		System.out.println(select(2));
		// Left side of the pivot is greater -> greater items second last
		
		//left side of the pivot is smaller -> 2nd smaller item
	}

	private static int select(int k) {
		return select(0, nums.length - 1, k - 1);
	}
	
	private static int select(int firstIndex, int lastIndex, int k) {
		int pivot = partition(firstIndex, lastIndex);
		if(pivot > k)
			return select(firstIndex, pivot - 1, k);
		else if(pivot < k)
			return select(pivot + 1, lastIndex, k);
		return nums[k];
	}

	private static int partition(int firstIndex, int lastIndex) {
		int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
		swap(lastIndex, pivot);
		for(int i = firstIndex; i < lastIndex; i++) {
			if(nums[i] < nums[lastIndex]) {// < means will give the smallest numbers  > will give the largest ones
				swap(i, firstIndex);
				firstIndex++;
			}
		}
		swap(firstIndex, lastIndex);
		return firstIndex;
	}

	private static void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
