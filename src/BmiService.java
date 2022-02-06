public class BmiService {
    public double calculate(int mass, double height) {
        double result = mass / height / height;
        return result;

    }
}
