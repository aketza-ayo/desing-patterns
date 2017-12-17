public class WordsIterator implements Iterator {
    private String word1, word2, word3, word4, word5;
    private int index;

    public WordsIterator(String word1, String word2, String word3, String word4, String word5){
        this.word1 = word1;
        this.word2 = word2;
        this.word3 = word3;
        this.word4 = word4;
        this.word5 = word5;

        this.index = 0;
    }

    @Override
    public Object next() {
        switch(index){
            case 0:
                return word1;
            case 1:
                return word2;
            case 2:
                return word3;
            case 3:
                return word4;
            case 4:
                return word5;
        }
        return "";
    }

    @Override
    public boolean hasNext() {
        if(index < 5){
            return true;
        }
        return false;
    }
}
