package PatronesDisenio;

public class MainLogger {
    public static void main(String[] args) {
    Singleton log1= Singleton.getInstance();//declarar un objeto e instanciarlo
    log1.writeLogs("inicio del log del objeto");
    log1.writeLogs("final del log del objeto");
    log1.showLogs();

    Singleton log2= Singleton.getInstance();
        log2.writeLogs("inicio el log2 del objeto");
        log2.writeLogs("final del log2 del objeto");
        log2.showLogs();

        System.out.println(log1==log2);
    }
}

