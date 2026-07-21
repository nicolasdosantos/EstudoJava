package Aula09.Herança.dominio;

// herança - "extends" faz Funcionario herdar tudo que Pessoa tem (nome, cpf, endereco, imprime())
// sem precisar reescrever nada. É a relação "é um": Funcionario É UMA Pessoa, só que com um
// atributo a mais (salario). Diferente de associação (Aula09/Associacao), onde uma classe só
// TEM uma referência pra outra - aqui a classe filha vira um "tipo" da classe pai
public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco static funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização funcionario");
    }

    // como Pessoa nao tem mais construtor vazio (so o de "nome"), Funcionario e
    // obrigado a
    // chamar algum construtor do pai antes de mais nada - e o que o super(nome) faz
    // aqui.
    // se essa chamada nao existisse, o Java tentaria chamar Pessoa() implicito e
    // daria erro
    // de compilacao, porque esse construtor nao existe mais
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro da class funcionario construtor");
    }

    // sobrescrita (override) - Funcionario reescreve imprime() com a mesma
    // assinatura de Pessoa,
    // mas aqui da pra reaproveitar o comportamento do pai com super.imprime() e so
    // completar com
    // o que falta (salario). Fica sem repetir os prints de nome/cpf/endereco que ja
    // existem la em cima
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    // esse this.nome so compila porque nome agora e protected em Pessoa (era
    // private antes) -
    // protected libera acesso direto pras subclasses do mesmo jeito que um atributo
    // publico,
    // so que continua escondido pra quem esta fora da heranca
    public void relatorio() {
        System.out.println("Eu " + this.nome + "ganhei o salario de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
