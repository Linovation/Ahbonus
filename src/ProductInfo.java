public class ProductInfo {

    private String ProductName;
    private float Price;

    public ProductInfo(String productName, float price) {
        ProductName = productName;
        Price = price;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        this.Price = price;
    }
}
