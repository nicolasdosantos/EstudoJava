package Aula09.ModificadorFinal.dominio;

// final na classe - ninguem pode extends Carro. Diferente do final no atributo (que trava
// so o valor/referencia), aqui quem trava e a herança inteira, tipo uma trava de design pra
// dizer "essa classe nao foi pensada pra ser especializada". A propria String do Java e
// final por esse motivo
public final class Carro {
    private String nome;
    // final - depois de atribuido, o valor de velocidadeLimite nao pode mudar mais.
    // aqui ele fica "em branco" (blank final): declarei sem valor na linha de cima
    // e o Java obriga a atribuir dentro do bloco static antes de qualquer uso -
    // se eu tentasse mudar de novo depois, dava erro de compilacao
    public static final double velocidadeLimite; // = 250;
    // final numa referencia de objeto e diferente de final num primitivo - aqui eu
    // nao posso trocar o objeto que comprador aponta (nao da pra fazer comprador = new Comprador()
    // de novo), mas o objeto em si continua mutavel, da pra chamar setNome() nele
    // normalmente (ver CarroTeste01)
    public final Comprador comprador = new Comprador();

    static{
        velocidadeLimite = 250;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


}
