package multithread;


class CounterThreadTest{
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for(int i = 0; i < 200; i++){
            CounterThread thread = new CounterThread(counter);
            thread.start();
        }
        Thread.sleep(1000);
        System.out.println("Counter: "+counter.getCounter());
    }
}

public class CounterThread extends Thread{
    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            counter.increaseCounter();
        }
    }
}

class Counter{
    private long counter = 0L;

    public synchronized void increaseCounter(){
        counter++;
    }
    public long getCounter() {
        return counter;
    }
}

