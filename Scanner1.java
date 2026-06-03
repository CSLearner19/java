import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Please Enter Your Name: ");
    String name = sc.nextLine();
    System.out.println("Please Enter Your Lucky Number: ");
    int lucky = sc.nextInt();
    System.out.println("Your name is " +name+ " and your lucky number " + lucky+ " shows that you are really hardworking!");
    sc.close();
    }
}