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
    public static void main(String[] args){
        System.out.println(countEven(new int[] {2, 1, 2, 3, 4}));
        buildArray(10);
    }
}
