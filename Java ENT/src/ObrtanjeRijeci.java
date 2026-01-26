import java.util.Scanner;

public class ObrtanjeRijeci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite rečenicu:");
        String recenica = input.nextLine();

        String[] rijeci = recenica.split("\\s+");

        StringBuilder obrnuto = new StringBuilder();

        for (int i = rijeci.length - 1; i >= 0; i--) {
            obrnuto.append(rijeci[i]);

            if (i > 0) {
                obrnuto.append(" ");
            }
        }

        // 4. Ispis rezultata (trim() uklanja eventualne razmake s početka i kraja)
        System.out.println("Izlaz: " + obrnuto.toString().trim());

        input.close();
    }
}