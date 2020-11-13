import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myString = "Samsung exploding galaxies";
        System.out.println(myString.toUpperCase());
        System.out.print(myString.substring(5, 10));
        System.out.println();

        for (int i = 9; i < myString.length(); i++) {
            k
            System.out.print(myString.charAt(i));
        }
        System.out.println();
        if (Objects.equals(myString, "Samsung")) {
            System.out.println("Strings are the same");
        } else {
            System.out.println("Strings are not the same");
        }

        String text1 = "HELLO";
        String text2 = "Hello";
        System.out.println(true);
        System.out.println(text2.charAt(0));
        System.out.println((int) text2.charAt(0));
        System.out.println(text2.indexOf('e'));
        System.out.println(text2.lastIndexOf('l'));

        int n = Integer.parseInt("22");
        System.out.println(n + n);
    }
}

