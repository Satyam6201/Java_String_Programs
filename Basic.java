package strings;

public class Basic {

    //1.Reverse the String 

    public static void reverse(String s) {  // 2 pointer Approach
        // Convert string to character array for in-place operations
        char word[] = s.toCharArray();
        int first = 0;
        int end = s.length() - 1;

        while (first < end) {
            char temp = word[first];
            word[first] = word[end];
            word[end] = temp;
            
            first++;  // incresing the index
            end--;  // decrising the index
        }
        // Convert char array back to string
        String reversed = new String(word);
        System.out.println(reversed);
    }

    //2.reverse words in a sentence

    public static void reverseSentence(String s) {
        String word[] = s.split(" ");

        StringBuilder reverseSentence = new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            reverseSentence.append(word[i]).append(" "); // also used " " for append(" ")
        }
        System.out.println(reverseSentence.toString());
    }

    //3.palindrome

    public static void isPalindrome(String s) {
        boolean isPalindrome = true;
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
            else{
                isPalindrome = true;
            }
        }
        if (isPalindrome == true) {
            System.out.println("it is Palindrome");
        }
        else {
            System.out.println("it is not Palindrome");
        }
    }

    //4. Vowel Consonant Counter
    public static void VowelConsonantCounter(String s) {
        s = s.toLowerCase(); // change into lower case

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
            else {
                consonant++;
            }
        }
        System.out.println("Vowel = " + vowel);
        System.out.println("Consonant = " + consonant);

    }

    //5.Anagram 
    public static void anagram(String s, String p) {
        int letter[] = new int[26];

        if (s.length() != p.length()) {
            System.out.println("Not Anagram");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            letter[s.charAt(i) - 'a']++;
            letter[p.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (letter[i] != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("It is Anagram");
    }

    // 6. Count the Frequency
    public static void countFrequency(String s) {
        s = s.toLowerCase(); // change into lowercase 

        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char ch = (char)(i + 'a');
                System.out.println(ch + " = " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        // String s = "satyam";
        // reverse(s); // maytas

        // String reverseSentence = "Java is awesome";
        // reverseSentence(reverseSentence); //awesome is Java 

        // isPalindrome("madam");  // true

        // VowelConsonantCounter(s);// Vowel = 2  Consonant = 4

        // anagram(s, "tyaams"); //It is Anagram

        countFrequency("satyam");

    }
}
