public class BreakDanContinue {
    public static void main(String[] args) {

        // BREAK
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }

        System.out.println("Perulangan berhenti");

        // CONTINUE
        for (var counter2 = 1; counter2 <= 100; counter2++) {
            if (counter2 % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan ganjil ke-" + counter2);

        }
    }
}
