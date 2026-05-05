import java.util.*;
public class Buy_two_chocolates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how may chocolate prices are there: ");
        int n = sc.nextInt();

        System.out.println("Enter how much money you have: ");
        int m = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i< n; i++){
            System.out.print("Enter price of "+arr[i]+"th chocolate: ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int total_price = arr[0] + arr[1];
        int remain_money = m;
        if(total_price <= remain_money){
            remain_money = remain_money-total_price;
            System.out.println(remain_money);
        }else{
            System.out.println(remain_money);
        }

    }
}