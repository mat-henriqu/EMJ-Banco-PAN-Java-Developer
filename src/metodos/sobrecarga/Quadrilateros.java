package metodos.sobrecarga;

public class Quadrilateros {
    public static void area (double lado){
        System.out.println("A area do quadrado e: "+ (lado*lado));
    }
    public static void area (double lado1,double lado2){
        System.out.println("A area do retangulo e: "+ (lado1*lado2));
    }
    public static void area (double baseMaior,double baseMenor, double altura){
        System.out.println("A area do trapezio e: "+ (((baseMaior+baseMenor)*altura)/2));
    }

}
