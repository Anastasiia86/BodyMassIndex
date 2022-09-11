

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 40;
        double height = 1.74;
        double index = service.calculate(weight, height);

        if (index > 0 && index < 18.49) {
            System.out.println("Недовес: меньше чем 18.5");
        } else if (index < 24.99) {
            System.out.println("Нормальный: между 18.5 и 25");
        } else if (index < 29.99) {
            System.out.println("Избыточный вес: между 25 и 30");
        } else {
            System.out.println("Ожирение: 30 или больше");

        }
    }
}
