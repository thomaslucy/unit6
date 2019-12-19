public class ArrayAlgorithms {
    public static String printArray(int[] nums){
        String output = "";
        for (int i:nums){
            output += i + " ";
        }
        return output;
    }

    public static boolean checkForAllNegatives(int[] list){
        for (int i: list){
            if (i >= 0)
                return false;
        }
        return true;
    }

    public static boolean hasDupes(int[] list){
        for (int i = 0; i < list.length; i++){
            for (int x = list.length-1; x > i; x--){
                if (list[i] == list[x])
                    return true;
            }
        }
        return false;
    }

    public static int countEvens(int[] arr){
        int count = 0;
        for (int i:arr){
            if (i%2 == 0)
                count++;
        }
        return count;
    }

    public static int[] leftShift(int[] nums, int shift){
        int[] output = new int[nums.length + shift];
        for (int i = 0; i < nums.length; i++){
            output[i] = nums[i];
        }
        for (int ii = nums.length; ii < nums.length+shift; ii++){
            output[ii] = 0;
        }
        return output;
    }

    public static String reverseArray(int[] list){
        int temp = 0;
        String output= "";
        for (int i = 0; i < list.length/2; i++){
            temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp;
        }
        for (int ii = 0; ii < list.length; ii++){
            output+=list[ii] + " ";
        }
        return output;
    }

    public static void main(String[] args){
        int[] list1 = {-2, -9, -6, -8, -9, -3, -1};
        System.out.println(printArray(list1));

        int[] list2 = {-2, -9, -6, -8, -9, -3, -1};
        System.out.println(checkForAllNegatives(list2));
        int[] list3 = {-2, -9, -6, -8, -9, -3, 0};
        System.out.println(checkForAllNegatives(list3));

        int[] list4 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5};
        System.out.println(hasDupes(list4));
        int[] list5 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 11};
        System.out.println(hasDupes(list5));

        int[] list6 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5};
        System.out.println(countEvens(list6));
        int[] list7 = {12, 3, 72, 16, 47, 46, 92, 12, 18, 36, 76, 51, 99, 101, 42, 42};
        System.out.println(countEvens(list7));

        int[] list8 = {1, 0, 1, 1, 0, 1, 0, 1};
        leftShift(list8, 3);

        int[] list9 = {5, 7, 4, 9, 8, 1, 4, 3, 0, 5, 2};
        System.out.println(reverseArray(list9));
    }
}
