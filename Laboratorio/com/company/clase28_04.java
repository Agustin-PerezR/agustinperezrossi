import com.company.Persona;


import java.util.ArrayList;

class clase28_04 {
    public static void main(String[] args) {
        Persona p = new Persona();
        ArrayList<Persona> P= new ArrayList<>();
        String nombre = p.getNombre();
        int edad= p.getEdad();;
        int telefono= p.getTelefono();
        int dni= p.getDni();
        String direccion= p.getDireccion();
        P.add(p);
        System.out.println(P);
    }
}