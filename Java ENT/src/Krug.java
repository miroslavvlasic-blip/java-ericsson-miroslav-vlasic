
public class Krug extends GeometrijskiLik {

    private double r;

    public Krug(String naziv, double r) {
        super(naziv);
        this.r = r;
    }

    @Override
    public double povrsina() {
        return Math.PI * r * r;
    }

    @Override
    public double opseg() {
        return 2 * Math.PI * r;
    }
}
