import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму заказа");
        int sumz = sc.nextInt();
        System.out.println("Введите внесенную сумму клиентом");
        int sumk = sc.nextInt();
        int[] masprimer = {5000,2000,1000,500,200,100,50,10,5,2,1};
        int sdacha = sumk - sumz;
        int index = 0;
        System.out.println("Сдача:");
        while (sdacha > 0) {
            if (sdacha/masprimer[index] > 0) {
                System.out.println(masprimer[index] + " руб: " + sdacha/masprimer[index] + " шт.");
                sdacha = sdacha % masprimer[index];
                index = index + 1;
            } else if (sdacha/masprimer[index] == 0) {
                sdacha = sdacha % masprimer[index];
                index = index + 1;
            }
        }
        }
    }