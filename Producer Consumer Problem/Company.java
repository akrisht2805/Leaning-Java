public class Company {
    int n;
    boolean flag = true;

    // ture h to producer ka chance h
    synchronized public void produceItem(int n) {
        if (flag == false) {
            try {
                wait();
            } catch (Exception e) {
            }
            ;
        }
        this.n = n;
        System.out.println("Produced : " + n);
        flag = false;
        notify();
    }

    synchronized public void consumeItem() {
        if (flag == true) {
            try {
                wait();
            } catch (Exception e) {
            }
            ;
        }
        System.out.println("Consumed : " + this.n);
        flag = true;
        notify();
    }
}
