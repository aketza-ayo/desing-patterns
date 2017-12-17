public class Numbers {
    private int[] numbers;
    private int index;

    public Numbers(){
        numbers = new int[10];
        index = 0;
    }

    public void addElement(int num){
        numbers[index++] = num;
    }

    public NumbersIterator getIterator(){
        return new NumbersIterator(numbers);
    }
}
