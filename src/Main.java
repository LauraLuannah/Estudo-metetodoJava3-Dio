public class Main {
    public static void main(String[] args) {
        double areaQuadrado = Quadrilateros.area(5);
        System.out.println("Á area do quadrado é " + areaQuadrado);

        double areaRetangulo = Quadrilateros.area(10, 5);
        System.out.println("Á area do retângulo é " + areaRetangulo);

        double areaTrapezio = Quadrilateros.area(10, 5, 15);
        System.out.println("à area do trapézio é " + areaTrapezio);

    }
}
