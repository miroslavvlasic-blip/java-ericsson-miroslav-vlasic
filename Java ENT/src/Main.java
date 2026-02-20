
public class Main {
    public static void main(String[] args) {

        Ucilica ucilica = new Ucilica();

        ucilica.dodaj(new Trokut("Trokut A", 3, 4, 5));
        ucilica.dodaj(new Krug("Krug B", 2.5));
        ucilica.dodaj(new Pravokutnik("Pravokutnik C", 4, 6));

        System.out.println("=== Prije sortiranja ===");
        ucilica.ispisiSve();

        ucilica.sortirajPoPovrsini();

        System.out.println("\n=== Nakon sortiranja po površini ===");
        ucilica.ispisiSve();
    }
}
