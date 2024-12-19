import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// file exists
// regex pattern to identify the key
// check the value

// if value is a string - return value.
// if the value is not string, go to the next line

public class Dec18 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\t3k1p\\IdeaProjects\\hackerrank\\src\\main\\resources\\ip2.txt");
        Scanner fileReader = new Scanner(file);
        String key = "";
        String parentKey = "";
        while (fileReader.hasNext()){

            String line = fileReader.nextLine();
            String value = null;
            if(line.contains(":")){
                if(line.contains("{")) {
                    parentKey = parentKey + "~" + line.substring(1, line.indexOf(":")).replaceAll("[^A-Za-z0-9]", "");
                }
                else {
                    key = parentKey + "~" + line.substring(1, line.indexOf(":")).replaceAll("[^A-Za-z0-9]", "");
                    value = line.substring(line.indexOf(":")+1, line.length()).replaceAll("[^A-Za-z0-9]","");
                    System.out.println("key: " + key);
                    System.out.println("value: " + value);
                    key="";
                }
            }
            };
        }
    }