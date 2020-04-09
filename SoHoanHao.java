import java.util.Scanner;

public class SoHoanHao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("XAC DINH SO HOAN HAO");
		System.out.println();

		int j = 0;// biến vòng lặp bài toán
		while (j < j + 1) {
			int number = 0;// biến số nhập vào

			do {
				if (number < 0) {
					System.out.println("Vui long nhap so duong");
				}
				System.out.print("Nhap so can xac dinh: ");
				number = scan.nextInt();
			} while (number < 0); // vòng lặp yêu cầu người dùng nhập số dương

			int i; // biến thực hiện bài toán
			int sumDivisor = 0; // biến điều kiện bài toán

			for (i = 1; i < number; i++) {
				if (number % i == 0) {
					sumDivisor += i;
				}
			}

			// xuất ra màn hình kết quả bài toán
			if (sumDivisor == number) {
				System.out.println(number + " La so hoan hao.");
				System.out.println();
			} else {
				System.out.println(number + " Khong phai la so hoan hao.");
				System.out.println();
			}
		}
	}

}
