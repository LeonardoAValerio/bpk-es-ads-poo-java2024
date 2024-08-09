public class QSort {
    public static int[] crescent(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = i+1; j < arrayInt.length; j++) {
                if (arrayInt[i] > arrayInt[j]) {
                    int aux = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = aux;
                }
            }
        }
        return arrayInt;
    }
}
