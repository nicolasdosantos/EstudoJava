package Aula09.Enumeracao.teste;

import Aula09.Enumeracao.dominio.Cliente;
import Aula09.Enumeracao.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        // acesso ao valor do enum e sempre pelo nome da classe (TipoCliente.pessoa_fisica),
        // igual constante static - nao instancio TipoCliente com "new"
        Cliente cliente = new Cliente("Nicolas", TipoCliente.pessoa_fisica);
    }
}
