public class Program_2 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        for (int i = 3; i < arr.length; i++){
            for (int j = 1; j < i; j++){
                if(arr[j] != 0 && arr[i] % arr[j] == 0){
                    arr[i] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                System.out.printf("%d\n", arr[i]);
            }
        }
    }
}
