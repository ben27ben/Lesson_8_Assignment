import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.regex.Pattern;

public class Main_Assignment {

    public static void main(String[] args) throws NoSuchMethodException {

        ///Exercise 1///
        StringBuilder strbuilder = new StringBuilder("H");
        strbuilder.append("e");
        strbuilder.append("l");
        strbuilder.append("l");
        strbuilder.append("o");
        System.out.println(strbuilder);

        //only print palindrome words: they stay the same after reverse//
        String[] array = {"hello", "world", "radar", "math", "kayak", "bank", "rotor"};
        for (int i = 0; i < array.length; i++) {
            StringBuilder sb = new StringBuilder(array[i]);
            if (array[i].equals(sb.reverse().toString())) {
                System.out.println(sb);
            }
        }
        ///Exercise 2///
        String input = String.format("%s = %d", "Ben", 29);
        System.out.println(input);
        System.out.printf(input);
        //String format can cause you to lose static type safety leading to an IllegalFormatException at runtime//

        ///Exercise 3///
        String[] words = {"hello", "world", "radar", "math", "kayak", "bank", "rotor"};
        for (int w = 0; w < words.length; w++) {
            if (words[w].matches(".*[a]+.*")) {
                System.out.println(words[w]);
            }
        }
        ///Exercise 4///
        //Generics allow us to customize a "generic" method or class to whatever//
        //type we are working with//

        ///Exercise 5///
        printAny("ben");
        printAny(10);
        printAny(true);

        ///Exercise 6///
        // calculate2 is using the same method twice abuses the DRY concept//
        // supercalculate has no use in the code,therefore no need of this method//

        ///Exercise 7///
        String dictionary = "dictionary";
        System.out.println(dictionary.indexOf("a"));
        dictionary = dictionary.replace("a", "x");
        System.out.println(dictionary);

        ///Exercise 8///
        Method[] classmethods = String.class.getDeclaredMethods();
        for(Method method : classmethods){
            if(Modifier.isPublic(method.getModifiers())){
                System.out.println(method);
            }

        }

        ///Exercise 9
        User newuser = new User("Ben");
        Method Method = User.class.getDeclaredMethod("getName");



        }

    public static <E> void printAny(E elements){
            System.out.println(elements);
    }
}
