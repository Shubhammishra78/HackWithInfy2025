import java.util.*;
public class Activiy_Selection_Problem {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(); 
     int[][] arr = new int[n][2];
     int count=1;

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter start and end time for activity " + (i + 1) + ": ");
            arr[i][0] = sc.nextInt(); 
            arr[i][1] = sc.nextInt(); 
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));

            int LastEnd = arr[0][1];
        for(int i=1;i<n;i++){  
            int StartNew = arr[i][0];          
            if(StartNew >= LastEnd){
                count++;
                LastEnd = arr[i][1];
            }
        }
        System.out.println(count);

    }
}
