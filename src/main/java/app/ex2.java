package app;

import java.util.*;
import java.util.stream.Collectors;

public class ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Integer> vendedores = new ArrayList<>();
        List<Double> vendas = new ArrayList<>();

        System.out.print("Quantos vendedores irao registrar as vendas? ");
        int n = input.nextInt();
        //nao consegui tirar valorProd

        double valorProd = 0.0;

        for (int i = 0; i < n; i++){
            System.out.print("Vendedor #" + i + "\nInsira a quantidade de produtos vendidos: ");
            int qtdVendas = input.nextInt();
            vendedores.add(qtdVendas);
            for (int j = 0; j < qtdVendas; j++){
                System.out.print("Insira o preco do produto #" + j + ": ");
                valorProd = input.nextDouble();
                if (valorProd>=20 && valorProd<=500){
                    vendas.add(valorProd);
                }
            }
        }

        Collections.sort(vendas);

        for (int i=0; i<vendedores.size(); i++) {
            for (int j=0; j< vendas.size(); j++){
                if (vendas.get(j) < vendas.get(j)){
                    if (j == vendas.get(0)){
                        System.out.println(vendas.get(j));
                    }
                    break;
                }
            }
        }

        for (int i=0; i < vendedores.size(); i++) {
            for (int j=0; j < vendas.size(); j++){
                if (vendas.get(j) > vendas.get(j)){
                    if (j == vendas.lastIndexOf(vendas)){
                        System.out.println(vendas.get(j));
                    }
                    break;
                }
            }
        }
        input.close();
    }
}
