package multithreading;

public class SampleThread extends Thread {

  private int id;
  private int start;
  private int end;
  private int sum;

  public SampleThread(int id, int start, int end) {
    this.id=id;
    this.start = start;
    this.end = end;
    this.sum=0;
  }

  public void run() {
    for (int i=start; i<=end; i++) {
      sum+=i;
    }
    System.out.println("Thread : "+id+" sum: "+sum);
  }

  public int getSum() {
    return this.sum;
  }
}
