/**
 * strbuffer
 */
public class strbuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("kunal");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" Nathani");
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        sb.setLength(23);
    }
}