class UserThread extends Thread {
    public void run() {
        System.out.println("It is an user defined thread!");
    }
}

public class ThreadOperations {
    public static void main(String[] args) {

        System.out.println("Program Started!");

        Thread currentThread = Thread.currentThread();

        System.out.println("Current Thread Name: " + currentThread.getName());
        currentThread.setName("myMain");
        System.out.println("Updated Thread Name: " + currentThread.getName());

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

        // Id is set by thread scheduler
        System.out.println("Id of thread : " + currentThread.getId());


        //Starting user defined thread
        UserThread thread = new UserThread();
        thread.start();

        System.out.println("Program Ended!");

    }
}
