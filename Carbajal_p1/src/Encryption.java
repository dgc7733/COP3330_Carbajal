import java.util.Scanner;
public class Encryption {
    public static String encrypt(String num) {
        int arr[] = new int[4];
        int k = 0;
        while (k < 4) {
            char ch = num.charAt(k);
            arr[k] = Character.getNumericValue(ch);
            k++;
        }
        int j = 0;
        while (j < 4) {
            int temp = arr[j];
            temp += 7;
            temp = temp % 10;
            arr[j] = temp;
            j++;
        }
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
        int newNumber = 0;
        for (int i = 0; i < 4; i++)
            newNumber = newNumber * 10 + arr[i];
        String output = Integer.toString(newNumber);
        if (arr[0] == 0)
            output = "0" + output;
        return output;
    }

       public static String decrypt(String num) {
           int arr[] = new int[4];
           for (int i = 0; i < 4; i++) {
               char ch = num.charAt(i);
               arr[i] = Character.getNumericValue(ch);
           }
           int temp = arr[0];
           arr[0] = arr[2];
           arr[2] = temp;
           temp = arr[1];
           arr[1] = arr[3];
           arr[3] = temp;
           for (int i = 0; i < 4; i++) {
               int digit = arr[i];
               switch (digit) {
                   case 0:
                       arr[i] = 3;
                       break;
                   case 1:
                       arr[i] = 4;
                       break;
                   case 2:
                       arr[i] = 5;
                       break;
                   case 3:
                       arr[i] = 6;
                       break;
                   case 4:
                       arr[i] = 7;
                       break;
                   case 5:
                       arr[i] = 8;
                       break;
                   case 6:
                       arr[i] = 9;
                       break;
                   case 7:
                       arr[i] = 0;
                       break;
                   case 8:
                       arr[i] = 1;
                       break;
                   case 9:
                       arr[i] = 2;
                       break;
               }
           }

           int newNum = 0;
           int l = 0;
           while (l < 4) {
               newNum = newNum * 10 + arr[l];
               l++;
           }

           String Numstr = Integer.toString(newNum);
           if (arr[0] == 0) {
               Numstr = "0" + Numstr;
           }
           return Numstr;

       }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 digit integer:");
        String num = sc.nextLine();
        String encryptedNumber = encrypt(num);
        System.out.printf("Encrypted '%s' to '%s'%n", num, encryptedNumber);
        System.out.printf("Decrypted '%s' to '%s'", encryptedNumber, decrypt(encryptedNumber));

    }
}
