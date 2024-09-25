
public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + " Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        int spaces = 0, vowels = 0, letters = 0;
        
        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // Check for spaces
            if (c == ' ') {
                spaces++;
            }

            // Check if it's a letter
            if (Character.isLetter(c)) {
                letters++;

                // Check for vowels
                c = Character.toLowerCase(c); // Make case-insensitive
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                }
            }
        }
        
        // Print results
        System.out.println("The text contained vowels: " + vowels + "\n"
                + "Consonants: " + (letters - vowels) + "\n"
                + "Spaces: " + spaces);
    }
}
