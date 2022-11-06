import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacoteDeViagemTest {

    @Test
    void deveRetornarPrecoPacoteBasico() {
        PacoteDeViagem pacoteDeViagem = new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu");

        assertEquals(1000.0f, pacoteDeViagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteBasicoComAluguelAutomovel() {
        PacoteDeViagem pacoteDeViagem = new AluguelAutomovel(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu"));

        assertEquals(1500.0f, pacoteDeViagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteBasicoComTourTuristico() {
        PacoteDeViagem pacoteDeViagem = new TourTuristico(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu"));

        assertEquals(1400.0f, pacoteDeViagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteBasicoComTranslado() {
        PacoteDeViagem pacoteDeViagem = new Translado(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu"));

        assertEquals(1200.0f, pacoteDeViagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteBasicoComAluguelAutomovelMaisTourTuristico() {
        PacoteDeViagem pacoteDeViagem = new AluguelAutomovel(new TourTuristico(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu")));

        assertEquals(1900.0f, pacoteDeViagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteBasicoComAluguelAutomovelMaisTranslado() {
        PacoteDeViagem pacoteDeViagem = new AluguelAutomovel(new Translado(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu")));

        assertEquals(1700.0f, pacoteDeViagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteBasicoComTourTuristicoMaisTranslado() {
        PacoteDeViagem pacoteDeViagem = new TourTuristico(new Translado(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu")));

        assertEquals(1600.0f, pacoteDeViagem.getPreco());
    }

    @Test
    void deveRetornarPrecoPacoteBasicoComAluguelAutomovelMaisTourTuristicoMaisTranslado() {
        PacoteDeViagem pacoteDeViagem = new AluguelAutomovel(new TourTuristico(new Translado(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu"))));

        assertEquals(2100.0f, pacoteDeViagem.getPreco());
    }

    @Test
    void deveRetornarEstruturaPacoteBasico() {
        PacoteDeViagem pacoteDeViagem = new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu");

        assertEquals("Pacote Básico", pacoteDeViagem.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPacoteBasicoComAluguelAutomovel() {
        PacoteDeViagem pacoteDeViagem = new AluguelAutomovel(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu"));

        assertEquals("Pacote Básico/Aluguel Automovel", pacoteDeViagem.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPacoteBasicoComTourTuristico() {
        PacoteDeViagem pacoteDeViagem = new TourTuristico(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu"));

        assertEquals("Pacote Básico/Tour Turistico", pacoteDeViagem.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPacoteBasicoComTranslado() {
        PacoteDeViagem pacoteDeViagem = new Translado(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu"));

        assertEquals("Pacote Básico/Translado", pacoteDeViagem.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPacoteBasicoComAluguelAutomovelMaisTourTuristico() {
        PacoteDeViagem pacoteDeViagem = new AluguelAutomovel(new TourTuristico(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu")));

        assertEquals("Pacote Básico/Tour Turistico/Aluguel Automovel", pacoteDeViagem.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPacoteBasicoComAluguelAutomovelMaisTranslado() {
        PacoteDeViagem pacoteDeViagem = new AluguelAutomovel(new Translado(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu")));

        assertEquals("Pacote Básico/Translado/Aluguel Automovel", pacoteDeViagem.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPacoteBasicoComTourTuristicoMaisTranslado() {
        PacoteDeViagem pacoteDeViagem = new TourTuristico(new Translado(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu")));

        assertEquals("Pacote Básico/Translado/Tour Turistico", pacoteDeViagem.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPacoteBasicoComAluguelAutomovelMaisTourTuristicoMaisTranslado() {
        PacoteDeViagem pacoteDeViagem = new AluguelAutomovel(new TourTuristico(new Translado(new PacoteBasico(1000.0f, "Juiz de Fora", "Foz do Iguaçu"))));

        assertEquals("Pacote Básico/Translado/Tour Turistico/Aluguel Automovel", pacoteDeViagem.getEstrutura());
    }
}