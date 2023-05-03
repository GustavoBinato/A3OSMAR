package socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClienteMain {

    public static void main(String[] args) {
        String enderecoIP = JOptionPane.showInputDialog("Digite o endereço IP:");
        int porta = Integer.parseInt(JOptionPane.showInputDialog("Digite a porta:"));

        ClienteSocket clienteSocket = new ClienteSocket(enderecoIP, porta);

        try {
            clienteSocket.conectar();
            System.out.println("Conectado ao servidor!");

            ObjectOutputStream outputStream = clienteSocket.getOutputStream();

            ObjectInputStream inputStream = clienteSocket.getInputStream();

            Scanner scanner = new Scanner(System.in);

            // Loop para enviar comandos para o servidor
            while (true) {
                System.out.println("Digite um comando (listarPrevisoes, sair):");
                String comando = scanner.nextLine();

                outputStream.writeObject(comando);
                outputStream.flush();

                if ("listarPrevisoes".equals(comando)) {
                    System.out.println(inputStream.readObject());
                } else if ("sair".equals(comando)) {
                    break;
                } else {
                    System.out.println("Comando desconhecido: " + comando);
                }
            }

            clienteSocket.fecharConexao();
        } catch (IOException e) {
            System.err.println("Erro ao conectar ao servidor: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Erro ao ler o objeto: " + e.getMessage());
        }
    }
}
