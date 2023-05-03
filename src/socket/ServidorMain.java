package socket;

import controller.ControladorPrevisoes;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class ServidorMain {

    public static void main(String[] args) {
        int porta = Integer.parseInt(JOptionPane.showInputDialog("Digite a porta:", "8080"));

        ServidorSocket servidorSocket = new ServidorSocket(porta);

        ControladorPrevisoes controladorPrevisoes = new ControladorPrevisoes();
        // Inicializar outros controladores aqui

        try {
            servidorSocket.iniciarServidor();
            System.out.println("Servidor iniciado na porta " + porta);

            while (true) {
                servidorSocket.aceitarConexoes();
                System.out.println("Cliente conectado!");

                ObjectInputStream inputStream = servidorSocket.getInputStream();
                ObjectOutputStream outputStream = servidorSocket.getOutputStream();

                // Loop para tratar as requisições do cliente
                while (true) {
                    String comando = (String) inputStream.readObject();
                    System.out.println("Comando recebido: " + comando);

                    if ("listarPrevisoes".equals(comando)) {
                        outputStream.writeObject(controladorPrevisoes.listarPrevisoes());
                        outputStream.flush();
                    } else if ("sair".equals(comando)) {
                        break;
                    } else {
                        System.out.println("Comando desconhecido: " + comando);
                    }
                }

                servidorSocket.fecharConexao();
            }
        } catch (IOException e) {
            System.err.println("Erro ao iniciar o servidor: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Erro ao ler o objeto: " + e.getMessage());
        }
    }
}
