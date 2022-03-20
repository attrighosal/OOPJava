package multithreading;


import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executor = Executors.newFixedThreadPool(10);
    int combinedSum=0;
    ArrayList<Future<Integer>> arr = new ArrayList<>();
    for(int i=0; i<100; i++) {
      int finalI = i;
      Future<Integer> future = executor.submit(()->sum(finalI,finalI,finalI+10));
      arr.add(future);
    }
    for (Future<Integer> future: arr) {
      combinedSum += future.get();
    }
    executor.shutdown();
    System.out.println("Combined sum : "+combinedSum);
  }

  private static int sum(int id, int start, int end) {
    int sum=0;
    for (int i=start; i<=end; i++) {
      sum+=i;
    }
    return sum;
  }
}
