import java.awt.*;

public class Prenda {
  Tipo tipo;
  Trama trama;
  Material material;
  Color color;
  Integer temperaturaMax;

  public Prenda(Tipo tipo,Trama trama,Material material,Color color,Integer temp){
    this.tipo = tipo;
    this.trama = trama;
    this.material = material;
    this.color = color;
    this.temperaturaMax = temp;
  }

  public Tipo getTipo(){
    return this.tipo;
  }
}
