import java.util.Arrays;

public class MissingNo {
        public static void main(String[] args) {
            int[] arr = {3,5,6,0,2,1};
            Sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println(Sort(arr));
        }
        public static int Sort(int[] arr){
            int i = 0;
            while(i <= arr.length-1){
                int correct = arr[i];
                if ( arr[i] < arr.length && arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else{
                    i++;
                }
            }
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index){
                    return index;
                }
            }
            return arr.length;
        }
        static void swap(int[] arr, int start, int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
}
