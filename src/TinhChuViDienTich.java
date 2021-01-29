import java.util.Scanner;
public class TinhChuViDienTich {
    public static void main(String[] args) throws Exception {
        //1 Tính chu vi và diện tích của hình tròn với bán kính r nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn");
        double banKinh = scanner.nextDouble();
        while (banKinh<=0){
            System.out.println("Số đã cho ko phải là bán kính, hãy nhập lại");
        }
        System.out.println("Chu vi hình tròn: " + 2*Math.PI*banKinh + "\nDiện tích hình tròn:" + Math.PI*Math.pow(banKinh, 2));
    }
}
