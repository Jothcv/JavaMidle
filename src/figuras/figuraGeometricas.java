package figuras;

public abstract class figuraGeometricas { //aqui aplicamos abstraccion
    private double valor1;

    public figuraGeometricas(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public abstract double getArea();//aqui estamos cerrando la abstraccion
}
