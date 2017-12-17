public class Words {
    private String word1, word2, word3, word4, word5;
    private int index;

    Words(){
        index = 0;
    }

    public void addElement(String word){
        switch(index){
            case 0:
                word1 = word;
                break;
            case 1:
                word2 = word;
                break;
            case 2:
                word3 = word;
                break;
            case 3:
                word4 = word;
                break;
            case 4:
                word5 = word;
                break;
        }
        index++;
    }

    public WordsIterator getIterator(){
        return new WordsIterator(word1, word2, word3, word4, word5);
    }
}
