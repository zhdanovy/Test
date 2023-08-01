import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int x = sc.nextInt();
        int sum = 0;
        if (x>=3) {
            sum = sum + 3 + 2;
        } else if (x>=2) {
            sum = sum + 2;
        }
        for (int i=4;i<=x;i++) {
            for (int j=2;j<i;j++) {
                if (i%j==0) {
                    break;
                }
                if (j==i-1) {
                    sum = sum + i;
                }
            }
        }
        System.out.println("Сумма всех простых чисел не превышающих " + x + " равна " + sum);
    }
}
