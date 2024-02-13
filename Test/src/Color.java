import java.util.Scanner;
public class Color {
    public static void main (String[] arg) {
        Scanner scnr = new Scanner(System.in);
        String printInput = colorInput(scnr);
        System.out.println("Program Result: " + printInput);
        scnr.close();
    }
    public static String colorInput(Scanner scnr) {
        String color1;
        String color2;
        String color3;

        try {
            System.out.print("Enter the first color: ");
            color1 = scnr.nextLine();
            if (color1.matches("\\d+")) {
                throw new Exception("Color entered cannot be numerical.");
            }

            System.out.print("Enter the second color: ");
            color2 = scnr.nextLine();
            if (color2.matches("\\d+")) {
                throw new Exception("Color entered cannot be numerical.");
            }

            System.out.print("Enter the third color: ");
            color3 = scnr.nextLine();
            if (color3.matches("\\d+")) {
                throw new Exception("Color entered cannot be numerical.");
            }

            System.out.println("The colors entered are: " + color1 + ", " + color2 + ", and " + color3);
            System.out.println("Success");
            return "Success";
        } catch (Exception excpt) {
            System.out.println("Colors cannot be numerical.");
            System.out.println(excpt.getMessage());
            return "Failure";
        }
    }
}
