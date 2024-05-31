package figuras;
public class circulo extends figuraGeometricas{//aqui aplicamos la erencia con la palabra reservada extends
    public circulo(double valor1){
        super(valor1);
    }

    @Override
    public double getArea() {//aqui aplicamos polimorfismo
        double radio=super.getValor1();
        return Math.PI * Math.pow(radio,2);
    }
}
