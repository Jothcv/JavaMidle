package figuras;

public class triangulo extends figuraGeometricas{
    private double altura;

    public triangulo(double valor1, double altura) {
        super(valor1);
        this.altura = altura;
    }

    @Override
    public double getArea() {
        double base = super.getValor1();
        return base * this.altura/2;
    }
}
