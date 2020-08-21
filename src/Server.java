import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Москва", 50);
        ServerSocket serverSocket = new ServerSocket(8000);

        while (true) {
        Socket socket = serverSocket.accept();//создание сервера и сокетов

        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);//создание выхода

        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//создание входа

        String string = bufferedReader.readLine();

        System.out.println(hashMap.get(string));

        bufferedWriter.write("50");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        }
    }
}

//создать сервер, который получает имя города и по нему пишет какая температура сейчас (подсказка: лучше
//использовать HashMap для хранения городом)