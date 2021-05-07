public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // byte, short, int, long
        short myShortMin = Short.MIN_VALUE;
        short myShortMax = Short.MAX_VALUE;

        int myIntMin = Integer.MIN_VALUE;
        int myIntMax = Integer.MAX_VALUE;

        myIntMin +=1;
        myIntMin++;
        myIntMin += 2;

        long myLongMax = Long.MAX_VALUE;
        long myLongMin = Long.MIN_VALUE;

        System.out.println(myLongMin);
        System.out.println(myLongMax);

    }
}