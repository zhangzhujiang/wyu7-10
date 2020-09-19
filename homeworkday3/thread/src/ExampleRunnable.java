public class ExampleRunnable {
    public static void main ( String args[]){
        TicketWindow1 tw=new TicketWindow1();
        new Thread(tw,"窗口1").start();
        new Thread(tw,"窗口2").start();
        new Thread(tw,"窗口3").start();
        new Thread(tw,"窗口4").start();
    }
}
