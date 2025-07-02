import java.util.*;
public class Activiy_Selection_Problem {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(); 
     int[][] arr = new int[n][2];
     int count=0;

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter start and end time for activity " + (i + 1) + ": ");
            arr[i][0] = sc.nextInt(); 
            arr[i][1] = sc.nextInt(); 
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));

        for(int i=0;i<n-1;i++){
            int crrEnd = arr[i][1];
            int nextEnd = arr[i+1][0];
            if(nextEnd >= crrEnd){
                count++;
            }
        }
        System.out.println(count);

    }
}
