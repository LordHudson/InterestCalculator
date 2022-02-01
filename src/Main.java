public class Main {
    public static void main(String[] args) {
        SimpleInterest simpleInterest = new SimpleInterest(1000.00,7.5,12);
        System.out.println("Your simple interest is: " + simpleInterest.simpleInterestCalculator());
        System.out.println("New balance is: " + simpleInterest.newBalance());

        CompoundInterest compoundInterest = new CompoundInterest(5000,
                5,12,10);
        System.out.println("Your compound interest is: " + compoundInterest.compoundInterest());
        System.out.println("Your balance is: " + compoundInterest.compoundInterestCalculator());

    }
}
