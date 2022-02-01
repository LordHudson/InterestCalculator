public class SimpleInterest {
    private final double principalAmount;
    private final double interestRate;
    private final int time;

    public SimpleInterest(double principalAmount, double interestRate, int time) {
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.time = time;
    }

    public double simpleInterestCalculator () {
        return this.principalAmount * (this.interestRate/100) * this.time;
    }

    public double newBalance () {
        return this.principalAmount + simpleInterestCalculator();
    }

}
