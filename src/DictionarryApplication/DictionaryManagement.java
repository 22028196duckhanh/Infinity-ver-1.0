package DictionarryApplication;

import java.util.Scanner;

public class DictionaryManagement {
    public void insertFromCommandline(Dictionary dictionary) {
        Scanner sc = new Scanner(System.in);
        int numsOfWord = sc.nextInt();
        String tmp = sc.nextLine();
        for (int i = 0; i < numsOfWord; i++) {
            String wordTarget = sc.nextLine();
            String wordExplain = sc.nextLine();
            dictionary.add(new Word(wordTarget, wordExplain));
        }
    }
}
