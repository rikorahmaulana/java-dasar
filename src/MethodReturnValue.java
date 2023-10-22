public class MethodReturnValue {
    public static void main(String[] args) {
        // secara default method tidak mengasilkan apapun, namum kita bisa membuat
        // sebuah method mengembalikan nilai
        // agar method bisa mengembalikan sebuah value, kita harus mengubah kata kunci
        // void dengan tipe data yang dihasilkan
        // dan didalam block method untuk menghasilkan nilai tersebut kita harus
        // menggunakan kata kunci return lalu diikutin dengan tipe data yang sudah
        // dideklarasikan di method
        // di java kita hanya bisa menghasilkan 1 data di sebuah method, tidak lebih
        // dari 1

        var result1 = sum(100, 100);
        System.out.println(result1);

        System.out.println(sum(200, 200));

        System.out.println(hitung(300, "+", 300));
        System.out.println(hitung(100, "-", 50));
        System.out.println(hitung(100, "salah", 50));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    // dengan percabangan
    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
