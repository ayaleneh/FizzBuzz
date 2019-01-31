import java.util.*;
public class Sort_Letters_in_Ascending_Order {
    public static void main(String[] args) {
        String word;
        System.out.println("useed to ascend  letter..");
        System.out.println("please enter word ...");
        Scanner scanner=new Scanner(System.in);
        word=scanner.nextLine();
//        for(int i=0;i<word.length();i++){
//            System.out.println((int)word.charAt(i));
//        }
        char[] chars=word.toCharArray();

        Arrays.sort(chars);
        String Sorted=new String(chars);
        System.out.println(Sorted);
    }
}
