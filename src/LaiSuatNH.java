import java.util.Scanner;
public class LaiSuatNH {
    public static void main(String[] args) throws Exception {
	//3. Lãi suất ngân hàng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nợ:");
        double tienLai = scanner.nextDouble();
        System.out.println("Nhập vào lãi suất năm theo phần trăm(VD: 12% -> 0.12):");
        double laiSuat = scanner.nextDouble();
        System.out.println("Tiền lãi hàng tháng: " + tienLai*laiSuat/12 +"\nTiền phải trả hàng tháng" +(tienLai*laiSuat/12 + tienLai/12));
        scanner.close();
    }
}
