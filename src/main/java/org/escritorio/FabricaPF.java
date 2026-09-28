package org.escritorio;

public class FabricaPF implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        Contrato contrato = new Contrato();
        contrato.setPessoa(new PessoaFisica());
        return contrato;
    }

    @Override
    public Procuracao createProcuracao() {
        Procuracao procuracao = new Procuracao();
        procuracao.setPessoa(new PessoaFisica());
        return procuracao;
    }
}