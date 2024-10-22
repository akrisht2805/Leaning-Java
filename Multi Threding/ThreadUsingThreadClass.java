/**
 * threadUsingThreadClass
 */

// Second way of creating thread
public class ThreadUsingThreadClass extends Thread {

    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Value of i using Thread: " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }

    // public static void main(String[] args) {
    //     ThreadUsingThreadClass thread = new ThreadUsingThreadClass();
    //     thread.start();
    // }

}
