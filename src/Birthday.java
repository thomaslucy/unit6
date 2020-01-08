/*Lucy Thomas
1/7/20
This program shows the birthday paradox, it runs it 1000 times and shows how many times the same birthday happens
*/
public class Birthday {
            public static int[] dates(int num){
                int[] list = new int[num];
                for (int i = 0; i < num; i++){
                    int x = (int)(Math.random() * 364);
                    list[i] = x;
                }
                return list;
            } //this method creates a random number generator and it chooses a day from 0 to 364 in the year
    public static boolean hasDupes(int[] list){
        for (int i = 0; i < list.length; i++){
            for (int x = list.length-1; x > i; x--){
                if (list[i]==list[x]){
                    return true;
                }
            }
        }
        return false;
    }//this method checks if there are two of the same day

            public static void main(String[] args){
                int correct = 0;
                for (int i = 0; i < 1000; i++){//this does the bday paradox 1000 times
                    int[] array = new int[23];
                    array = dates(23);
                    if (hasDupes(array)){
                        correct++;
                    }
                }
                double Answer = (double)correct/10; //this makes the number into a percent
                System.out.println("The percent of times there were duplicate birthdays is " + Answer + "%.");
            }
        }
