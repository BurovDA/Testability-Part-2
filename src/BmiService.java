public class BmiService {

    public int index(int weight, double growth) {
        double index2 = (weight / (growth * growth));
        return (int) index2;
    }
}
