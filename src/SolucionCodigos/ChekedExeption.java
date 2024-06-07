package SolucionCodigos;
import java.io.*;
public class ChekedExeption {
    public static void main(String[] args) {
        try {
            //intentando abrir un archivo existente
            //lo que generara un Filenotfound
            FileInputStream file =new FileInputStream("archivo existente.txt");

        }catch (FileNotFoundException e){
            System.out.println("archivo no encontrado"+e.getMessage());
        }finally {
            System.out.println("codigo que siempre se ejecuta ");
        }
    }
}
