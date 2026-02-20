
public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {

    private String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public abstract double povrsina();
    public abstract double opseg();

    @Override
    public String toString() {
        return naziv +
                " | Površina: " + povrsina() +
                " | Opseg: " + opseg();
    }

    @Override
    public int compareTo(GeometrijskiLik o) {
        return Double.compare(this.povrsina(), o.povrsina());
    }
}
