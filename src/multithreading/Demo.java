package multithreading;

public class Demo {

  public static void main(String[] args) throws InterruptedException {
    SampleThread thread1 = new SampleThread(1,0,100);
    SampleThread thread2 = new SampleThread(2,101,200);
    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();
    int combinedSum = thread1.getSum()+ thread2.getSum();
    System.out.println("Completed sum calculation : "+combinedSum);
  }

}
