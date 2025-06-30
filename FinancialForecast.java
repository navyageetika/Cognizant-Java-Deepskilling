// FinancialForecast.java
import java.util.HashMap;
import java.util.Map;

public class FinancialForecast {

    // Recursive approach
    public static double forecastRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue;
        return (1 + growthRate) * forecastRecursive(initialValue, growthRate, years - 1);
    }

    // Memoized version to avoid redundant recursive calls
    private static final Map<Integer, Double> memo = new HashMap<>();

    public static double forecastMemoized(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue;
        if (memo.containsKey(years)) return memo.get(years);

        double value = (1 + growthRate) * forecastMemoized(initialValue, growthRate, years - 1);
        memo.put(years, value);
        return value;
    }

    public static void main(String[] args) {
        double initial = 1000.0;
        double rate = 0.05;  // 5% annual growth
        int years = 5;

        double resultRecursive = forecastRecursive(initial, rate, years);
        double resultMemo = forecastMemoized(initial, rate, years);

        System.out.printf("Future Value (Recursive): %.10f%n", resultRecursive);
        System.out.printf("Future Value (Memoized): %.10f%n", resultMemo);

        System.out.println("\nTime Complexity:");
        System.out.println("Recursive: O(n) (linear recursive calls for n years)");
        System.out.println("Memoized: O(n) (linear with cached results)");
    }
}
