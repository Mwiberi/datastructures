import java.util.Scanner;

public class dividends {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter starting balance: ");
        double starting= sc.nextDouble();

        System.out.print("Enter per month contribution: ");
        double perMonContrib= sc.nextDouble();

        System.out.print("Enter dividend percetage ");
        double dividend=sc.nextDouble();

        double perMonthInterest = perMonContrib *dividend/100;
        for(double i=1; i<12;i++){
        //contribution per month(2500)*interest rate(10.5)=262.5
            double divid = perMonthInterest*(i/12);

            // System.out.println(divid);

            dividend+=divid;
            
        }
        System.out.println("Total for the year: " +dividend);
        System.out.println("Total cumulative: " +(dividend+starting));
        
    }
    
}