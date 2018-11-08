package lab7;

import java.util.*;

public class CoutingSentences {
    public static void main(String[] args){
            int count = 0;
            int letter = 0;
            int vowels = 0;
            int consonants = 0;
            String alphabet = "qwertyuiopasdfghjklzxcvbnm";


            String trimmed;
            int len;
            String[] words;




            System.out.println("Enter text :");
            Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();


            sentence = sentence.toLowerCase();


            for (int i=0 ; i<sentence.length(); i++)
            {

                //Count number of sentence:
                char ch = sentence.charAt(i);
                if(ch == '.' || ch == '?' || ch == '!'){
                    count ++;
                }

                else
                //Count number of vowels:
                if(ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    ++vowels;
                }

                else
                //Count number of consonants:
                    if((ch >= 'a'&& ch <= 'z')) {
                    ++consonants;
                }

            }
//--------------------------------------------
            //Count number of words
        //remove the extra space between words
        trimmed = sentence.trim();
        //check if the entered string is null / empty
        if (trimmed.isEmpty()) {
            //if null print zero
            System.out.println(0);
        } else {

            //let's count the number of words by spliting it
            words = trimmed.split("\\s+");

            //find the length of the words
            len = words.length;
            System.out.println("Number of words: " + len);
        }

        //Count number of letters:
        for (int i = 0; i<sentence.length(); i++){
                    for (int j = 0; j < alphabet.length(); j ++){
                        if (sentence.charAt(i) == alphabet.charAt(j)){
                            letter = letter +1;
                        }
//
                    }
                }


        StringTokenizer t = new StringTokenizer(sentence);
        HashMap<String,Integer> hms=new HashMap<String,Integer>();

        while(t.hasMoreTokens())
        {

            String word = t.nextToken();
            hms.put(word,(hms.get(word)==null?1:hms.get(word)+1));

        }

        System.out.println("Number of letters: " +letter);
            System.out.println("Number of sentences: " +count);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println(" Repeated words: " + hms.toString());

    }
}
