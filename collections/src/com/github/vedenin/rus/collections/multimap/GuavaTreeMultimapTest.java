package com.github.vedenin.rus.collections.multimap;

import com.google.common.collect.Multimap;
import com.google.common.collect.TreeMultimap;

import java.util.Arrays;
import java.util.List;

//  Attention: version with english comments in "eng" package
public class GuavaTreeMultimapTest {

    // Задача вывести разобрать текст и вывести все индексы для каждого слова
    public static void main(String[] args) {
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        // Разберем текст на слова и индексы
        List<String> words = Arrays.asList(INPUT_TEXT.split(" "));
        // Создаем Multimap
        Multimap<String, Integer> multiMap = TreeMultimap.create();

        // Заполним Multimap
        int i = 0;
        for(String word: words) {
            multiMap.put(word, i);
            i++;
        }

        // Выводим все вхождения слов в текст
        System.out.println(multiMap); // напечатает {Hello=[0, 2], World!=[1, 5], All!=[3], Hi=[4]}-в натуральном порядке
        // Выводим все уникальные слова
        System.out.println(multiMap.keySet());    // напечатает [Hello, World!, All!, Hi]- в натуральном порядке

        // Выводим все индексы вхождения слова в текст
        System.out.println("Hello = " + multiMap.get("Hello"));    // напечатает [0, 2]
        System.out.println("World = " + multiMap.get("World!"));    // напечатает [1, 5]
        System.out.println("All = " + multiMap.get("All!"));    // напечатает [3]
        System.out.println("Hi = " + multiMap.get("Hi"));    // напечатает [4]
        System.out.println("Empty = " + multiMap.get("Empty"));    // напечатает []

        // Выводим общее количества всех слов в тексте
        System.out.println(multiMap.size());    //напечатает 6

        // Выводим общее количество всех уникальных слов
        System.out.println(multiMap.keySet().size());    //напечатает 4
    }
}
