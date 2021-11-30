class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        StringBuilder toClean = new StringBuilder(identifier);
        char c = ' ';
        for (int i = 0; i < toClean.toString().length(); i++) {
            c = toClean.toString().charAt(i);
            //Task 1 (replace spaces with underscores)
            if (c == ' ') {
                result.append('_');
            }
            //Task 2 (replace control characters with the Upper Case String "CTRL")
            else if (Character.isISOControl(c)) {
                result.append("CTRL");
            }
            //Task 3 (replace Kebab-Case with Camel Case
            else if (c == '-') {
                //Checks if there is a dash. If there is a dash, the next character is scanned and added in UpperCase
                c = toClean.toString().charAt(i + 1);
                result.append(Character.toUpperCase(c));
                //Moves to character after Dash
                i++;
            }
            //Task 4 (omit greek letters)
            else if (c >= 'α' && c <= 'ω') {
                continue;
            }
            //Everything else
            else if (Character.isLetter(c)) {
                result.append(c);
            }
        }
        //Return new string with correct formatting
        return result.toString();
    }
}
