import java.util.Scanner;

public class SoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("XAC DINH SO NGUYEN TO");
		System.out.println();
		
		int j = 0;//biến vòng lặp bài toán
		
		while (j < j + 1) {
			int number = 0;//khai báo biến nhập vào

			do {
				if (number < 0) {
					System.out.println("Vui long nhap so duong");
				}
				System.out.print("Nhap vao so can xac dinh: ");
				number = scan.nextInt();
			} while (number < 0);//yêu cầu người dùng nhập số dương

			boolean result = true;//biến kết quả bài toán
			
			//thực hiện bài toán
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					result = false;
					break;
				} else
					result = true;
			}
			
			//xuất ra màn hình kết quả bài toán
			if (result == true) {
				System.out.println(number + " La so nguyen to.");
				System.out.println();
			} else {
				System.out.println(number + " Khong phai la so nguyen to");
				System.out.println();
			}

		}
	}

}
