package hr;

public class DivisibleBy3 {
  public static void main(String[] args) {
    System.out.println(isDivisibleBy3(-3039));
  }
  
  public static boolean isDivisibleBy3(int ip) {
    String ipStr = String.valueOf(Math.abs(ip));
    int n = 0;
    for(int i = 0; i<ipStr.length(); i++){
        n += Integer.valueOf(ipStr.substring(i,i+1));
    }
    System.out.println("input :" + ip);
    System.out.println("n:" + n);
    if(n > 0 ) {
        while (n > 2) {
            n = n - 3;
        }
    } else {
        while (n < -2) {
            n = n + 3;
        }
    }
    System.out.println("n:" + n);
    if (n == 0) {
      return true;
    }
    return false;
  }
}
