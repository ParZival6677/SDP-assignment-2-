public class ProductBuilder {
    private String id;
    private String pname;
    private int qty;
    private double price;
    private double totalPrice;

    public ProductBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public ProductBuilder setName(String pname) {
        this.pname = pname;
        return this;
    }

    public ProductBuilder setQuantity(int qty) {
        this.qty = qty;
        return this;
    }

    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public Product build() {
        return new Product(id, pname, qty, price, totalPrice);
    }
}
