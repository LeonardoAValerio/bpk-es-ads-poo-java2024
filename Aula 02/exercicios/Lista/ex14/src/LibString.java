public class LibString {
    private static char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static int contVowel(String str) {
        int cont = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    cont++;
                    break;
                }
            }
        }
        return cont;
    }
}
