import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Press power button\n");

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(10);

        for(int i=1; i<=5; i++){
            scheduler.schedule(new Laptop(i), i, TimeUnit.SECONDS);
        }

        scheduler.shutdown();
    }
}