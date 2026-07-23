package Aula09.ModificadorFinal.teste;

import Aula09.ModificadorFinal.dominio.Carro;
import Aula09.ModificadorFinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();

        // velocidadeLimite e static, entao acesso pelo nome da classe (Carro.velocidadeLimite),
        // nao por objeto - igual ja tinha visto em ModificadoresEstatico
        System.out.println(Carro.velocidadeLimite);
        System.out.println(carro.comprador);
        // isso aqui prova que final so trava a referencia, nao o objeto - carro.comprador
        // continua sendo o mesmo Comprador desde a criacao do Carro, mas o nome dele
        // muda normalmente porque setNome() so mexe no estado interno do objeto
        carro.comprador.setNome("Teste");
        System.out.println(carro.comprador);
    }
}