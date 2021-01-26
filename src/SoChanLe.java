import java.util.Scanner;
public class SoChanLe {
    public static void main(String[] args) throws Exception {
        //2 Nhập vào 1 số bất kỳ và kiểu tra xem số là số chẵn hay số lẻ (Sử dụng toán tử điều kiện)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số:");
        double r = scanner.nextDouble();
        System.out.println(r%2 == 0 ? "Số đã cho là số chẵn.": "Số đã cho là số lẻ.");
    }
}
