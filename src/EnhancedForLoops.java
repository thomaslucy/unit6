public class EnhancedForLoops {
    public static String printStandardFor(String[] arr){
        String output = "";
        for (int i = 0; i < arr.length; i++){
            output += arr[i] + " ";
        }
        return output;
    }
    public static String printStandardFor(int[] arr){
        String output = "";
        for (int i = 0; i < arr.length; i++){
            output += arr[i] + " ";
        }
        return output;
    }
    public static String printStandardFor(double[] arr) {
        String output = "";
        for (int i = 0; i < arr.length; i++){
            output += arr[i] + " ";
        }
        return output;
    }
    public static String printEnhancedFor(String[] arr){
        String output = "";
        for (String i:arr){
            output += i + " ";
        }
        return output;
    }
    public static String printEnhancedFor(int[] arr){
        String output = "";
        for (int i:arr){
            output += i + " ";
        }
        return output;
    }
    public static String printEnhancedFor(double[] arr){
        String output = "";
        for (double i:arr){
            output += i + " ";
        }
        return output;
    }
    public static String printStandardWhile(String[] arr) {
        String output = "";
        int temp = 0;
        while (temp < arr.length){
            output += arr[temp] + " ";
            temp++;
        }
        return output;
    }
    public static String printStandardWhile(int[] arr) {
        String output = "";
        int temp = 0;
        while (temp < arr.length){
            output += arr[temp] + " ";
            temp++;
        }
        return output;
    }
    public static String printStandardWhile(double[] arr) {
        String output = "";
        int temp = 0;
        while (temp < arr.length){
            output += arr[temp] + " ";
            temp++;
        }
        return output;
    }
    public static void main(String[] args){
        int [] list ={1, 2, 3, 4, 5};
        String [] list2 ={"hi", "brian", "how", "are", "you?"};
        double [] list3 = {55, 44, 33, 22, 11};

        System.out.println(printStandardFor(list));
        System.out.println(printEnhancedFor(list));
        System.out.println(printStandardWhile(list));

        System.out.println(printEnhancedFor(list2));
        System.out.println(printStandardFor(list2));
        System.out.println(printStandardWhile(list2));

        System.out.println(printStandardWhile(list3));
        System.out.println(printEnhancedFor(list3));
        System.out.println(printStandardFor(list3));
    }
}
