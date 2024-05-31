package figuras;

public class cuadrado extends figuraGeometricas {
    public cuadrado(double valo1){
        super(valo1);
    }

    @Override
    public double getArea() {
        double lado=super.getValor1();
        return Math.pow(lado,2);
    }
}
