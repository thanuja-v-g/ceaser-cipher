import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int shift;
        String text,a;
        
        // Prompt the user for the shift value
        System.out.println("Enter value for shift:");
        shift = s.nextInt();
        s.nextLine(); // Consume the newline character left by nextInt()
        
        // Prompt the user for the text to encrypt
        System.out.println("Enter text:");
        text = s.nextLine();
        
        // Encrypt the text and print the result
        a=encrypt(text, shift);
        System.out.println("the encrypted message from the encrypted value is:");
        System.out.println("Cipher: " + encrypt(text, shift));
        System.out.println("the decrypted message from the encrypted value is:");
        System.out.println("message: " + dencrypt(a, shift));
        
    }

    public static String encrypt(String message, int shift) {
        StringBuilder encryptedMessage = new StringBuilder();
        char ch;
        for (int i = 0; i < message.length(); i++) {
             ch = message.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                // Shift uppercase letters
                ch = (char)(((ch - 'A' + shift) % 26) + 'A');
            } else if (Character.isLowerCase(ch)) {
                // Shift lowercase letters
                ch =  (char)(((ch - 'a' + shift) % 26) + 'a');
            }
            // Append the shifted character to the result
            encryptedMessage.append(ch);
        }
        
        // Return the encrypted message as a String
        return encryptedMessage.toString();
    }
    public static String dencrypt(String cipher, int shift) {
        StringBuilder dencryptedMessage = new StringBuilder();
        char ch;
        for (int i = 0; i < cipher.length(); i++) {
             ch = cipher.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                // Shift uppercase letters
                ch = (char)(((ch +'A' - shift) % 26) + 'A');
            } else if (Character.isLowerCase(ch)) {
                // Shift lowercase letters
                ch =  (char)(((ch + 'a' - shift) % 26) + 'a');
            }
            // Append the shifted character to the result
            dencryptedMessage.append(ch);
        }
        
        // Return the encrypted message as a String
        return dencryptedMessage.toString();
    }
    
    
}
