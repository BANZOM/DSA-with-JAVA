public class F2_Max_Min_element {

    /**
     * Nested class 'Max_Min' to store the minimum and maximum values.
     */
    static class Max_Min {
        int min, max;

        Max_Min(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.print("Array: ");

        F2_Max_Min_element instance = new F2_Max_Min_element();
        instance.printArray(arr);

        Max_Min answer = instance.getMaxMin(arr);
        System.out.println("Max: " + answer.max);
        System.out.println("Min: " + answer.min);

    }

    void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    Max_Min getMaxMin(int[] arr) {
        if (arr.length == 0) {
            return new Max_Min(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Max_Min answer = new Max_Min(Integer.MAX_VALUE, Integer.MIN_VALUE);

        for (int i : arr) {
            answer.min = Math.min(i, answer.min);
            answer.max = Math.max(i, answer.max);
        }

        return answer;
    }

}