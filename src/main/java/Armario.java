import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Armario {
  List<Atuendo> atuendos = new ArrayList<Atuendo>();
  List<Categoria> categorias = new ArrayList<Categoria>();


  public void agregarAtuendo(Atuendo atuendo){
    this.atuendos.add(atuendo);
  }

  public Optional<Atuendo> realizarSugerencia(Integer temp){ //La temperatura la consigo preguntandole al servicio meteorologico y se la paso a la funcion
    return atuendos.stream().findFirst().filter(atuendo -> atuendo.prendasCoincidenConTemp(temp) && atuendo.todasLasCategorias(categorias));
  }
}
