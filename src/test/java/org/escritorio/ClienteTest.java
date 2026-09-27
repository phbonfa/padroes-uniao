package org.escritorio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabricaAbstrata("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Física", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabricaAbstrata("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Jurídica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabricaAbstrata("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Física", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabricaAbstrata("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Jurídica", cliente.emitirProcuracao());
    }

}
