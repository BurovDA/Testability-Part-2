public class BmiService {

    public int index(int weight, double growth) {
        double q = (weight / (growth * growth));
        int w = (int) q;
        return w;
    }
}
