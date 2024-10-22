public class ProducerThread extends Thread{
    Company company;

    ProducerThread(Company company){
        this.company = company;
    }

    public void run(){
        int i = 1;
        while (true) {
            this.company.produceItem(i);
            i++;
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }

}
