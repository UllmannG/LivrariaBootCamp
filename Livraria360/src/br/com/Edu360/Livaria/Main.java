package br.com.Edu360.Livaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> listaCompras = getLivros();

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(listaCompras);

        double totalCompra = carrinhoDeCompras.calcularTotal();

        for (Livro lv : carrinhoDeCompras.getLivros()) {
            String nome = lv.getTitulo();
            double value = lv.getPreco();
            double totalValue = lv.precoTotal(lv);

            System.out.printf("Livro: %s\nValor: %s%n", nome, value);

            if (lv instanceof LivroFisico) {
                System.out.println("Valor do Frete: " + ((LivroFisico) lv).getFrete());
            }
            System.out.println("Valor Total do Livro: " + totalValue + "\n\n");
        }
        System.out.println("Valor Total do Carrinho: " + totalCompra);

    }

    private static ArrayList<Livro> getLivros() {
        Livro livroF1 = new LivroFisico("Livro1", "Gabriel", "001", 23.0, 1.7, 10.0);
        Livro ebook1 = new Ebook("Livro2", "Leirie", "002", 12.0, 23);
        Livro ebook2 = new Ebook("Livro3", "Castor", "003", 20.0, 50.0);
        Livro livroF2 = new LivroFisico("Livro4", "Ciclano", "004", 35.0, 3.0, 18.0);

        ArrayList<Livro> listaCompras = new ArrayList<>();
        listaCompras.add(livroF1);
        listaCompras.add(ebook1);
        listaCompras.add(ebook2);
        listaCompras.add(livroF2);
        return listaCompras;
    }
}