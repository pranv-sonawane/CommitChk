public class Scope {
    public static void main(String[] args) {
        int a = 30;
//        System.out.println(b); //if we try to access the b var outside the function of its origin it'll give error

        {
            int b =20; //is initialised inside the block
            a =20;  // a is already declared outside the block
            //anything declared outside the block can be accessed inside but anything that is decalred inside cannot be accessed outside
            System.out.println(a);
        }
//        System.out.println(b); //cannot be accessed outside the block
        System.out.println(a);
    }
    static void test(int b){
        System.out.println(b); // variable b can only be accessed in "test" method
        int c = 60;             // we created a variable named c and assigned and object to it
        System.out.println(c);    //c can only be accessed in test method this is the scope of variable c
    }
}
