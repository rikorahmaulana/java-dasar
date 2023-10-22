public class RecursiveMethod {
    public static void main(String[] args) {

        // recursive method adalah kemampuan method memanggil dirinya sendiri

        System.out.println(factorialRecursive(5));

    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
}
