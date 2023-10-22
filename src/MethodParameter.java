public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Riko", "Maulana");
        sayHello("Ucup", "Surucup");
        sayHello("Udin", "Sururudin");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
