import java.util.Scanner;
public class CBSC_board_result {


    public static void main(String[] args) {
        System.out.println("percent calculator");
        Scanner percent =new Scanner(System.in);
        System.out.println("Enter subject 1 marks");
        int a = percent.nextInt();
        System.out.println("Enter subject 1 maximum marks");
        int f = percent.nextInt();
        System.out.println("Enter subject 2 marks");
        int b = percent.nextInt();
        System.out.println("Enter subject 2 maximum marks");
        int g = percent.nextInt();
        System.out.println("enter subject 3 mark");
        int c = percent.nextInt();
        System.out.println("Enter subject 3 maximum marks");
        int h = percent.nextInt();
        System.out.println("enter subject 4 mark");
        int d = percent.nextInt();
        System.out.println("Enter subject 4 maximum marks");
        int i = percent.nextInt();
        System.out.println("enter subject 5 mark");
        int e = percent.nextInt();
        System.out.println("Enter subject 5 maximum marks");
        int j = percent.nextInt();
        int sum = a+b+c+d+e;
        int sum1 =f+g+h+i+j;
        System.out.println("obtain mark");
        System.out.println(sum);
        System.out.println("maximum marks");
        System.out.println(sum1);
        float sum2 = sum*100f/sum1;
        System.out.println("percentage");
        System.out.println(sum2);
      //  System.out.println(sum/sum1);
       // int sum2 = sum/sum1;
     //   System.out.println("percentage");
       // int sum3 =sum/sum1*100;
       // System.out.println(sum3);
        //   float sum2 = sum/sum1;
        //   float sum3 = sum2*100;
    }
}
