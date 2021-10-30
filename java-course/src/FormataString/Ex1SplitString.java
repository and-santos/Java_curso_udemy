package FormataString;

public class Ex1SplitString {
    public static void main(String[] args) {

        String s = "potato apple lemon orange";
        String[] vec = s.split(" ");

        System.out.println(vec[0]);
        System.out.println(vec[1]);
        System.out.println(vec[2]);
        System.out.println(vec[3]);
    }
}
