package org.escritorio;

public class Contrato extends Documento {

    @Override
    public String emitir() {
        return "Contrato " + this.pessoa.getTipo();
    }
}