public class Main {
    public static void main(String[] args) {
        Computador c1 = new Computador("RYZEN 5", 8, 256);
        c1.showComputer();
        c1.changeOn();
        c1.showComputer();
    }
}