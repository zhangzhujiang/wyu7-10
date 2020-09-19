public class TicketWindow1 implements Runnable{
    private int tickets=100;
    public void run(){
        while(true){
            synchronized (this){
                if(tickets>0){
                    Thread th=Thread.currentThread();
                    String th_name=th.getName();
                    System.out.println(th_name+"正在发售第"+"tickets"+"张票");

                }
            }
        }
    }
}
