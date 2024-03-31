package br.com.Edu360.Livaria;

import java.util.ArrayList;
public class CarrinhoDeCompras {

    private final ArrayList<Livro> livros;

    public CarrinhoDeCompras(ArrayList<Livro> livros){
        this.livros = livros;
    }

    public ArrayList<Livro> getLivros(){
        return livros;
    }

    @Override
    public String toString(){
        return "CarrinhoDeCompras{" +
                "livros=" + livros + "}";
    }
    public double calcularTotal(){
        double totalValue = 0;

        for (Livro livro : livros){
            totalValue += livro.getPreco();

            if (livro instanceof LivroFisico){
                totalValue += ((LivroFisico) livro).getFrete();
            }
        }
        return totalValue;
    }

}
