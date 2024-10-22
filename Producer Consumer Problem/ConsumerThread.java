public class ConsumerThread extends Thread {
    Company company;

    ConsumerThread(Company company) {
        this.company = company;
    }

    public void run() {
        while (true) {
            this.company.consumeItem();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    }

}
