import java.util.HashMap;

public class Ubicacion {
    private  int id;
    private String descripcion;
    private HashMap<String , Integer> exits ;

    public Ubicacion (int Id , String descripcio ){
        id =  Id;
        descripcion= descripcio;
        exits = new HashMap<String ,Integer>();
    }

    public int getInteger (){
return id;
    }

    public String getDescripcion (){
        return descripcion;
    }

    public HashMap<String , Integer> getExits() {
        return exits;
    }

    public void addExit (String direcci , int idUbicacion){
        exits.put( direcci , idUbicacion);
    }

}
