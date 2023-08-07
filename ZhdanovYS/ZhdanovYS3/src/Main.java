import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество циклопов");
        int kol = sc.nextInt();
        int[] linz = new int[kol];
        int sum = 0;
        for (int i=0;i<kol;i++){
            System.out.println("Введите " + (i+1) + " элемент массива");
            linz[i]= sc.nextInt();
        }
        int i=kol-1;
        Arrays.sort(linz);
        while (i >= 0){
             try {
                if ((((linz[i])-(linz[i-1])) >= -2) && (((linz[i])-(linz[i-1])) <= 2)) {
                    sum = sum + 1;
                    i = i - 2;
                } else {
                    sum = sum + 1;
                    i = i - 1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                sum = sum + 1;
                i = i - 1;
            }
        }
        System.out.println(sum);
    }
}
