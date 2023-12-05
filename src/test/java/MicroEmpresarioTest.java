import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MicroEmpresarioTest {
    @Test
    void deveCalcularImpostoMG(){
        MicroEmpresario microEmpresario = new MicroEmpresario();
        microEmpresario.impostoMG(100.0f);
        assertEquals(110.0f, microEmpresario.getImposto());
    }

    @Test
    void deveCalcularImpostoPR(){
        MicroEmpresario microEmpresario = new MicroEmpresario();
        microEmpresario.impostoPR(100f);
        assertEquals(140.0f, microEmpresario.getImposto());
    }
}