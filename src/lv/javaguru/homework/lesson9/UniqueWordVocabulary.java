package lv.javaguru.homework.lesson9;

import java.util.HashSet;
import java.util.Set;

//trūkst testu
public class UniqueWordVocabulary {

    Set<String> word = new HashSet<>();  //stāvoklim jabūt private

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
