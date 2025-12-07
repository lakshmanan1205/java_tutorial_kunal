import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        1.LEAP YEAR OR NOT
//        int year=getInput("Enter Year to verify","enter valid Year");
//        leapYear(year);
        //TEST
//        1.1900 - Not a Leap Year
//        2.2000 - Leap Year
//        3.2100 - Not a Leap Year
//        4.2400 - Leap Year
//        5.2500 - Not a Leap Year
//        RESULTS
//        leapYear(1900);
//        leapYear(2000);
//        leapYear(2100);
//        leapYear(2400);
//        leapYear(2500);
//        2.SUM OF TWo NUMBERS
//        int A=getInput("Enter Input A","Enter valid input A");
//        int B=getInput("Enter Input B","Enter valid input B");
//        int sumAns=A+B;
//        System.out.println("Sum ans "+sumAns);
//        3.MULTIPLICATION TABLE
//        int tablNumber = getInput("Enter Table Number","Enter Valid Table Number");
//        multiplicationTable(tablNumber);
//        5.NUMBER LOOP
numberloop();
    }
    public static int getInput(String info,String errMsg){
        Scanner input = new Scanner(System.in);
        System.out.println(info+" : ");
        int year=0;
        try {
             year= input.nextInt();
            while (year <=0 ||!getDataType(year).equals("Integer") ){
                System.out.println(errMsg);
                year = input.nextInt();
            }
        }catch (Exception e){
            System.out.println("Enter Valid Numbers");
            getInput("Enter Year to verify","enter valid Year");
        }
        return year;
    }
    public static String getDataType(Object obj) {
        return obj.getClass().getSimpleName();
    }
    public  static void leapYear(int year){
        if(year%4==0){
            if(year%100==0 && year%400==0){
                System.out.println(year+" Leap Year");
            }else {
                System.out.println(year+" Not a Leap Year");
            }
        }else {
            System.out.println(year+" No89t a Leap Year");
        }
    }
    public static int sum(int A,int B){
        return A+B;
    }
    public static void multiplicationTable(int number){
        for (int i = 0; i <=10 ; i++) {
            System.out.printf("%d * %d = %d \n",number,i,number*i);
        }
    }
    public static void numberloop(){
        ArrayList<Integer> numbers =new ArrayList();
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Number : ");
        char userEnteredChar = 'a';
        do{
            try {
                int num = in.nextInt();
                numbers.add(num);
            } catch (Exception e) {
                userEnteredChar = in.next().charAt(0);
                if (userEnteredChar == 'x'||userEnteredChar == 'X') {
                    break;
                }else {
                    System.out.println("Enter Valid Number :");
                }
            }
        }while (userEnteredChar !='x');
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of All numbers is " + sum);
    }
}

