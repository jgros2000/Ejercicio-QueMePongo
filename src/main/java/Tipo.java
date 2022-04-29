import java.awt.*;
import java.util.List;

public class Tipo {

  Categoria categoria;
  List<Material> materiales;
  List<Color> colores;
  List<Trama> tramas;

  public Tipo(Categoria categoria,List<Material> materiales,List<Color> colores,List<Trama> tramas){
    this.categoria = categoria;
    this.materiales = materiales;
    this.colores = colores;
    this.tramas = tramas;
  }

  public Categoria getCategoria(){
    return this.categoria;
  }

  public List<Material> getMateriales(){
    return this.materiales;
  }

  public List<Color> getColores(){
    return this.colores;
  }

  public List<Trama> getTramas(){
    return this.tramas;
  }


}
