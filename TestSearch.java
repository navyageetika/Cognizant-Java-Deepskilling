public class TestSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Personal Care"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "T-Shirt", "Clothing"),
            new Product(105, "Book", "Education")
        };

        String target = "Phone";

        System.out.println("Using Linear Search:");
        Product result1 = SearchAlgorithms.linearSearch(products, target);
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\nUsing Binary Search:");
        Product result2 = SearchAlgorithms.binarySearch(products, target);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
