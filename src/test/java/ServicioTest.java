import org.junit.Assert;
import org.junit.Test;

public class ServicioTest {

  @Test
  public void armarioDevuelveAtuendosAdecuados(){
    Integer temperatura = servicio.getWeather("Buenos Aires, Argentina");//Seria un singleton
    Armario armario = new Armario();
    Assert.assertNotSame(armario.atuendos,armario.realizarSugerencia(temperatura));
  }
}
