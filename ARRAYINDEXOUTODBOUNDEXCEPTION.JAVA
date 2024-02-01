public class Main {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            int index = 3; 
            int value = array[index];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }
    }
}
