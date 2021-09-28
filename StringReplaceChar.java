public class Demo {
    public static void main(String[] args) {
       String str = "Halo";
       System.out.println("String: "+str);
       
       int pos = 1;
       char rep = 'e';
       String res = str.substring(0, pos) + rep + str.substring(pos + 1);
       System.out.println("String after replacing a character: "+res);
    }
}
