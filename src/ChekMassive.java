public class ChekMassive {
    public static int chekStr2d(String[][] arr){
        int err = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < 5; j++){
                if (arr[i][j] == null || arr[i][j].isEmpty()){
                    err = -1;
                }
            }
        }
        return err;
    }

    public static int chekLength2Massive(String[][] arr) {
        int err = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length < 5){
                err = -2;
                break;
            }
        }
        return err;
    }
}