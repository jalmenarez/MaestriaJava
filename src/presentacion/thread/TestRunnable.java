package presentacion.thread;

class TestThreadR implements Runnable{
    
   public void run(){
       System.out.println(Thread.currentThread());
   } 
}

public class TestRunnable {
    public static void main(String[] args){
        Thread hilo1=new Thread(new TestThreadR(),"Hilo 1");
        Thread hilo2=new Thread(new TestThreadR(),"Hilo 2");
        Thread hilo3=new Thread(new TestThreadR(),"Hilo 3");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException ex) {
            //Logger.getLogger(TestRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(Thread.currentThread());
    }
}
