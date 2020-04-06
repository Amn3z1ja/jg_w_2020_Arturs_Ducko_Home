package lv.javaguru.homework.lesson9;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    Set<String> word = new HashSet<>();


    public boolean addWords(String newWord) {
        return newWord != null && word.add(newWord);
    }



    public int getUniqueWords() {
        return word.size();

    }

    public void printToConsole() {
        word.forEach(System.out::println);

    }


}
