public class NumbersIterator implements Iterator {
    private int[] numbers;
    private int index;

    public NumbersIterator(int[] numbers){
        this.numbers = numbers;
        this.index = 0;
    }

    @Override
    public Object next() {
        return numbers[index++];
    }

    @Override
    public boolean hasNext() {
        if(index < numbers.length && numbers[index] != 0 ){
            return true;
        }
        return false;
    }
}
