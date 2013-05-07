package presentacion.thread;

import java.util.Random;

class TestThread extends Thread {
    private String nombre;
    private int retardo;
    int min = 1000, max = 5000;
    public TestThread(String s){
        this.nombre=s;
        Random rand = new Random();
        this.retardo = rand.nextInt(max - min + 1) + min;
    }    
    @Override
    public void run(){
        try {
            sleep(this.retardo);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(">Hola: "+ this.nombre + " ---- "+this.retardo);
    }
}

public class MultiHola {
    public static void main(String[] args){
        TestThread oT1 = new TestThread("Thread 1");
        TestThread oT2 = new TestThread("Thread 2");
        TestThread oT3 = new TestThread("Thread 3");
        TestThread oT4 = new TestThread("Thread 4");
        oT1.start();
        oT2.start();
        oT3.start();
        oT4.start();
        System.out.println("Se lanzaron todos los Threads!");
    }
}
