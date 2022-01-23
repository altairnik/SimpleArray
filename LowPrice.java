package homeWork.simpleStore;

public class LowPrice {

    public static void lowPrice(Products[] List){
        int summ = 0;
        for (Products prod : List) {
            //System.out.println(prod.toString());
            if (prod.price < 100)
                summ++;
        }
        System.out.println("There are " + summ + "products cheaper 100");
    }
}
