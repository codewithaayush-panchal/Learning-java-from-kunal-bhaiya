import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1:
                System.out.println("Kunal kushwaha");
                break;
            case 2:
                System.out.println("Aayush panchal");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("enter correct empId");


        }

        switch (empId) {
            case 1 -> System.out.println("Kunal kushwaha");
            case 2 -> System.out.println("Aayush panchal");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("enter correct empId");
        }

    }
}
