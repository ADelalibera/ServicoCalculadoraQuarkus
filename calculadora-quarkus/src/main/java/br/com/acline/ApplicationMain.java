package br.com.acline;
import java.util.Random;

public class ApplicationMain {

    public static void main(String[] args) {

        // Definir o LogManager do JBoss manualmente no início
        System.setProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager");

        // Instancia o handler que faz a chamada SOAP
        var handler = new CalculadoraHandler();
        
        Random random = new Random();

        for (int i = 1; i <= 15; i++) {

            long x = random.nextInt(101);
            long y = random.nextInt(101);
            
            long startTime = System.currentTimeMillis();
            
            long resultado = handler.Somar(x, y);
            long endTime = System.currentTimeMillis();
            
            long duration = endTime - startTime;

            System.out.println("Request ID " + i + ": Somar("+x+"+"+y+")=" + resultado + "  (" + duration + "ms)");
        }
    }      
}
