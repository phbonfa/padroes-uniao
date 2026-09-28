package org.escritorio;

public abstract class Documento {

    protected Pessoa pessoa;

    public Documento() {}

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public abstract String emitir();
}