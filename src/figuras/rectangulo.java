package figuras;

public class rectangulo extends figuraGeometricas{
    double altura;

    public rectangulo(double valor1, double altura) {
        super(valor1);
        this.altura = altura;
    }

    @Override
    public double getArea() {
        double base=super.getValor1();
        return base*this.altura;
    }
}
