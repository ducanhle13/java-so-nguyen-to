import java.util.Scanner;

public class snt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " kp so nguyen to");
        }

        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " la so nguyen to");
            }
            else {
                System.out.println(number + " kp so nguyen to");
            }
        }
    }
}