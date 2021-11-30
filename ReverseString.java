class ReverseString {
    
    String reverse(String inputString) {
        String newString = "";
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(inputString.length() - i - 1);
            newString += ch;
        }
        return newString;
    }
}
