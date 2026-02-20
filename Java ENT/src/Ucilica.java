
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ucilica {

    private List<GeometrijskiLik> likovi = new ArrayList<>();

    public void dodaj(GeometrijskiLik lik) {
        likovi.add(lik);
    }

    public void ispisiSve() {
        for (GeometrijskiLik lik : likovi) {
            System.out.println(lik);
        }
    }

    public void sortirajPoPovrsini() {
        Collections.sort(likovi);
    }
}
