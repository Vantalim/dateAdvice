import java.util.Scanner;

public class dateAdvice {

    // Calculate wait time in years
    private static int waitTime(int first, int second) {
        int w = 0;

        while ((first / 2) + 7 > second) {
            w++;
            first++;
            second++;
        }

        return (w);
    }

    private static void verdict(int w) { // *Drum roll*
        if (w == 1) {
            System.out.println("You should wait " + w + " year before you start dating.");
        }
        else if (w < 1) {
            System.out.println("Just go on a date already!"); // <3
        }

        else {
            System.out.println("You should wait " + w + " years before you start dating."); // Yup. That s was important. Shut up.
        }
    }

    public static void main(String[] args) {
        int first, second;
        Scanner tekst = new Scanner(System.in);
        System.out.println("Age of the first person: ");
        first = tekst.nextInt();
        System.out.println("Age of the second person: ");
        second = tekst.nextInt();
        tekst.close();


        if (first > second) {} // Swap if oldest person was not entered first.
        else {
            first = first + second;
            second = first - second ;
            first = first - second;
        }

        int w = waitTime(first,second); // Find years you need to wait

        verdict(w); // Ask the internet for a verdict.

    }
}
