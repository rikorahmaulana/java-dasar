public class MethodOverloading {
    public static void main(String[] args) {
        // membuat method dengan nama yang sama lebih dari 1 kali
        // ketentuannya : parameter harus berbeda beda entah jumlah atau tipe datanya
        // jika parameternya sama maka akan eror

        sayHello();

        sayHello("Riko");

        sayHello("Riko", "Ganteng");
    }

    // tanpa parameter
    static void sayHello() {
        System.out.println("Hello");
    }

    // dengan 1 parameter
    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    // dengan 2 parameter
    static void sayHello(String firtName, String lastName) {
        System.out.println("Hello " + firtName + " " + lastName);
    }
}
