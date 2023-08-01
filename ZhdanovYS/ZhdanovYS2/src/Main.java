import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму заказа");
        int sumz = sc.nextInt();
        System.out.println("Введите внесенную сумму клиентом");
        int sumk = sc.nextInt();
        int[] masprimer = {1,2,5,10,50,100,200,500,1000,2000,5000};
        int[] mas = {0,0,0,0,0,0,0,0,0,0,0};
        int sdacha = sumk - sumz;
        while (sdacha>0){
            if (sdacha >= masprimer[10]) {
                sdacha -= masprimer[10];
                mas[10]++;
            } else if (sdacha >= masprimer[9]) {
                sdacha -= masprimer[9];
                mas[9]++;
            } else if (sdacha >= masprimer[8]) {
                sdacha -= masprimer[8];
                mas[8]++;
            } else if (sdacha >= masprimer[7]) {
                sdacha -= masprimer[7];
                mas[7]++;
            } else if (sdacha >= masprimer[6]) {
                sdacha -= masprimer[6];
                mas[6]++;
            } else if (sdacha >= masprimer[5]) {
                sdacha -= masprimer[5];
                mas[5]++;
            } else if (sdacha >= masprimer[4]) {
                sdacha -= masprimer[4];
                mas[4]++;
            } else if (sdacha >= masprimer[3]) {
                sdacha -= masprimer[3];
                mas[3]++;
            } else if (sdacha >= masprimer[2]) {
                sdacha -= masprimer[2];
                mas[2]++;
            } else if (sdacha >= masprimer[1]) {
                sdacha -= masprimer[1];
                mas[1]++;
            } else if (sdacha >= masprimer[0]) {
                sdacha -= masprimer[0];
                mas[0]++;
            }
        }
        System.out.println("Сдача:");
        for (int i = mas.length-1; i>0; i--) {
            if (mas[i]>0) {
                System.out.println(masprimer[i] + " руб: " + mas[i] + " шт.");
            }
        }
    }
}