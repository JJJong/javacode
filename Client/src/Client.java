import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
	private static BufferedReader reader;

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		try (Socket socket = new Socket("192.168.1.4", 12345)) {
			InputStream input = socket.getInputStream();
			OutputStream output = socket.getOutputStream();

			PrintWriter writer = new PrintWriter(output, true);
			reader = new BufferedReader(new InputStreamReader(input));

			System.out.println(reader.readLine());
			System.out.println(reader.readLine());
			writer.println(sc.next());

			for (int i = 0; i < 10; i++) {
				System.out.println(reader.readLine());
				for (int j = 0; j < 2; j++) {
					System.out.println(reader.readLine());
					if (j == 1) { // 클라이언트
						writer.println(sc.next());
					}
					System.out.println(reader.readLine());
				}
			}
		} catch (UnknownHostException e) {
			System.out.println("Host can't find");
		} catch (IOException e) {
			System.out.println("서버가 게임을 종료하였습니다.");
		}
	}
}
