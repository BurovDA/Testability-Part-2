public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 120; // Вес в килограммых
        double growth = 1.75; // Рост в метрах
        int bmi = service.index(weight, growth);
        System.out.println("Индекс массы тела составляет " + bmi);
    }
}
