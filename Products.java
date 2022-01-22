package homeWork.simpleStore;

public abstract class Products {
    String name;
    String description;
    int price;
    int quantity;
    Type productType;

    @Override
    public String toString() {
        return "{ name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", productType=" + productType +
                '}';
    }

    public Products(String name, String description, int price, int quantity, Type productType) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.productType = productType;
    }

    enum Type{
        FOOD,
        BOOK,
        SMUGGLING
    }
}
