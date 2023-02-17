import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 public class Main {
    private Map <Integer , Ubicacion> ubicaciones =new HashMap<>();

    public Map<Integer , Ubicacion> getUbicaciones(){
        return ubicaciones;
    }

 public Main ( ){
    Ubicacion ubicacion1 = new Ubicacion( 1 , "Estas sentado en la cima de una montaña" );
ubicaciones.put(1 , ubicacion1 );

    ubicacion1.addExit("E" , 3);
    ubicacion1.addExit("O" , 2);
    ubicacion1.addExit("N" , 5);
    ubicacion1.addExit("S" , 4);






    Ubicacion ubicacion2 = new Ubicacion( 2 , "Estas bañandote en la playa"  );

    ubicaciones.put(2 , ubicacion2);
    ubicacion2.addExit("N" , 5);

    Ubicacion ubicacion3 = new Ubicacion( 3 , "Estas dentro de un edificio muy alto" );
    ubicaciones.put(3,ubicacion3);
    ubicacion3.addExit("O" , 1);


    Ubicacion ubicacion4 = new Ubicacion( 4 , "Estas de pie en un puente" );
    ubicaciones.put(4, ubicacion4);
    ubicacion4.addExit("N" , 1);
    ubicacion4.addExit("O" , 2);


    Ubicacion ubicacion5 = new Ubicacion( 5 , "Estas en un bosque" );
    ubicaciones.put(5 , ubicacion5);

    ubicacion5.addExit("O" , 2);
    ubicacion5.addExit("S" , 1);

    Ubicacion ubicacion0 = new Ubicacion(0 ,"Estas en la clase de programación" );
    ubicaciones.put( 0 , ubicacion0);



}


    public static void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);


        Main ma = new Main();

        int ubicacion_actual = 1;


        String opcion;
        do{

            System.out.println(ma.ubicaciones.get(ubicacion_actual).getDescripcion());
            System.out.println("Dime a donde quieres ir: ");
            System.out.println(ma.ubicaciones.get(ubicacion_actual).getExits());
            opcion = sc1.nextLine();
            opcion = opcion.toUpperCase();
            //System.out.println(ma.ubicaciones.get(ubicacion_actual).getExits().get(opcion.toUpperCase()));

            if (!opcion.equals("Q")) {


                if ((!opcion.equals("N")) && (!opcion.equals("O")) && (!opcion.equals("E")) && (!opcion.equals("S")) && (!opcion.equals("Q"))) {
                    System.out.println("No se puede ir a ese lugar");

                } else {

                    if (ma.ubicaciones.get(ubicacion_actual).getExits().get(opcion.toUpperCase()) == null) {
                        System.out.println("No se puede ir en esa dirección");
                    } else {
                        ubicacion_actual = ma.ubicaciones.get(ubicacion_actual).getExits().get(opcion.toUpperCase());
                    }
                }

            }


        }while (!opcion.equalsIgnoreCase("Q"));

    }
}