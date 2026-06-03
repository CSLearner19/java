import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        int sum = 0;
        String result;
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter number of subjects: ");
        int NoOfSubjects = sc.nextInt();
        int marks [] = new int [NoOfSubjects];
        System.out.println("Enter the marks of " +NoOfSubjects+ "subjects. Press Enter after every mark.");
        for (int i=0; i<NoOfSubjects; i++){
            marks[i] = sc.nextInt();
        }
        for (int j=0; j<NoOfSubjects; j++){
            sum = sum + marks[j];
        }
        int percentage = sum/NoOfSubjects;
        if (percentage>= 95){
            result="You scored A++ grade. Great Work!";
        }
        else if (percentage>90 && percentage<95){
            result="You scored A+. Well Done!";
        }
        else {
            result="You did fine";
        }
        System.out.println(result);
        sc.close();
    }
}
