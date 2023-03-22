package metodos.retorno;

import metodos.sobrecarga.Quadrilateros;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio Quadrilatero com os tamanho 5, 4, 3: ");
        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Area do quadrado "+areaQuadrado);
        double areaRetangulo = Quadrilatero.area(5,4);
        System.out.println("Area do retangulo "+areaRetangulo);
        double areaTrapezio = Quadrilatero.area(5,4,3);
        System.out.println("Area do trapezio "+areaTrapezio);
    }
}
