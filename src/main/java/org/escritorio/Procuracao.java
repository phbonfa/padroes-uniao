package org.escritorio;

public class Procuracao extends Documento {

    @Override
    public String emitir() {
        return "Procuração " + this.pessoa.getTipo();
    }
}