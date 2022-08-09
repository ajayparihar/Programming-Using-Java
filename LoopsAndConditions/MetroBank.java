import java.util.Scanner;

public class MetroBank {
    public static void main(String[] args) {

        int accountNumber;
        int salary;
        int accountBalance;
        String loanType;
        int loanAmountExpected;
        int emisExpected;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter ACCOUNT NUMBER");
        accountNumber = scan.nextInt();

        System.out.println("Enter SALARY");
        salary = scan.nextInt();

        System.out.println("Enter ACCOUNT BALANCE");
        accountBalance = scan.nextInt();

        System.out.println("Enter LOAN TYPE \"Car\",\"Business\"Or\"House\"");
        loanType = scan.next();


        System.out.println("Enter EXPECTED LOAN AMOUNT");
        loanAmountExpected = scan.nextInt();

        System.out.println("Enter EXPECTED EMIs");
        emisExpected = scan.nextInt();

        System.out.println(loanType);

        if (accountNumber >= 1000 && accountNumber <= 1999) {

            if (accountBalance >= 1000) {
                if (loanType.equals("Car") || loanType.equals("car") || loanType.equals("CAR")) {
                    if (salary >= 25000 && loanAmountExpected <= 500000 && emisExpected <= 36) {
                        System.out.println("Eligible Loan Amount= 500000");
                        System.out.println("Eligible EMIs= 36");
                    } else {
                        System.out.println("SORRY, Bank can't provide you the loan");
                    }
                } else if (loanType.equals("Business") || loanType.equals("business") || loanType.equals("BUSINESS")) {
                    if (salary >= 75000 && loanAmountExpected <= 6000000 && emisExpected <= 60) {
                        System.out.println("Eligible Loan Amount= 6000000");
                        System.out.println("Eligible EMIs= 60");
                    } else {
                        System.out.println("SORRY, Bank can't provide you the loan");
                    }
                } else if (loanType.equals("House") || loanType.equals("house") || loanType.equals("HOUSE")) {
                    if (salary >= 75000 && loanAmountExpected <= 7500000 && emisExpected <= 84) {
                        System.out.println("Eligible Loan Amount= 7500000");
                        System.out.println("Eligible EMIs= 84");
                    } else {
                        System.out.println("SORRY, Bank can't provide you the loan");
                    }
                } else { //Loan Type
                    System.out.println("INVALID LOAN TYPE");
                }

            } else { //Account Balance
                System.out.println("Minimum Account Balance Should be more than 1000$");
            }

        } else { //Account Number
            System.out.println("INVALID ACCOUNT Number");
        }
        scan.close();
    }
}
