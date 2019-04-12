import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MorganAndString {

    // Complete the morganAndString function below.
    static String morganAndString(String a, String b) {
        String res = "";
        int ia =0, ib=0;
        // char[] ac = a.toCharArray();
        // char[] bc = b.toCharArray();
        int la = a.length();
        int lb = b.length();
        char ac, bc;
        while((ia<la || ib<lb)){
            if(ia<la && ib<lb){
                ac=a.charAt(ia);
                bc=b.charAt(ib);
                if((int)ac<=(int)bc){
                    res+=ac;
                    ia++;
                }else{
                    res+=bc;
                    ib++;
                }
            }
            else if (ib<lb){
                res+=b.substring(ib);
                break;
                // System.out.println(res);
            } else if (ia<la){
                res+=a.substring(ia);
                break;
            }
            // System.out.println(res);
        }
        return res;
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("/Users/kdheenad/Documents/misc/IdeaProjects/hackerrank/src/main/resources/ip1.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/kdheenad/Documents/misc/IdeaProjects/hackerrank/src/main/resources/op1.txt"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = morganAndString(a, b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
