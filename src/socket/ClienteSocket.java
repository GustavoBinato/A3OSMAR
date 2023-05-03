
package socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClienteSocket {
    private String enderecoIP;
    private int porta;
    private Socket socket;
    private ObjectOutputStream saida;
    private ObjectInputStream entrada;

    public ClienteSocket(String enderecoIP, int porta) {
        this.enderecoIP = enderecoIP;
        this.porta = porta;
    }

    public void conectar() throws IOException {
        socket = new Socket(enderecoIP, porta);
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

    public ObjectInputStream getInputStream() {
        return entrada;
    }

    public ObjectOutputStream getOutputStream() {
        return saida;
    }
}
