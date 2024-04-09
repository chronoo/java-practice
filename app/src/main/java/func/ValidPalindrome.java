package func;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        var letters = s.replaceAll("[^A-Za-z0-9]", "");
        return new StringBuilder().append(letters).reverse().toString().equalsIgnoreCase(letters);
    }
}
