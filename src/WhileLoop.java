public class WhileLoop {
    public static void main(String[] args) {

        /*
         * while loop ada versi perulangan yg lebih sederhana dibanding for loop,
         * di while loop hanya terdapat kodisi perulangan tanpa ada init statement dan
         * post statement
         */

        var counter = 1;

        while (counter <= 20) {
            System.out.println("Perulangan ke-" + counter);

            counter++;
        }
    }
}