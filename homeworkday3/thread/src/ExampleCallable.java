import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ExampleCallable implements Callable<Integer> {
    private static int ticket = 100;

    @Override
    public Integer call() throws Exception {

        if (ticket > 0) {
            sellTicket();

        }
        return ticket;
    }
    private  void sellTicket() throws Exception{
        while (ticket > 0) {
            Thread.sleep(10);
            String name=Thread.currentThread().getName();
            System.out.println("线程名称：" + name + " 票号：" + ticket--);

        }
        }
        public static void main (String args[]) throws ExecutionException, InterruptedException {


        FutureTask<Integer> ft = new FutureTask<>(new ExampleCallable ());
        FutureTask<Integer> ft1 = new FutureTask<>(new ExampleCallable ());
        FutureTask<Integer> ft2 = new FutureTask<>(new ExampleCallable ());
        FutureTask<Integer> ft3 = new FutureTask<>(new ExampleCallable ());
        Thread t1=new Thread(ft);
        Thread t2=new Thread(ft1);
        Thread t3=new Thread(ft2);
        Thread t4=new Thread(ft3);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

            System.out.println("返回结果完成"+ft1.get());

     
        }
    }
