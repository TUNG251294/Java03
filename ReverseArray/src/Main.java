import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Enter a side: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size){
            System.out.println("Enter element " + (i+1));
            array[i] = scanner.nextInt();
            ++i;
        }
        for (int j = 0; j < array.length/2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}