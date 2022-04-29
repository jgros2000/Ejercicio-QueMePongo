import java.awt.*;

public class PrendaBuilder {

  Tipo tipo;
  Trama trama = Trama.lisa;
  Material material;
  Color color;

  public Prenda crearPrenda(){
    return new Prenda(this.tipo,this.trama,this.material,this.color);
  }

  public void tipo(Tipo tipo){
    this.tipo = tipo;
  }


  public void definirAspectosSecundarios(Material mat,Color col,Trama tram){
    if(this.tipo == null){
      throw new faltaSetearElTipo("Primero se debe elegir el tipo de prenda");
    }
    else{
      this.material(material);
      this.color(color);
      this.trama(trama);
    }
  }

  public void definirAspectosSecundarios(Material mat,Color col){
    if(this.tipo == null){
      throw new faltaSetearElTipo("Primero se debe elegir el tipo de prenda");
    }
    else{
      this.material(material);
      this.color(color);
    }
  }

  private void material(Material material){
    if(this.tipo.getMateriales().contains(material)){
      this.material = material;
    }
    else {
      throw new CoincidenciaMaterialTipo("No existen materiales con ese tipo");
    }
  }

  private void trama(Trama trama){
    if(this.tipo.getTramas().contains(trama)){
      this.trama = trama;
    }
    else {
      throw new CoincidenciaTramaTipo("No existen tramas con ese tipo");
    }
  }

  private void color(Color color){
    if(this.tipo.getColores().contains(color)){
      this.color = color;
    }
    else {
      throw new CoincidenciaColorTipo("No existen colores con ese tipo");
    }
  }
}
