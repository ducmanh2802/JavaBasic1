import java.util.Scanner;
public class TinhChuViDienTich {
    public static void main(String[] args) throws Exception {
        //1 Tính chu vi và diện tích của hình tròn với bán kính r nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn");
        double r = scanner.nextDouble();
        while (r<=0){
            System.out.println("Số đã cho ko phải là bán kính, hãy nhập lại");
        }
        System.out.println("Chu vi hình tròn: " + 2*Math.PI*r + "\nDiện tích hình tròn:" + Math.PI*Math.pow(r, 2));
    }
}
