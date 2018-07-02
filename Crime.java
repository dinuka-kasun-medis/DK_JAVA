import java.util.Scanner;

public class Crime {
    private static boolean checkPrime(int date){
        int a=0;
        for (int i = 1; i <= date; i++) {
            if (date%i==0) {
                a++;
            }
        }
        if (a==2) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input date formate (0000-00-00) :");
        String date = input.nextLine();
        int dateForCalculation=Integer.parseInt(date.split("-")[2]);
        if (checkPrime(dateForCalculation)) {
            System.out.println("There will be a crime");
        }else{
            System.out.println("There not will be a crime");
        }
    }
}
