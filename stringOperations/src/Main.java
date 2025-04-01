public class Main {
    public static void main(String[] args) {

        String text = "The weather is very nice today. ";

        // Strings are sequences of characters. You can access their elements just like you do with arrays.

        System.out.println(text);

        System.out.println("Number of elements: " + text.length());

        System.out.println("5th element.: " + text.charAt(4));

        System.out.println(text.concat("Hooray!")); // Performs concatenation operations.
        System.out.println("text");

        System.out.println(text.startsWith("A")); // Checks if it starts with the letter 'A'.

        System.out.println(text.endsWith(".")); // Checks if it ends with a "." (dot).

        char[] character = new char[5];
        text.getChars(0,5, character,0); // assign the characters in 'character' from index 0 to 4 to the character array.
        System.out.println(character);

        System.out.println(text.indexOf("he")); // Returns the index of the given character. It gives the position of the first occurrence it finds.
        System.out.println(text.lastIndexOf("e")); // This one searches starting from the end.

        // If you select a specific piece of code and click Code > Comment with Line Comment (Ctrl + /) or
        // Comment with Block Comment (Ctrl + Shift + /), it will comment out the entire selection.
        // Anything between `/* */` is considered a block comment.

        String newText = text.replace(" ", "-"); // Replaces spaces with '-'.
        System.out.println(newText);
        System.out.println(text.substring(2)); // Takes the string starting from index 2.
        System.out.println(text.substring(2, 5)); // Takes the substring from index 2 up to (but not including) index 5.

        for (String word : text.split(" ")) {
            System.out.println(word);
        }

        System.out.println(text.toLowerCase()); // Converts to lowercase.
        System.out.println(text.toUpperCase()); // Converts to uppercase.

        text = "    The weather is very nice today.   ";
        System.out.println(text.trim()); // Removes the leading and trailing spaces.

    }
}