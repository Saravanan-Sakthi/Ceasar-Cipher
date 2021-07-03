package string.ceasarcipher;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a= s.next();
        int key= s.nextInt();
        new CeasarCipher().encrypt(a,key);
    }
}
