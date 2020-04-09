import java.util.Scanner;

public class SoChinhPhuong {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 0;// biến lặp lại bài toán

		System.out.println("XAC DINH SO CHINH PHUONG");
		System.out.println();

		while (i < i + 1) {
			int number = 0;// biến số nhập vào
			do {
				if (number < 0) {
					System.out.println("Vui long nhap so duong");
				}
				System.out.print("Nhap so: ");
				number = scan.nextInt();
			} while (number < 0);

			int result = (int) Math.sqrt(number); // biến điều kiện xác định kết quả bài toán

			if (Math.pow(result, 2) == number) {
				System.out.println(number + " La so chinh phuong");
				System.out.println();
			} else {
				System.out.println(number + " Khong phai la so chinh phuong");
				System.out.println();
			}
		}
	}

}
