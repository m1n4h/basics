import java.util.Scanner;
public class Pin {
    public static void Pin(String[] args){

        int correctPin = 1234;
        int required = 3;

        Scanner  attempt = new Scanner(System.in);

        while (required>0){
            System.out.print("Enter Pin: ");
            int userPin = attempt.nextInt();

            if(userPin == correctPin){
                System.out.print("Access Granted");
                break;
            }
            else {
                required --; // required = required-1
                if(required>0){
                    System.out.print("Incorrect PIN. attempts left : " + required);
                }
                else {
                    System.out.print("Maximum  required attempts reached. Access Denied");
                }

            }
        }

    }

}
