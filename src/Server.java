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

        }
    }
}

//создать сервер, который получает имя города и по нему пишет какая температура сейчас (подсказка: лучше
//использовать HashMap для хранения городом)