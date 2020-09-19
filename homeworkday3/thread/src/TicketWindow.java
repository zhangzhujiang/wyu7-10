

 class TicketWindow extends Thread{
    private int tickets=100;
    private static Object o=new Object();
    public void run(){
        while (true){
            synchronized (o){
                if (tickets>0){
                    Thread th= Thread.currentThread();
                    String th_name=th.getName();
                    System.out.println(th_name+"正在发售"+tickets--+"张票");
                }
            }
        }
    }

}

