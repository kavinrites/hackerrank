package hr;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("");
        int diff = arr[1] - arr[0];
        int ind = 1;
        for(int i=1;i+1<arr.length;i++){
            if(diff > arr[i+1] - arr[i]){
                diff = arr[i+1] - arr[i];
            } else if(diff == arr[i+1] - arr[i]){
                ind++;
            }else{

            }
        }
        System.out.println("diff : " + diff + " ind : " + ind);
        int[] res = new int[ind*2];
        int finalLen = 0;
        int val =0;
        for(int i=0;i+1<arr.length;i++){
            if(diff == arr[i+1] - arr[i]){
                System.out.println(arr[i+1] + arr[i]);
                res[val++] = arr[i];
                res[val++] = arr[i+1];
                finalLen = val;
            }
        }
        int[] res1 = new int[finalLen];
        for(int q=0;q<finalLen;q++){
            res1[q] = res[q];
        }
        return res1;
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("/home/postgres_user/IdeaProjects/hackerrank/src/main/resources/ip.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/postgres_user/IdeaProjects/hackerrank/src/main/resources/op.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrItems.length];


        for (int i = 0; i < arrItems.length; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
