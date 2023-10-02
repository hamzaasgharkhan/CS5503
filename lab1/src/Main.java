public class Main {
    public static void main(String[] args) {
        int nums[] = new int[10];       // Declare an empty array of 10 integers.
        final int UPPER_BOUND = 100;
        // Assign random elements to the array between 0 and UPPER_BOUND
        for (int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random() * UPPER_BOUND);
        }
        // Insertion Sort
        int i, key;
        for (int j = 1; j < nums.length; j++){
            key = nums[j];
            i = j-1;
            while (i > -1 && nums[i] > key){
                nums[i + 1] = nums[i];
                i = i - 1;
            }
            nums[i + 1] = key;
        }
        // Display all the elements of the array
        for(int j = 0; j < nums.length; j++){
            System.out.println(nums[j]);
        }
    }
}