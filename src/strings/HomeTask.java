package strings;

//массив строк вывести в алфавитном порядке, int compare to
//метод intern

class HomeTask {
    static String alphabet[] = {"aaa", "aba", "abc", "aab", "bac"};

    public static void main(String[] args) {
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = i + 1; j < alphabet.length; j++) {
                if (alphabet[j].compareTo(alphabet[i]) < 0) {
                    String k = alphabet[i];
                    alphabet[i] = alphabet[j];
                    alphabet[j] = k;
                }
            }
            System.out.println(alphabet[i]);
        }
    }
}
