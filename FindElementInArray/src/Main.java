import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String input_name = scanner.nextLine();
        int isExist = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                ++isExist;
            }
        }
        if (isExist == 0) {
            System.out.println("Not found " + input_name + " in the list");
        }
    }
}