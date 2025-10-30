public class Main {
    public static void main(String[] args) {

        int[] arr = {64,34,25,12,22,11,90};
        System.out.println("Sıralama öncesi:");
        for(int num :arr) System.out.println(num + " ");

        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j =i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("Sıralama sonrası:");
        for(int num :arr) System.out.println(num + " ");
    }
}