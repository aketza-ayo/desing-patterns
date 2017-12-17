public class Driver {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Words words = new Words();

        numbers.addElement(7);
        numbers.addElement(2);
        numbers.addElement(6);
        numbers.addElement(4);
        numbers.addElement(9);

        words.addElement("FOUR");
        words.addElement("NINE");
        words.addElement("SEVEN");
        words.addElement("TWO");
        words.addElement("SIX");

        System.out.println("Printing numbers");
        Iterator numIterator = numbers.getIterator();
        while(numIterator.hasNext()){
            int number = (int)numIterator.next();
            System.out.println(number);
        }

        System.out.println();
        System.out.println("Printing words");
        Iterator wordIterator = numbers.getIterator();
        while(wordIterator.hasNext()){
            String word = (String)wordIterator.next();
            System.out.println(word);
        }

    }
}
