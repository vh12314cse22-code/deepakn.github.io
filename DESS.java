import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = new String();
        System.out.println("Enter the Message:");
        msg = sc.next();
        int i, ptr;
        char a[] = new char[20];
        char b[] = new char[20];
        String enMsg ="";
        String plTxt ="";
        i = 0;
        for(ptr = 0; ptr<msg.length(); ptr = ptr + 2){
            a[i] = msg.charAt(ptr);
            i++;
        }
        i = 0;
        for(ptr = 1; ptr<msg.length(); ptr = ptr + 2){
            b[i] = msg.charAt(ptr);
            i++; 
        }
        i = 0;
        for(ptr = 0; ptr < msg.length()/2; ptr++){
            enMsg += a[i];
            i++;
        }
        i =0;
        for(ptr = 0; ptr < msg.length()/2; ptr++){
            enMsg += b[i];
            i++;
        }
        System.out.println("The Encrypted text:" + enMsg);
        i = 0;
        for(ptr = 0; ptr < msg.length()/2; ptr++){
            plTxt += a[i];
            plTxt += b[i];
            i++;
        }
        System.out.println("The Plain Text:" + plTxt);
    }
}