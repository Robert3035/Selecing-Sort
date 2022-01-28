import java.util.*;
import java.io.*;
public class SSort {
    public static void main(String[] args) throws Exception {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Scanner scan = new Scanner(new File("input.txt"));
    while(scan.hasNext()){
        numbers.add(scan.nextInt());
    }
    int temp = 0;
    int place = 0;
    for(int j = 0; j < numbers.size(); j++){
        int min = Integer.MAX_VALUE;
        for(int i = j; i < numbers.size(); i++){
            if(numbers.get(i) < min){
                min = numbers.get(i);
                place = i;
            }
        }
        temp = numbers.get(j);
        numbers.set(j, min);
        numbers.set(place, temp);
    }
    System.out.println(numbers);
    }
}
