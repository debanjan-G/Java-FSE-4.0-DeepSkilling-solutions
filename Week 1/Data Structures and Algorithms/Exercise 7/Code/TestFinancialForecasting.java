public class TestFinancialForecasting {
    public static void main(String[] args) {
        // Test calculate future value
        double presentValue = 1000.0;
        double growthRate = 0.05; // 5% growth
        int periods = 10;

        double futureValue = FinancialForecasting.calculateFutureValue(presentValue, growthRate, periods);
        System.out.printf("Future Value: $%.2f\n", futureValue);

        // Test predict future values
        double[] pastValues = { 1000, 1050, 1100, 1200, 1250 };
        int futurePeriods = 5;

        double[] predictions = FinancialForecasting.predictFutureValues(pastValues, futurePeriods);

        System.out.println("Predicted Future Values:");
        for (int i = 0; i < predictions.length; i++) {
            System.out.printf("Year %d: $%.2f\n", i + 1, predictions[i]);
        }
    }
}