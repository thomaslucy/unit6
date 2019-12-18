public class TraverseArrays {
    public static int countEven(int[] nums){
        int evenNum = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0 )
                evenNum++;
            }
        return evenNum;
    }
    public static int[] buildArray(int desiredLength){
        int [] finalarray = new int[desiredLength];
        for (int i = 0; i < desiredLength; i++)
            finalarray[i] = i;
        return finalarray;
    }
    public static boolean sum28(int[] numbers){
        boolean result = false;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers [i] == 2)
                sum += 2;
        }
        if (sum == 8)
            result = true;
        return result;
    }
    public static int[] zeroMax(int[] original){
        int[] output = new int[original.length];

        for (int i = 0; i < original.length; i++){
            if (original[i]==0){
                for (int ii = i; ii < original.length; ii++){
                    if (original[ii]>output[i])
                        output[i] = original[ii];
                }
            }
            else
                output[i] = original[i];
        }
        return output;
    }
    public static void main(String[] args){
        System.out.println(countEven(new int[] {2, 1, 2, 3, 4}));
        buildArray(10);
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2}));
        zeroMax(new int[]{0, 5, 0, 3});
    }
}
