package string.ceasarcipher;
public class CeasarCipher {
    void encrypt(String input, int key){
        char [] message = input.toCharArray();
        int len= message.length;
        for (int iterator = 0; iterator <len; iterator++){
            int ascii =(int) message[iterator];
            if (ascii >=65 && ascii <=90) System.out.print((char)(((ascii +key-65)%26)+65));
            if (ascii >=97 && ascii <=122)System.out.print((char)(((ascii +key-97)%26)+97));
        }
    }
}
