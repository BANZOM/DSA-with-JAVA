public class F14_Sum_of_K_window {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int k = 3;

        printSumOfK(arr,k);
    }

    private static void printSumOfK(int[] arr, int k) {
        int sum = 0;
        for(int i=0; i<k; i++) {
            sum += arr[i];
        }
        System.out.print(sum + " ");
        
        for(int i=k; i<arr.length; i++) {
            sum += arr[i] - arr[i-k];
            System.out.print(sum + " ");
        }

        System.out.println();
    }
}
