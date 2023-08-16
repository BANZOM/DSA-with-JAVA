public class Max_Min_element_F2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -8, 7, 3, -2 };
        System.out.print("Array: ");
        Max_Min_element_F2 instance = new Max_Min_element_F2();
        instance.printArray(arr);
    }

    void printArray(int[] arr) {
        for (int i: arr)
            System.out.print(i + " ");
        System.out.println();
    }
    
}
