package PatronesDisenioEjercicio;

public class EjercicioEjec {
    public static void main(String[] args) {
        Ejercicip configuracion=Ejercicip.getInstance();
        System.out.println("url del base de datos"+configuracion.getUrlBaseDatos());
        configuracion.setUrlBaseDatos("jdbc:mysql://otroHost:3306/miBaseDatos");
        System.out.println("Nueva url de base de datos"+configuracion.getUrlBaseDatos());
        Ejercicip configuracion2=Ejercicip.getInstance();
        System.out.println("Nueva url de base de datos"+configuracion.getUrlBaseDatos());



    }
}
