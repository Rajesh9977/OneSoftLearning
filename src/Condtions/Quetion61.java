package Condtions;

public class Quetion61 {
    public static void main(String[] args) {
        String word = "muttu";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int i = 0;

        while (i < vowels.length) {
            // Use String.valueOf to convert char to String
            if (word.toLowerCase().contains(String.valueOf(vowels[i]))) {
                System.out.println("Vowel");
            }
            i++;
        }
    }
}
