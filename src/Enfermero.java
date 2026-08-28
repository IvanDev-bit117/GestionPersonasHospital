public class Enfermero extends Persona{
    public String turno="";
    public String area="";
    public String accion="";

    public void tomarsignos(){
        System.out.println("\n ==Enfermero==");
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de documento: " + documento + "/ Edad: " + edad);
        System.out.println("Turno: " + turno + " / Area: " + area);
        System.out.println("Ultima accion realizada: " + accion);
    }
}
