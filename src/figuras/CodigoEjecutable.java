package figuras;

public class CodigoEjecutable {
    public static void main(String[] args) {
        circulo circulo1= new circulo(5.4);//polimorfismo
        System.out.println(circulo1.getArea());

        cuadrado cuadrado1=new cuadrado(5);
        System.out.println(cuadrado1.getArea());

        rectangulo rectangulo1=new rectangulo(3,1);
        System.out.println(rectangulo1.getArea());
    }
}
