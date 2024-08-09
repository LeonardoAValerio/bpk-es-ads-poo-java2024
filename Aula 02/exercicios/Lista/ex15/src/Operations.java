public class Operations {

    public static int recursFatorial(int num) {
         if(num == 1) {
             return 1;
         }else {
             return num * recursFatorial(num-1);
         }
    }

    public static int iteraFatorial(int num) {
        int fat = 1;
        for (int i = num; i > 1; i--) {
            fat *= i;
        }
        return fat;
    }
}