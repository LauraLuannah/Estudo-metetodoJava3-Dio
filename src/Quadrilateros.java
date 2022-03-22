public class Quadrilateros {

    //Área do Quadrado
    public static double area(double lado) {
        return lado * lado;
    }

    //Área do Retângulo
    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    //Área do Trapézio
    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura / 2);
    }
}
