package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

  public static void main(String[] args) {
    List<Integer> arr = Arrays.asList(1,2,3,4,5,6);

    // Step 1 using stream, map, filter, collect
    List<Integer> square = arr.stream().map((i)-> i*i).filter((i)->i%2==0).collect(Collectors.toList());
    System.out.println(square);

    // Step 2 using for each loop
    List<Integer> square2 = new ArrayList<>();
    arr.forEach((i)->{
      if(i*i%2==0) {
        square2.add(i*i);
      }
    });

    // Step 3 for loop
    List<Integer> square3 = new ArrayList<>();
    for (Integer i: arr) {
      if (i*i%2==0) {
        square3.add(i*i);
      }
    }
  }
}

// t1,t2,t3 -> sbf
