public class Main {
    public static void main(String[] args) {
        Company c = new Company();
        ProducerThread producerThread = new ProducerThread(c);
        ConsumerThread consumerThread = new ConsumerThread(c);

        producerThread.start();
        consumerThread.start();


    }    
}
