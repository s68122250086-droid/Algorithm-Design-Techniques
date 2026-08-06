import java.util.Scanner;

public class StudentSearch {

    static int searchStudent(String[] studentIds, String target) {

        for (int i = 0; i < studentIds.length; i++) {
            if (studentIds[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] studentIds = {
            "6601001",
            "6601002",
            "6601003",
            "6601004",
            "6601005"
        };

        System.out.print("StudedntId: ");
        String target = sc.nextLine();

        int result = searchStudent(studentIds, target);

        if (result != 1) {
            System.out.println("found: " + result);
        } else {
            System.out.println("Not found");
        }

        sc.close();
    }
}