public static void main(String[] args) {
    //Menu ejemplo
    System.out.println("=======================================");
    System.out.printf("==Gestion Personas Hospital cruz roja==");

    //Objeto Doctor
    Doctor Doctor1 =new  Doctor();{
        Doctor1.nombre = "Jorge Ivan Castaneda Aguilar";
        Doctor1.documento = 1014658469;
        Doctor1.edad = 34;
        Doctor1.especialidad = "Cardiologo";
        Doctor1.nitlicencia ="TP-458721";

        Doctor1.atenderPaciente();
    }
    //Objeto Paciente
    Paciente Paciente1 =new Paciente();{
        Paciente1.nombre ="Carlos España";
        Paciente1.documento =1025144203;
        Paciente1.edad =23;
        Paciente1.enfermedad="Gonorrea avanzada";
        Paciente1.afiliacion ="Vinculado";
        Paciente1.medicamento ="Azitromicina y Doxiciclina";

        Paciente1.recibirtratamiento();
    }
    //Objeto Enfermero
    Enfermero Enfermero1 =new Enfermero();{
        Enfermero1.nombre ="Luisa Fernandez";
        Enfermero1.documento =1012648796;
        Enfermero1.edad =26;
        Enfermero1.turno ="Nocturno";
        Enfermero1.area ="Urgencias y Emergencias";
        Enfermero1.accion ="Tomar signos";

        Enfermero1.tomarsignos();
    }
}

