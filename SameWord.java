package homeWork.simpleStore;

public class SameWord {
    public static int sameWord(Products[] list){
        int word = 0;
        for (Products prod : list){
            if (prod.description.contains("yellow"))
                word++;
        }
        return word;
    }
}
