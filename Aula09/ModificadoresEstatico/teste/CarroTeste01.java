package Aula09.ModificadoresEstatico.teste;

import Aula09.ModificadoresEstatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 250.00);
        Carro c2 = new Carro("Mercedes", 350.00);
        Carro c3 = new Carro("Audi", 150.00);

        // como veloLimite é static, esse set aqui muda o valor pra c1, c2 E c3 ao mesmo tempo -
        // é só rodar e ver os 3 imprimindo "Velocidade limite: 200.0", mesmo tendo setado só uma vez
        Carro.setVeloLimite(200);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
