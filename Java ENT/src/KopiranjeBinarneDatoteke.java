
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class KopiranjeBinarneDatoteke {

    public static void main(String[] args) {
        // Using try-with-resources for Scanner to ensure it closes automatically
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Upisite lokaciju originalne datoteke (npr. C:/test/slika.jpg):");
            String izvornaPutanja = input.nextLine();
            File originalnaDatoteka = new File(izvornaPutanja);

            if (!originalnaDatoteka.exists()) {
                System.out.println("Originalna datoteka ne postoji!");
                return;
            }

            System.out.println("Unesite lokaciju kopije datoteke:");
            String destinacijaLokacija = input.nextLine();
            File destinacijskaDatoteka = new File(destinacijaLokacija);

            // Logic for overwriting
            if (destinacijskaDatoteka.exists()) {
                System.out.println("Datoteka već postoji. Želite li ju prepisati? (Y/N)");
                String odgovor = input.nextLine();

                if (!odgovor.equalsIgnoreCase("Y")) {
                    System.out.println("Otkazivanje operacije.");
                    return;
                }
            }

            // Copying process using a buffer for efficiency
            try (FileInputStream ulaz = new FileInputStream(originalnaDatoteka);
                 FileOutputStream izlaz = new FileOutputStream(destinacijskaDatoteka)) {

                byte[] buffer = new byte[4096]; // 4KB buffer
                int procitano;

                while ((procitano = ulaz.read(buffer)) != -1) {
                    izlaz.write(buffer, 0, procitano);
                }

                System.out.println("Datoteka je uspješno kopirana.");
            }

            // Optional: Delete the copy
            System.out.println("Želite li sada izbrisati kopiju datoteke (Y/N)?");
            String odgovorBrisanje = input.nextLine();

            if (odgovorBrisanje.equalsIgnoreCase("Y")) {
                if (destinacijskaDatoteka.delete()) {
                    System.out.println("Datoteka je uspješno obrisana.");
                } else {
                    System.out.println("Datoteku nije moguće obrisati. Možda je još uvijek koristi sustav.");
                }
            }

        } catch (IOException e) {
            System.out.println("Dogodila se greška pri radu s datotekom: " + e.getMessage());
        }
    }
}

