import java.util.ArrayList;
import java.util.List;

public class Atuendo {
  List<Prenda> prendas = new ArrayList<Prenda>();

  public Atuendo(List<Prenda> prendas){
    this.prendas = prendas;
  }

  public boolean todasLasCategorias(List<Categoria> categorias){
    return categorias.stream().allMatch(categoria -> prendas.stream().anyMatch(prenda -> prenda.getTipo().getCategoria()==categoria));
  }

  public boolean prendasCoincidenConTemp(Integer temp){
    return prendas.stream().allMatch(prenda -> prenda.temperaturaMax > temp);
  }
}
