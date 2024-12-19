package hr;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(revString("kavi", 4));
        System.out.println(revString("Saranya", "Saranya".length()));
    }

    public static String revString(String ip, int len) {
        if(len == 1){
            return ip;
        } else {
            return ip.substring(len-1) + revString(ip.substring(0,len-1),len-1);
        }
    }
}
