import java.util.*;
public class Fractional_knapsack_problem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter how many value weight pair should be there: ");
    int n = sc.nextInt(); // How many value weight pair should be there 
    int[][] arr = new int[n][3];

    System.out.println("Enter the maximum capacity of bag: ");
    int max_capacity = sc.nextInt();

    for (int i = 0; i < n; i++) {
            System.out.print("Enter value and Weight " + (i + 1) + ": ");
            arr[i][0] = sc.nextInt(); 
            arr[i][1] = sc.nextInt();
            arr[i][2] = (arr[i][0]) / (arr[i][1]) ; 
        }

        Arrays.sort(arr, Comparator.comparingInt((int[] a) -> a[2]).reversed());
        double remain_weight =max_capacity;
        double total_val =0;
        for(int i=0;i<n; i++){
          if(arr[i][1] <= remain_weight && remain_weight > 0){
            remain_weight = remain_weight - arr[i][1];
            total_val = total_val + arr[i][0];
          }else if(arr[i][1] > remain_weight && remain_weight > 0){
            total_val = total_val + (arr[i][0] * (remain_weight/arr[i][1]));
            remain_weight = 0;
          }
        }
        System.out.println(total_val);
  }
}
