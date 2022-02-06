public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double indexMass = service.calculate(82, 1.82);
        System.out.println("Индекс массы тела составляет: " + indexMass);


    }
}
