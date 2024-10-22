
/*
 * MULTI THREADING : Multithreading in java is a process of executing multiple threads simultaneously.
 * 
 * THREADS : It is light weighted sub-process, smallest unit of process.
 * 
 * 
 *   OS -{    P1 (t1, t2, t3),      P2 (t1, t2),         P3 (t1, t2, t3, t4) } 
 */

/*
 * CREATING THREAD IN JAVA :
 * 1. Using Runnable (Interface)
 * 2. Using Thread (Class)
 */

/*

1.Interface Runnable {
    run(){
    }  
  }

  ^
  |
  |
extend
  |
  |

2.Class Thread {

  }


 */

// First way of creating thread
class ThreadUsingRunnableInterface implements Runnable {
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i using runnable: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Starting");

        // Using Runnable Interface
        ThreadUsingRunnableInterface t1 = new ThreadUsingRunnableInterface();
        Thread thread1 = new Thread(t1);
        thread1.start();


        // Using Thread Class
        ThreadUsingThreadClass thread2 = new ThreadUsingThreadClass();
        thread2.start();

        System.out.println("Ending");
    }
}


/*
 * In this program 2 threads are running 2 ( ThreadUsingRunnable , ThreadUsingThread ) + 1 ( Main Thread)
 * 
 * Note : Creation of thread using Runnable Interface is good because you can extends a class while crating the thread.
 */
