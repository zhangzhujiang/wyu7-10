import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor {
    public static void main ( String args[]) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(
                10,
                20,
                20,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(200),
                new java.util.concurrent.ThreadPoolExecutor.AbortPolicy());

    }

}

