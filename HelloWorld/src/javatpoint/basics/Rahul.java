package javatpoint.basics;

public class Rahul {
    public void capitalize(){
        String test = "rahul verma sachin";

        // this will split the string based on spaces
        String[] arr = test.split(" ");

        String finalAns = "";
        for (String s: arr){
            finalAns += toUpperCase(s) + " ";
        }

        System.out.println(finalAns.trim());
    }

    public static String toUpperCase(String word){
        // this will basically take rahul
        // Character.toUpperCase(word.charAt(0)) will give "R"
        // word.substring(1) will give "ahul".
        // NOTE: google about what the function does.
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}
