import java.util.Scanner;

public class kabisat01{
    public static void main(String[] args) {
        Scanner user = new Scanner (System.in);

        int tahun;

        System.out.println("Masukkan Tahun : ");
        tahun = user.nextInt();

        if (tahun % 4 == 0) {
            System.out.println("Tahun "+tahun+" adalah tahun kabisat ");

            if (tahun % 100 == 0) {


            } else if (tahun % 400 == 0) {

            }
        } else {
            System.out.println("Tahun " +tahun+" Bukan tahun kabisat");


        }
    }
}
