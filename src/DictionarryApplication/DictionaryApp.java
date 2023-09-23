package DictionarryApplication;

public class DictionaryApp {
    DictionaryManagement dictionaryManagement = new DictionaryManagement();
    DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
    Dictionary dictionary = new Dictionary();

    public void dictionaryBasic() {
        dictionaryManagement.insertFromCommandline(dictionary);
        dictionaryCommandline.showAllWord(dictionary);
    }
}
