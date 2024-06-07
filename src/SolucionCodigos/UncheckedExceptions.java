package SolucionCodigos;

public class UncheckedExceptions {
    public static void main(String[] args) {
        /*try {
            String text =null;//es una variable sin inicialisar
            System.out.println(text.length());
        } catch (NullPointerException e){
            System.out.println("se ha capturado una nullpointerException; "+e.getMessage());
        }*/
        //no checada
        String text ="hola mundo";//es una variable sin inicialisar
        if (text==null){
            System.out.println("variable text es null");
        }else {
            System.out.println(text.length());
        }
    }
}

