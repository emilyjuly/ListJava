package list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: ");
        if (notas.contains(5d) == false) {
            System.out.println("Essa nota não está na lista");
        } else {
            System.out.println("Essa nota está na lista");
        }

        //Padrão do método list
        System.out.println("Exiba todas as notas na ordem em que foram informadas");
        for (Double nota: notas) System.out.println(nota);

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        System.out.print("\nExiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média das notas: " + (soma / notas.size()));

        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: ");
        if (notas.isEmpty() == true) {
            System.out.println("A lista está vazia");
        } else {
            System.out.println("A lista não está vazia");
        }
    }
}
