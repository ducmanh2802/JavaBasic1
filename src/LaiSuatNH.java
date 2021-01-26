import java.util.Scanner;
public class LaiSuatNH {
    public static void main(String[] args) throws Exception {
        //1 Tính chu vi và diện tích của hình tròn với bán kính r nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nợ:");
        double t = scanner.nextDouble();
        System.out.println("Nhập vào lãi suất năm theo phần trăm(VD: 12% -> 0.12):");
        double l = scanner.nextDouble();
        System.out.println("Tiền lãi hàng tháng: " + t*l/12 +"\nTiền phải trả hàng tháng" +(t*l/12 + t/12));
    }
}
