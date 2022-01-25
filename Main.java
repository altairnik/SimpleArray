package homeWork.simpleStore;


public class Main {
    public static void main(String[] args) {
        Products product = new Products ("Witcher", "Very interesting fantasy", 15, 100, Products.Type.BOOK);
        Products product1 = new Products("Apple", "Sweet and yellow", 15, 50, Products.Type.FOOD);
        Products product2 = new Products("Banana", "Favorite monkey's food, long and yellow", 13, 60, Products.Type.FOOD);
        Products product3 = new Products("lemon", "Oval sour yellow fruit", 15, 37, Products.Type.FOOD);
        Products product4 = new Products("milk", "Always fresh", 23, 44, Products.Type.FOOD);
        Products product5 = new Products("Coco", "It isn't a chicken)", 1000, 3, Products.Type.SMUGGLING);
        Products product6 = new Products("tobacco", "Smoking kills", 333, 78, Products.Type.SMUGGLING);
        Products product7 = new Products("Philosophy of Java", "Musthave book)", 67, 40, Products.Type.BOOK);
        Products[] productList = {product, product1, product2, product3, product4, product5, product6, product7};
        LowPrice.lowPrice(productList);
        System.out.println("There are " + SameWord.sameWord(productList) + " products with yellow color");
        SameWord.sameWord(productList);
        SortArrayList.sortByType(productList);
    }
}
