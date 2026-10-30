import java.util.Arrays;
import java.util.Scanner;

public class Text {

    static Scanner scnr = new Scanner(System.in);

    //Declares the emptiness found in the soul of many of our function brethren
    public static void EMPTY_FUNCTION() {

        System.out.println("EMPTY FUNCTION, FIX THIS: " + StackWalker.getInstance().walk(frames -> frames.skip(1).findFirst().map(StackWalker.StackFrame::getMethodName).orElse("Unknown")));

    }

    //Returns whether a is between b and c (HELPER FUNCTION)
    public static boolean Between(int a, int b, int c) {

        if ((b < a) && (a < c)) {

            return true;

        }
        return false;

    }

    //This prompts the user to press ENTER once they are finished reading (HELPER FUNCTION)
    public static void Prompt(){

        String temp;
        System.out.print("\n[NEXT]\n>>");
        temp = scnr.nextLine();
        System.out.println("----------------------------------------------------------------------------------------------------\n");

        return;

    }

    //This prompts the user to answer Y or N (HELPER FUNCTION)
    public static boolean PromptYN(){

        String answer;

        while (true) {

            System.out.print("\n(Y/N)\n>>");

            answer = scnr.nextLine();

            if (answer.equalsIgnoreCase("y")) {

                System.out.println("----------------------------------------------------------------------------------------------------\n");
                return true;

            }
            else if (answer.equalsIgnoreCase("n")) {

                System.out.println("----------------------------------------------------------------------------------------------------\n");
                return false;

            }

        }

    }

    //Function to print menu options, returns answer as int (HELPER FUNCTION)
    public static int PrintMenu(String[] menu, Boolean cancel) {

        if (cancel == true) {

            menu = Arrays.copyOf(menu, menu.length + 1);
            menu[menu.length - 1] = "Cancel";

        }

        while (true) {

            for (int i = 0; i < menu.length; i++) {

                System.out.println(i + ". " + menu[i]);

            }

            System.out.print("\n>>");

            if (scnr.hasNextInt() == true) {

                int answer = scnr.nextInt();
                scnr.nextLine();

                if (Between(answer, -1, menu.length)) {

                    System.out.println("----------------------------------------------------------------------------------------------------\n");
                    return answer;

                }

            }
            else {
                scnr.nextLine();
            }

        }

    }

}
