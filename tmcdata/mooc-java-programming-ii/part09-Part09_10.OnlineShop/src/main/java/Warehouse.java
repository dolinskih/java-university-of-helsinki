import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productsPrices;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        this.productsPrices = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productsPrices.put(product, price);
        this.productsStock.put(product, stock);
    }

    public int price(String product) {
        return this.productsPrices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.productsStock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (!this.productsStock.containsKey(product)) {
            return false;
        }

        int stock = this.productsStock.get(product);

        if (stock > 0) {
            this.productsStock.put(product, stock - 1);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        return this.productsPrices.keySet();
    }
}
