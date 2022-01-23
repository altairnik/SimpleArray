package homeWork.simpleStore;

import java.util.ArrayList;

public class SortArrayList {
    public static void sortByType (Products[] list){
        ArrayList<Products> productsBook = new ArrayList<>();
        ArrayList <Products> productsFood = new ArrayList<>();
        ArrayList <Products> productsSmuggling = new ArrayList<>();
        for (Products prod : list){
            switch (prod.productType){
                case  FOOD: productsFood.add(prod);
                    break;
                case BOOK: productsBook.add(prod);
                    break;
                case SMUGGLING: productsSmuggling.add(prod);
                    break;
            }
        }
        System.out.println("There are " + productsBook.size() + " books in store");
        System.out.println("There are " + productsFood.size() + " food in store");
        System.out.println("There are " + productsSmuggling.size() + " smuggling in store. Call the police!)");
    }

}
