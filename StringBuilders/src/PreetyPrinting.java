public class PreetyPrinting {
    public static void main(String[] args) {
        float a = 23.1234f;     // the f in the end because it's the convention for float value
//        System.out.printf("Formatted number is %.2f",a);    // % is a placeholder and .2 means 2 digits after
        // the decimal and f is because its a float value

        float b = 1.388f;
//        System.out.printf("Formatted number  %.2f", b); //  for float and double precision
//        here we take printf instead of println
        // because the printf refers to formatted string and hence the %.2f we mentioned will only work in
        // printf

        // and as you can see the second printf statement rounds up the input!
        // 1.388 = 1.39

        // Below we used the Math lib which has PI variable in it.
        System.out.println(Math.PI);
//        System.out.printf("pie : %.3f", Math.PI);   // we formatted the PI and reduced it upto 3 decimal values
        // it rounded it as well

        System.out.printf("Hello my name is %s and i am %s", "Pranav", "Cool!");
    }
}
