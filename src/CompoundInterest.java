public class CompoundInterest {

    private final double principalAmount;
    private final double interestRate;
    private final double compoundedInterest;
    private final double timePeriod;

    public CompoundInterest(double principalAmount, double interestRate, double compoundedInterest, double timePeriod) {
        this.compoundedInterest = compoundedInterest;
        this.interestRate = interestRate;
        this.principalAmount = principalAmount;
        this.timePeriod = timePeriod;
    }

    public double compoundInterestCalculator () {
        double interest = interestRate/100;
//        System.out.println("Interest " + interest);
        double tempAmount = compoundedInterest * timePeriod;
//        System.out.println("Temp amount " + tempAmount);
        double powAmount = (1+interest/compoundedInterest);
        double x = Math.pow(powAmount, tempAmount);
        //        System.out.println("amount " + amount);
        return principalAmount * x;
    }

    public double compoundInterest () {
        double interest = interestRate/100;
        double tempAmount = compoundedInterest * timePeriod;
        double powAmount = (1+interest/compoundedInterest);
        double x = Math.pow(powAmount, tempAmount);
        return (principalAmount * x) - principalAmount;
    }
}
