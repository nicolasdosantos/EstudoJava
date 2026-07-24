package Aula09.Enumeracao.teste;

import Aula09.Enumeracao.dominio.Cliente;
import Aula09.Enumeracao.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        // acesso ao valor do enum e sempre pelo nome da classe (TipoCliente.pessoa_fisica),
        // igual constante static - nao instancio TipoCliente com "new"
        // TipoPagamento e enum aninhado dentro de Cliente, entao o acesso e
        // Cliente.TipoPagamento.debito - precisa do nome da classe de fora tambem,
        // nao só do enum
        Cliente cliente = new Cliente("Nicolas", TipoCliente.pessoa_fisica, Cliente.TipoPagamento.debito);

        System.out.println(cliente);
    }
}
