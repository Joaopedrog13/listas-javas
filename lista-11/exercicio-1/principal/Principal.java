package principal;

import animal.*;

public class Principal {

  public static void main(String[] args) {
    Animal[] zoologico = new Animal[10];

    zoologico[0] = new Elefante();
    zoologico[1] = new Gorila();
    zoologico[2] = new Leao();
    zoologico[3] = new Urso();
    zoologico[4] = new Zebra();
    zoologico[5] = new Leao();
    zoologico[6] = new Elefante();
    zoologico[7] = new Zebra();
    zoologico[8] = new Gorila();
    zoologico[9] = new Urso();

    // Polimorfismo: a variável é do tipo Animal, mas cada objeto executa a sua versão de emitirSom().
    for (int i = 0; i < zoologico.length; i++) {
      System.out.print(i + " - " + zoologico[i] + " " + zoologico[i].nome + ": ");
      zoologico[i].emitirSom();
    }
  }
}
