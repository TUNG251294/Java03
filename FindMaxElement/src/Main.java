import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            array = new int[size];
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        for (int j = 0; j < size; j++){
            System.out.println("Enter element " + (j+1));
            array[j] = scanner.nextInt();
        }
        int Max = array[0];
        int index = 1;
        for (int i = 1; i < size; i++){
            if (array[i] > Max){
                Max = array[i];
                index = i + 1;
            }
        }
        System.out.println("The largest property value in the list is " + Max + " ,at position " + index);
    }
}