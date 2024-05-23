package gr.aueb.cf.tasks.ch7;

/**
 * Takes a String and encrypts it's value by replacing every character
 * with the next character in the ascii table.
 * Then it can decrypt the encrypted message doing the opposite
 */
public class EncryptDecryptApp {
    public static void main(String[] args) {
        StringBuilder encryptedText = new StringBuilder();
        StringBuilder deryptedText = new StringBuilder();
        String text = "Nipson anomimata mi monan opsin";
        String encText = encrypt(text, encryptedText);
        String decrText = decrypt(text, deryptedText);


        System.out.printf("Original Message is: %s\nEncrypted message is: %s\n", text, encText);
        System.out.println();
        System.out.printf("Encrypted Message is: %s\nDecrypted message is: %s\n", encText,decrText );

    }

    /**
     *  Encrypts a String by replacing every character with it's next
     *  character in ascii table
     * @param text String to be encrypted
     * @param str StringBuilder to build the new encrypted String
     * @return a String with the encrypted message
     */
    private static String encrypt(String text, StringBuilder str){
        for(int i = 0; i< text.length(); i++){
            char charValue = text.charAt(i);
            str.append(++charValue);
        }
        return str.toString();

    }

    /**
     * Decrypts an encrypted String by replacing every character with it's previous
     * character in ascii table
     * @param encText The encrypted text
     * @param str StringBuilder to build the decrypted String
     * @return a String with the decrypted message
     */
    private static String decrypt(String encText, StringBuilder str ){
        for(int i = 0; i< encText.length(); i++){
            char charValue = encText.charAt(i);
            str.append(charValue--);
        }
        return str.toString();

    }

}
