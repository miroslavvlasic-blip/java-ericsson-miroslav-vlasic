
import java.util.Scanner;

public class BrojacZnakova {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        System.out.print("Unesite niz znakova: ");
        String s = input.nextLine();

        int brojSlova = 0;
        int brojZnamenki = 0;
        int brojOstalih = 0;

        for (int i = 0; i < s.length(); i++) {
            char trenutniZnak = s.charAt(i);

            if (Character.isLetter(trenutniZnak)) {
                brojSlova++;
            } else if (Character.isDigit(trenutniZnak)) {
                brojZnamenki++;
            } else {
                brojOstalih++;
            }
        }

        System.out.println("Slova: " + brojSlova);
        System.out.println("Brojevi: " + brojZnamenki);
        System.out.println("Ostali znakovi: " + brojOstalih);

        input.close();
    }
}
