import java.util.Scanner;
public class Main {

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("enter your name");
          String name = sc.nextLine();

          System.out.println(" enter your age :");
          int age = sc.nextInt();

          System.out.println("are you student true/false?");
          Boolean ifStudent = sc.nextBoolean();

          System.out.println("enter your gpa");
          double gpa = sc.nextDouble();

          System.out.println("damn your name is "+name+" its so unique ");
          System.out.println("and you are " + age + "years old damnnnn");
          System.out.println("and you are " + gpa + " gpa");
          if (ifStudent) {
               System.out.println("you are enrolled");
          }
          else {
               System.out.println("you are not enrolled");
          }





     }
}
