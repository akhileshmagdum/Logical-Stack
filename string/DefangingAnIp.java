package string;

/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 */
public class DefangingAnIp {

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
