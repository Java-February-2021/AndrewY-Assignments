import java.util.Math;

public class Pythagroean {
    public double calculateHypotenuse(int legA, int legB) {
        Double hyp = Math.hypot(legA, legB);
        return hyp;
    }
}
