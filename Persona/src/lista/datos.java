package lista;

public class datos {
    

public static void main(String[] args) {
        
    Persona perso1= new Persona ();   
    Persona perso2= new Persona ("Juan Perez", 30, "juan.perez@example.com");

    System.out.println("La edad de la persona 2 es:" + perso2.getEdad());
    System.out.println("El nombre la persona 2 es:" + perso2.getNombre());
    System.out.println("El email de la persona 2 es:" + perso2.getEmail());
     
    perso1.setEdad(41);
    perso1.setNombre("Carlos Alberto");
    perso1.setEmail("carlos.alberto@gmail.com");
    
    System.out.println("------------------------------------------------------");    
    
    System.out.println("La edad de la persona 1 es:" + perso1.getEdad());
    System.out.println("El nombre la persona 1 es:" + perso1.getNombre());
    System.out.println("El email de la persona 1 es:" + perso1.getEmail());
    }
}