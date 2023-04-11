import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String surname = in.next();
        String age = in.next();
        String country = in.next();
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}