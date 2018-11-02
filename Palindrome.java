public class Palindrome {
    public static boolean isPalindrome(String word) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        char[] temp = word.toLowerCase().toCharArray();
        for(int i=0; i< temp.length/2 ;i++){
           if(temp[i]!= temp[temp.length-1-i]) {
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled12"));
    }
}