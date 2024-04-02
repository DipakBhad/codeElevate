import java.util.*;
class RemoveChar
{
    public static void main(String[] args) {
        String s = "@Ar%pi+ta,B^ai!tul#e?>";
        remove(s);
    }
    static void remove(String s) {
        String new1 = "";
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch))
                new1 += ch;
        }
        System.out.println(new1);
    }
 
    
    
}