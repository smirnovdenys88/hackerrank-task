package challenges;

public class Palindrome  {

    public boolean chekWorld(String s){
        StringBuilder builder = new StringBuilder(s);
        builder.reverse();

        return builder.toString().equals(s);
    }
}
