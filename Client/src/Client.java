import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		String tmp;
		try (Socket socket = new Socket("192.168.1.4", 12345)){
			InputStream input = socket.getInputStream();
			OutputStream output = socket.getOutputStream();
			
			PrintWriter writer = new PrintWriter(output, true);
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			String time = reader.readLine();
			System.out.println(time);
			String time1 = reader.readLine();
			System.out.println(time1);
			writer.println(sc.next());
			Outer : for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.println(reader.readLine());
					System.out.println(reader.readLine());
					tmp = reader.readLine();
					if(tmp.equals("close")) {
						break Outer;
					} else {
						System.out.println(tmp);
					}
					writer.println(sc.next());
				}						
			}
			System.out.println(reader.readLine());
			socket.close();
		} catch(UnknownHostException e) {
			System.out.println("Host can't find");
		} catch(IOException e) {
			System.out.println("IOException");
		}
	}
}
