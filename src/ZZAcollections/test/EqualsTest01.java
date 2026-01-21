package ZZAcollections.test;

import ZZAcollections.domain.Smartphone;

import java.sql.SQLOutput;

public class EqualsTest01 {
    static void main(String[] args) {
        String name = "William Suane";
//      String name2 = new String("William Suane"); -> Nesse caso resulta em false pois se cria um outro objeto na memória e não consta a mesma referência da string.
        String name2 = "William Suane";
        System.out.println(name == name2);
        System.out.println(name.equals(name2)); // A linha 6 funcionaria nesse caso.

        Smartphone s1 = new Smartphone("A1B2C3", "Pixel");
        Smartphone s2 = new Smartphone("A1B2C3", "Pixel");
//        s2 = s1; -> Mudaria para true pois a referência se tornaria a mesma
        System.out.println("Nome iguais mas a referência na memória são diferentes:");
        System.out.println("Equals: " + s1.equals(s2)); // Equals modificado na classe Smartphone pelo Override
    }
}
