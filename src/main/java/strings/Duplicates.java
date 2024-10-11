package strings;

public class Duplicates {
    public void removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        int result[] = new int[i + 1];
        for (int k = 0; k <= i; k++) {
            result[k] = nums[k];
        }
        System.out.println("Array after removing duplicates:");
        for (int k = 0; k < result.length; k++) {
            System.out.print(result[k] + " ");
        }
    }
}

