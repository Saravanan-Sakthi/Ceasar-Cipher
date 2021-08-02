package string.ceasarcipher;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the message : ");
        String a= scan.next();
        System.out.print("Enter the key : ");
        int key= scan.nextInt();
        new CeasarCipher().encrypt(a,key);
    }
}
