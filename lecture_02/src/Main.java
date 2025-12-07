import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        oddOEven();
//        greeting();
//        simpleIntrest();
//        calculator();
//        largestNumber();
//        System.out.println(convertToUSD(900));
//        fibonacciSeries(10);
//        System.out.println(isPalindrome("a"));
//        System.out.println(findArmstrongNumsInRange(0,200));
    }



    public static void oddOEven(){
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number :");
        try{
         num = input.nextInt();
            if(num%2==0){
                System.out.println("Even");
            }else {
                System.out.println("Add");
            }
        }catch (Exception e){
            System.out.println("Enter a valid Number");
            oddOEven();
        }

    }
    public static void greeting(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name :");
            String name= input.next();
            System.out.println("Welcome back "+name);

    }
    public static double getInput(String info,String errMsg){
        Scanner input=new Scanner(System.in);
        System.out.println(info);
        double value=0;
        try {
            value=input.nextDouble();
            return value;
        }catch (Exception e){
            System.out.println(errMsg);
            return getInput(info,errMsg);
        }
    }
    public static void simpleIntrest(){
        double amount=getInput("Enter Principal Amount :","Enter valid Amount");
        double intrest=getInput("Enter Intrest :","Enter valid Intrest");
        double years=getInput("Enter Years :","Enter valid years");
        while (years<=0){
            System.out.println("Enter a Valid Year");
            years=getInput("Enter Years :","Enter valid years");
        }
        double sip=(amount*intrest*years)/100;
        System.out.println("SIP is "+sip);
    }
    public static void calculator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        double A=getInput("Enter First Number","Enter valid Number");
        double B=getInput("Enter Second8 Number","Enter valid Number");
        System.out.println("Enter a operator");
        char operator=input.next().charAt(0);
        switch (operator){
            case '+':
                System.out.printf("Addion of %s and %s is %s \n",A,B,A+B);
                break;
            case '-':
                System.out.printf("Substrction of %s and %s is %s \n",A,B,A-B);
                break;
            case '*':
                System.out.printf("Multiplication of %s and %s is %s \n",A,B,A*B);
                break;
            case '/':
                System.out.printf("Division of %s and %s is %s \n",A,B,A/B);
                break;
            default:
                System.out.println("Unexected operator");
        }
    }
    public static void largestNumber(){
        double A= getInput("Enter input A","Enter valid number");
        double B= getInput("Enter input B","Enter valid number");
        if(A==B){
            System.out.printf("%s is equal to %s",A,B);
        }if (A>B){
            System.out.printf("%s is greater than %s",A,B);
        }else {
            System.out.printf("%s is greater than %s",B,A);
        }
    }
    public static double convertToUSD(double money){
        return 0.011*money;
    }
    public  static  void fibonacciSeries(int number){
        int a =0;
        int b=1;
        int c;
        System.out.print(a+", "+b);
        for (int i = 2; i < number; i++) {
            c=a+b;
            a=b;
            b=c;

            System.out.print(", "+c);
        }

    }
    public static boolean isPalindrome(String str){
        str=str.toLowerCase();
        if(str.length()==0){
            System.out.println("Enter valid String");
            return false;
        }
        String convertedStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            convertedStr+=str.charAt(i);
        }
        System.out.println(convertedStr);
        return convertedStr.equals(str);

    }
    public static ArrayList findArmstrongNumsInRange(int start,int end){
        ArrayList<Integer> armstrongNums = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if(isArmstrongNum(i)){
                armstrongNums.add(i);
            }
        }
        return armstrongNums;
    }
    public static boolean isArmstrongNum(int num){
        int initNum= num;
        ArrayList<Integer> digits = new ArrayList<>();
        while(num>0){
            int digit = num%10;
            num = num/10;
            digits.add(digit);
        }
//        System.out.println(digits);
        int result = 0;
        for (int i = 0; i < digits.size(); i++) {
           result=result + (int) Math.pow(digits.get(i),digits.size());
        }
        return result==initNum;
    }
}