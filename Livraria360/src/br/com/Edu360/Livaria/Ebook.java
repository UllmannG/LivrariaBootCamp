package br.com.Edu360.Livaria;

public class Ebook extends Livro {

    private double tamanhoEmMb;

    public Ebook(String titulo, String autor, String isbn, double preco, double tamanhoEmMb) {
        super(titulo, autor, isbn, preco);
        this.tamanhoEmMb = tamanhoEmMb;
    }

    public double getTamanhoEmMb() {
        return tamanhoEmMb;
    }

    public void setTamanhoEmMb(double tamanhoEmMb) {
        this.tamanhoEmMb = tamanhoEmMb;
    }

    @Override
    public String toString() {
        return super.toString() +
                " tamanhoEmMb = " + tamanhoEmMb;
    }

}