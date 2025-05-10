/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomsentences;

/**
 *
 * @author ade_f
 */

//14.5 (Random Sentences) Write an application that uses random-number generation to create sentences. 
//Use four arrays of strings called article, noun, verb and preposition. 
//Create a sentence by selecting a word at random from each array in the following order: article, noun, verb, preposition, article and noun. 
//As each word is picked, concatenate it to the previous words in the sentence. 
//The words should be separated by spaces. 
//When the final sentence is output, it should start with a capital letter and end with a period. 
//The application should generate and display 20 sentences. 
//The article array should contain the articles "the", "a", "one", "some" and "any"; the noun array should contain the nouns "boy", "girl", "dog", "town" and "car"; 
//the verb array should contain the verbs "drove", "jumped", "ran", "walked" and "skipped"; 
//the preposition array should contain the prepositions "to", "from", "over", "under" and "on".

//Name: Ade Alleyne-Forte

//Course: ITSE 2321_Lab12(Chapter 14)

//Program Status: Complete

// Description: This app accepts a user input for some strings and test whether or not they ar of the same length


import java.util.Random;

public class RandomSentences {
    public static void main(String[] args) {
        // Define arrays for words
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

        Random random = new Random();

        // Generate 20 random sentences
        for (int i = 0; i < 20; i++) {
            String sentence = generateSentence(articles, nouns, verbs, prepositions, random);
            System.out.println(sentence);
        }
    }

    private static String generateSentence(String[] articles, String[] nouns, String[] verbs, String[] prepositions, Random random) {
        // Pick random words
        String article1 = articles[random.nextInt(articles.length)];
        String noun1 = nouns[random.nextInt(nouns.length)];
        String verb = verbs[random.nextInt(verbs.length)];
        String preposition = prepositions[random.nextInt(prepositions.length)];
        String article2 = articles[random.nextInt(articles.length)];
        String noun2 = nouns[random.nextInt(nouns.length)];

        // Construct the sentence
        String sentence = article1 + " " + noun1 + " " + verb + " " + preposition + " " + article2 + " " + noun2;

        // Capitalize the first letter and add a period
        return sentence.substring(0, 1).toUpperCase() + sentence.substring(1) + ".";
    }
}