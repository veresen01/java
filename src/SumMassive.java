public class SumMassive {
    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < 5; j++){
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static int[] diff2massiv(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны");
        }
        else{
            int[] arr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++){
                int a = Math.abs(arr1[i] - arr2[i]);
                arr[i] = a;
            }
            return arr;
        }
    }

    public static double[] div2massiv(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны");
        }else{
            double[] arr = new double[arr1.length];
            for (int i = 0; i < arr1.length; i++){
                double a = arr1[i] / arr2[i];
                arr[i] = a;
            }
            return arr;
        }
    }
}