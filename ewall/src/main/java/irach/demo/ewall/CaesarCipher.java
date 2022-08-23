package irach.demo.ewall;

import java.util.Scanner;

public class CaesarCipher {
    public static String encode(String message, int offset) {

        message = message.toLowerCase(); // lazy
        offset = offset % 26; // not really necessary

        StringBuilder answer = new StringBuilder();
        for (char character : message.toCharArray()) {
            // only translate letters
            if ((int)character >= 'a' && (int)character < 'z' + 1) {
                int newPosition = (character - 'a' + offset) % 26;
                char newCharacter = (char) ('a' + newPosition);
                answer.append(newCharacter);
            } else {
                answer.append(character);
            }
        }
        return answer.toString();
    }

    public static String decode(String message, int offset) {
        return encode(message, -offset);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = new String();
        int offset = 0;

        System.out.print("Message to encode/decode: ");
        message = sc.next();

        System.out.println("\n\nEnter offset/shift value: ");
        offset = sc.nextInt();

        System.out.println("\nEncoded message: " + decode(message, offset));
    }
}
