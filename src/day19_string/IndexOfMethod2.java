package day19_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        String s = "java";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));

        String s2 = "abcbcb";
        System.out.println(s2.indexOf('b'));
        System.out.println(s2.lastIndexOf('b'));

        System.out.println(s2.indexOf("cb"));
        System.out.println(s2.indexOf("cbd"));
        System.out.println(s2.indexOf('z'));




    }
}
