package string.ceasarcipher;
public class CeasarCipher {
    void encrypt(String a, int key){
        char [] A= a.toCharArray();
        int len=A.length;
        for (int i=0;i<len;i++){
            int as=(int)A[i];
            if (as>=65 && as<=90) System.out.print((char)(((as+key-65)%26)+65));
            if (as>=97 && as<=122)System.out.print((char)(((as+key-97)%26)+97));
        }
    }
}
