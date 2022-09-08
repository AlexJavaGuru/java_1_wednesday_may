package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_5_middle;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {
    public static void main(String[] args) {
        String testString = "T\nest\n";
        System.out.println(testString.lastIndexOf("\n"));
        System.out.println(testString.indexOf("n"));
        System.out.println(testString.length());

        String s = "//[;],[=]\n12";
        int startIndex = s.indexOf("//");
        int endIndex = s.indexOf("\n");
        String delimiters = s.substring(startIndex, endIndex);
        delimiters.replace("[", "").replace("]", "").replace("/", "");
        System.out.println(delimiters);

        Pattern pattern = Pattern.compile("\\[(.*?)\\]"); //esli ya praviljno sdelal to etot regex iwet skobki i emu vsyo ravno chto vnutri
        Matcher matcher = pattern.matcher(delimiters); // tak i ne smog sdelat' s matcher ((
        System.out.println(matcher.toString());

        String[] array = delimiters.split("");

        System.out.println(delimiters.length() + " dlina stroki");
        System.out.println(Arrays.toString(array));
    }
}
