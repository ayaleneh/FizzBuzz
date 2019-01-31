import java.util.Scanner;

public class Eliza {
    public static void main(String[] args) {
        String result1="I am feeling great";
        String result2="q";
        String input="";
        System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
        Scanner scanner=new Scanner(System.in);
          while (true){
              input=scanner.next();
              if((input.equals(result1))||(input.equals(result2))||(input.equals(result2.toUpperCase()))){
                  System.exit(0);
              }
              System.out.println(input);
          }
    }

}
