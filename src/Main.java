import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int pin = 1234;
        int countErrorInputPin = 0;
        int pinFromCustomer = 0;
        double balance = 2500.75;
        boolean loginSuccees = false;
        int selectedNumFromUser = 0;
        int numberOfSuccessDeposit = 0;
        int numberOfSuccessWithDrawal = 0;

        System.out.println("We are happy to have you with us at the National Bank of Egypt");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Pin");

        while (true) {

            pinFromCustomer = scan.nextInt();
            if (pinFromCustomer == pin) {
                loginSuccees = true;
                System.out.println("login success" + "\uD83D\uDE00" + ":-");
                System.out.println(" ");
                break;

            } else if (countErrorInputPin < 2) {
                System.out.println("Please try Again " + "\uD83D\uDE42");
            } else {
                System.out.println("Your Acount Blocked");
                break;
            }
            countErrorInputPin++;

        }
        if (loginSuccees) {

            do {

                System.out.println("Please select number from list :- ");
                System.out.println("1-Check Balance ");
                System.out.println("2-Deposit");
                System.out.println("3-Withdraw ");
                System.out.println("4-Show Acount Status");
                System.out.println("5- Exit");
                System.out.println(" ");

                selectedNumFromUser = scan.nextInt();
                switch (selectedNumFromUser) {
                    case 1:
                        System.out.println("Your Balance Is :" + balance);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Enter Your Depost");
                        System.out.println();
                        double depost = scan.nextDouble();
                        if (depost <= 0) {
                            System.out.println("invalid Amount");
                        } else {
                            balance += depost;
                            numberOfSuccessDeposit++;
                            System.out.println("your balance Updated");
                            System.out.println("it now : " + balance);
                            System.out.println();
                        }

                        break;
                    case 3:
                        System.out.println("Your Withdraw");
                        double withdraw = scan.nextDouble();
                        if (withdraw <= 0) {
                            System.out.println("invalid Amount");
                        } else if (withdraw > balance) {
                            System.out.println("withdraw is grater than balnce chooice less than ");
                            System.out.println();
                        } else {
                            balance -= withdraw;
                            numberOfSuccessWithDrawal++;
                            System.out.println("Success withdraw Now Balance Is " + balance);
                            if (balance <= 0) {
                                System.out.println("YOUR ACCOUNT IS EMPTY");

                            }
                            System.out.println();
                        }
                        break;
                    case 4:
                        System.out.println("Your Account is ");
                        if (balance >= 5000) {
                            System.out.println("VIP Customer ");
                            System.out.println("BALANCE is  " + balance);
                            System.out.println();

                        } else if (balance >= 1000 && balance <= 4999) {
                            System.out.println("REGULAR Customer  ");
                            System.out.println("BALANCE is  " + balance);
                            System.out.println();
                        } else {
                            System.out.println("LOW BALANCE ");
                            System.out.println("BALANCE is  " + balance);
                            System.out.println();
                        }
                        break;
                    case 5:
                        System.out.println("THANK YOU for using OUR ATM :- ");
                        System.out.println("Sucess NUmber of Deposit :" + numberOfSuccessDeposit);
                        System.out.println("Sucess NUmber of WithDrawal : " + numberOfSuccessWithDrawal);

                        System.out.println("  ");
                        break;
                    default:
                        System.out.println("invalid Option");
                        System.out.println();
                        break;

                }


            } while (selectedNumFromUser != 5);

        }


    }
}