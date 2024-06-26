public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 115;//Вес в кг
        int height = 193;//Рост в см
        String myBodyMassIndex = String.valueOf(service.calculate(weight, height));
        System.out.println(myBodyMassIndex);
    }
}