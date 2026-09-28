package org.escritorio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabricaAbstrata("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Física", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabricaAbstrata("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Jurídica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabricaAbstrata("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Física", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabricaAbstrata("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Jurídica", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirContratoComPessoaFisica() {
        Pessoa pessoa = new PessoaFisica();
        Documento contrato = new Contrato();
        contrato.setPessoa(pessoa);
        assertEquals("Contrato Pessoa Física", contrato.emitir());
    }

    @Test
    void deveEmitirContratoComPessoaJuridica() {
        Pessoa pessoa = new PessoaJuridica();
        Documento contrato = new Contrato();
        contrato.setPessoa(pessoa);
        assertEquals("Contrato Pessoa Jurídica", contrato.emitir());
    }

    @Test
    void deveEmitirProcuracaoComPessoaFisica() {
        Pessoa pessoa = new PessoaFisica();
        Documento procuracao = new Procuracao();
        procuracao.setPessoa(pessoa);
        assertEquals("Procuração Pessoa Física", procuracao.emitir());
    }

    @Test
    void deveEmitirProcuracaoComPessoaJuridica() {
        Pessoa pessoa = new PessoaJuridica();
        Documento procuracao = new Procuracao();
        procuracao.setPessoa(pessoa);
        assertEquals("Procuração Pessoa Jurídica", procuracao.emitir());
    }

}
