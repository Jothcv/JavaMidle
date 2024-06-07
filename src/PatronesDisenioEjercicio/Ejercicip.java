package PatronesDisenioEjercicio;

import java.lang.module.Configuration;

public class Ejercicip {
    //unica instancia de la clase ,inicializado como nulo
    private static Ejercicip instancia=null;
    //atributos de configuracion
    private String urlBaseDatos;
    private int maxConexiones;

    //constructor para pevnir instaciacion externa
    private  Ejercicip(){
        //inicializacion de atributos de configuracion
        urlBaseDatos="jdbc:mysql://localhost:3306/miBaseDatos";
        maxConexiones=10;
        //inicializamos otros atributos
    }
    //metodo publico estatico para otener la instancia
    public static synchronized Ejercicip getInstance(){
        if (instancia==null){
        instancia=new Ejercicip();
        }
        return instancia;
    }

    //metodo getters y setters para los atributos de confi


    public String getUrlBaseDatos() {
        return urlBaseDatos;
    }

    public void setUrlBaseDatos(String urlBaseDatos) {
        this.urlBaseDatos = urlBaseDatos;
    }

}
