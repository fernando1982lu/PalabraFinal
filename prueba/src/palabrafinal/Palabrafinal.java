package palabrafinal;

/**
 *
 * @author fernando.murcia
 */
public class Palabrafinal {

    public static void main(String[] args) {
        System.out.println("Nombre Persona: " + ClaseFinal.persona.getNombre());
        
        ClaseFinal.persona.setNombre("Luciana");
        
        System.out.println("Nombre persona: " + ClaseFinal.persona.getNombre());
    }
    
}
