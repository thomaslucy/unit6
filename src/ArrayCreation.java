public class ArrayCreation {
    public static double getAverage(double[] numbers){
        double array_average;
        if (numbers.length<3)
            return 0.0;
        else{
            array_average = (numbers[0] + numbers[numbers.length/2])+numbers[(numbers.length-1)];
            array_average = array_average/3;
            array_average = ((array_average*100)+0.5)/100;
            array_average = (int)(array_average);
            return array_average;
        }
    }
    public static void main(String[] args){
        double[] numbers = {89, 75, 100};
        System.out.println(getAverage(numbers));
    }
}
