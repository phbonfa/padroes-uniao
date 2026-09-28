package org.escritorio;

public class FabricaPJ implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        Contrato contrato = new Contrato();
        contrato.setPessoa(new PessoaJuridica());
        return contrato;
    }

    @Override
    public Procuracao createProcuracao() {
        Procuracao procuracao = new Procuracao();
        procuracao.setPessoa(new PessoaJuridica());
        return procuracao;
    }
}