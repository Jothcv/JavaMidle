package PatronesDisenio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Singleton {
    private static Singleton instance;
    private List<String> logs;

    private Singleton(){
        logs=new ArrayList<>();
    }

    public static Singleton getInstance(){
        if (instance==null){
            instance =new Singleton();
        }
        return instance;
    }

    public void writeLogs(String message){
        logs.add(message);
    }

    public void showLogs(){
        /*for (int i =0;i< logs.size();i++){
            System.out.println(logs.get(i));
        }*/
        for (String log: logs){
            System.out.println(log);
        }
    }
}
