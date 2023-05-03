package socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket {
    private int porta;
    private ServerSocket serverSocket;
    private Socket socket;
    private ObjectOutputStream saida;
    private ObjectInputStream entrada;

    public ServidorSocket(int porta) {
        this.porta = porta;
    }

    public void iniciarServidor() throws IOException {
        serverSocket = new ServerSocket(porta);
    }

    public void aceitarConexoes() throws IOException {
        socket = serverSocket.accept();
        saida = new ObjectOutputStream(socket.getOutputStream());
        entrada = new ObjectInputStream(socket.getInputStream());
    }

    public void enviarMensagem(Object objeto) throws IOException {
        saida.writeObject(objeto);
        saida.flush();
    }

    public Object receberMensagem() throws IOException, ClassNotFoundException {
        return entrada.readObject();
    }

    public void fecharConexao() throws IOException {
        entrada.close();
        saida.close();
        socket.close();
    }

    ObjectInputStream getInputStream() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    ObjectOutputStream getOutputStream() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
