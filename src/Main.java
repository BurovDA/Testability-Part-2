public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 68; // Вес в килограммах
        double growth = 1.72; // Рост в метрах
        int bmi = service.index(weight, growth);
        System.out.println("Индекс массы тела составляет " + bmi);
    }
}
