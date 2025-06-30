import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(targetName);

            if (compare == 0) return products[mid];
            else if (compare < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}
