// Threads are blocks of code that be run concurrently.
// To use it, you have to extend the Thread class,
// and overwrite the "run" method, this method will
// run concurrently with the rest of your code
// when you instantiate class and call the method "start".
class MyThread extends Thread {
    public static void main() {
        System.out.println("This code is running in the main thread");        
    }

    @Override
    public void run() {
        System.out.println("This code is running in another thread");
    }
}

// You can create Thread classes with the Runnable interface
// you can do this when you want to extend your class from one other
// then Thread, or want to implement multiple interfaces.
class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("This code is runing in another thread with Runnable");
    }
}

public class Threads {
    public static void main() {
        System.out.println("This code is running in the main thread");

        MyThread myFirstThreadObject = new MyThread();

        myFirstThreadObject.start();

        // isAlive tells if the thread is still running,
        // for when you want for example, wait for a thread to end
        // to execute a block a code, like an "await" of Javascript
        // in the thread.
        while (myFirstThreadObject.isAlive()) {
            System.out.println("Waiting for the first thread object to end");   
        };

        // Running a Thread class that implements Runnable
        MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread mySecondThreadObject = new Thread(myRunnableThread);
        mySecondThreadObject.start();
    }
}