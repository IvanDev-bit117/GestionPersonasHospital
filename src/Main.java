public static void main(String[] args) {
    //Menu ejemplo
    System.out.println("==Gestion Personas Hospital cruz roja==");

    //Objeto Doctor
    Doctor Doctor1 =new  Doctor();{
        Doctor1.nombre = "Jorge Ivan Castaneda Aguilar";
        Doctor1.documento = 1014658468;
        Doctor1.edad = 34;
        Doctor1.especialidad = "Cardiologo";
        Doctor1.nitlicencia ="TP-458721";

        Doctor1.atenderPaciente();
    }
}

