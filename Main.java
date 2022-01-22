package homeWork.simpleStore;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int book = 0;
        int word = 0;
        Stuff product = new Stuff("Witcher", "Very interesting fantasy", 15, 100, Products.Type.BOOK);
        Stuff product1 = new Stuff("Apple", "Sweet and yellow", 15, 50, Products.Type.FOOD);
        Stuff product2 = new Stuff("Banana", "Favorite monkey's food, long and yellow", 13, 60, Products.Type.FOOD);
        Stuff product3 = new Stuff("lemon", "Oval sour yellow fruit", 15, 37, Products.Type.FOOD);
        Stuff product4 = new Stuff("milk", "Always fresh", 23, 44, Products.Type.FOOD);
        Stuff product5 = new Stuff("Coco", "It isn't a chicken)", 1000, 3, Products.Type.SMUGGLING);
        Stuff product6 = new Stuff("tobacco", "Smoking kills", 333, 78, Products.Type.SMUGGLING);
        Stuff product7 = new Stuff("Philosophy of Java", "Musthave book)", 67, 40, Products.Type.BOOK);
        Products[] productList = {product, product1, product2, product3, product4, product5, product6, product7};
        ArrayList <Products> productsBook = new ArrayList<>();
        ArrayList <Products> productsFood = new ArrayList<>();
        ArrayList <Products> productsSmuggling = new ArrayList<>();
        for (Products prod : productList) {
            //System.out.println(prod.toString());
            if (prod.price < 100)
                sum++;
        }
        for (Products prod : productList){
            if (prod.description.contains("yellow"))
            word++;
        }
        for (Products prod : productList){
            switch (prod.productType){
                case  FOOD: productsFood.add(prod);
                break;
                case BOOK: productsBook.add(prod);
                break;
                case SMUGGLING: productsSmuggling.add(prod);
                break;
            }
        }
        System.out.println(sum+" products are cheaper 100 ");
        System.out.println("There are " + word + " yellow products");
        //System.out.println(productsBook);
        //System.out.println(productsFood);
        //System.out.println(productsSmuggling);

    }
}
