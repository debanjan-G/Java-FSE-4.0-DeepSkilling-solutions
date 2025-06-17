public class FinancialForecasting {

    /**
     * Calculate future value using recursive approach
     * Formula: FV = PV * (1 + r)^n
     */
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: if no periods left, return present value
        if (periods == 0) {
            return presentValue;
        }

        // Recursive case: apply growth rate and reduce periods
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    /**
     * Predict future values based on past growth rates
     */
    public static double[] predictFutureValues(double[] pastValues, int futurePeriods) {
        if (pastValues.length < 2) {
            throw new IllegalArgumentException("Need at least 2 past values");
        }

        // Calculate average growth rate from past data
        double totalGrowthRate = 0;
        for (int i = 1; i < pastValues.length; i++) {
            double growthRate = (pastValues[i] - pastValues[i - 1]) / pastValues[i - 1];
            totalGrowthRate += growthRate;
        }
        double avgGrowthRate = totalGrowthRate / (pastValues.length - 1);

        // Predict future values using recursive approach
        double[] futureValues = new double[futurePeriods];
        double currentValue = pastValues[pastValues.length - 1]; // Start with last known value

        for (int i = 0; i < futurePeriods; i++) {
            currentValue = calculateFutureValue(currentValue, avgGrowthRate, 1);
            futureValues[i] = currentValue;
        }

        return futureValues;
    }
}