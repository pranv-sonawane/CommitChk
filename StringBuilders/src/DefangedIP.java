public class DefangedIP {
    public static void main(String[] args) {
        String ip = "1.1.1.1";
        System.out.println(defangIPaddr(ip));
    }
    public static String defangIPaddr(String address) {
        String str;
        str = address.replace(".", "[.]");
        return str;

    }
}
