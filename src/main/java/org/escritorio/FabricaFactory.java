package org.escritorio;

public class FabricaFactory {

    private FabricaFactory() {};
    private static FabricaFactory instance = new FabricaFactory();
    public static FabricaFactory getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabricaAbstrata(String fabrica) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.escritorio.Fabrica" + fabrica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fabrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fabrica inválido");
        }
        return (FabricaAbstrata) objeto;
    }
}
