public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double hypC2 = Math.pow(legA,2) + Math.pow(legB,2);
        double hypC = Math.sqrt(hypC2);
        return hypC;
    }
}