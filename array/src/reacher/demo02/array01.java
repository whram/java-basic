package reacher.demo02;

public class array01 {

    public static void main(String[] args) {
        int[] arrayA = new int[] {1,2,3,4,5};
        printArray(arrayA);
        System.out.println("----------");
        int[] result = calculate(arrayA);
        for (int i = 0; i < result.length; i++) {
            System.out.println("result: "+result[i]);
        }
    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] calculate(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;
        int[] result = {sum, avg};
        return result;
    }

}
