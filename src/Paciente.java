public class Paciente extends Persona {

    public String enfermedad = "";
    public String afiliacion = "";
    public String medicamento ="";

    public void recibirtratamiento() {

        System.out.println("\n ==Paciente==");
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de documento: " + documento + " / Edad: " + edad);
        System.out.println("Enfermedad: " + enfermedad + " / Tipo afiliacion: " + afiliacion);
        System.out.println("Medicamento a recetar: " + medicamento);
    }
}