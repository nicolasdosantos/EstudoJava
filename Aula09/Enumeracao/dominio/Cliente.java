package Aula09.Enumeracao.dominio;

public class Cliente {
    // enum nao precisa ficar num arquivo proprio - da pra declarar dentro da classe
    // que usa ele, quando o tipo so faz sentido no contexto daquela classe (aqui,
    // forma de pagamento e algo especifico de Cliente). Pra usar de fora e
    // Cliente.TipoPagamento.debito, com o nome da classe de fora na frente
    public enum TipoPagamento {
        debito, credito
    }

    private String nome;
    // o tipo do atributo aqui e o proprio enum, nao String - assim so da pra
    // guardar
    // um dos valores que TipoCliente define, o resto do codigo nem precisa validar
    // isso
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        // "+ tipoCliente" chama o toString() padrao do enum, que devolve o nome da
        // constante (ex: "pessoa_fisica"). Ja "+ tipoCliente.valor" pega direto o
        // int que foi guardado no construtor do enum - os dois vem da mesma
        // constante, só que um e o nome e o outro e o codigo numerico dela
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.valor +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
