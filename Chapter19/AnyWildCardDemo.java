public class AnyWildCardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        
        print(intStack);
    }
    public static <E> void print(GenericStack<E> stack) {
        GenericStack<E> temp = new GenericStack<>();

        while (stack.getSize() > 0) {
            E value = stack.pop();
            System.out.print(value + " ");
            temp.push(value);
        }

        while (temp.getSize() > 0) {
            stack.push(temp.pop());
        }
    }
}
    
