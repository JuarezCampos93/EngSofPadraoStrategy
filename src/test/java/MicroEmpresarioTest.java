import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    @Test
    void deveCalcularImpostoMG(){
        Empresa empresa = new Empresa();
        empresa.impostoMG(100f);
        assertEquals(110.0f, empresa.getImposto());
    }

    @Test
    void deveCalcularImpostoPR(){
        Empresa empresa = new Empresa();
        empresa.impostoPR(100f);
        assertEquals(115.0f, empresa.getImposto());
    }
}
