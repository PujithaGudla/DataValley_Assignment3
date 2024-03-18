/* Write a java program to implement synchronization, write clear java coding steps how to do synchronization with java thread objects.*/
class Counter 
{
    private int count;
    // Synchronized method to increment the counter
    public synchronized void increment() 
    {
        count++;
    }
    // Method to get the current count
    public synchronized int getCount() 
    {
        return count;
    }
}

class Thread1 extends Thread 
{
    private Counter counter;

    public Thread1(Counter counter) 
    {
        this.counter = counter;
    }

    public void run() 
    {
        for (int i = 0; i < 100; i++) 
        {
            counter.increment();
        }
    }
}

class Thread2 extends Thread 
{
    private Counter counter;

    public Thread2(Counter counter) 
    {
        this.counter = counter;
    }

    public void run() 
    {
        for (int i = 0; i < 100; i++) 
        {
            counter.increment();
        }
    }
}

public class Synchronization 
{
    public static void main(String[] args) 
    {
        Counter counter = new Counter();
        Thread1 t1 = new Thread1(counter);
        Thread2 t2 = new Thread2(counter);

        // Start the threads
        t1.start();
        t2.start();

        try 
        {
            t1.join();
            t2.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        System.out.println("Count: " + counter.getCount());
    }
}
