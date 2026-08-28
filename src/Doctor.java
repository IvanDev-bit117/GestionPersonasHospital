public class Doctor extends Persona{
        public String especialidad="";
        public String nitlicencia="";
    public void atenderPaciente(){

        System.out.println("\n ==Doctor==");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Numero de documento: " + documento + " / Edad: "+ edad);
        System.out.println("Especialidad: " + especialidad + " / Numero de licencia: "+ nitlicencia);
    }
}