package negocio;

public class MainUsuario {
    public static void main() {
        Usuario u = new Usuario();

        u.setUsername("DavidC");
        u.setCorreo("davidC@correo.com");
        u.setNivel(3);
        u.activar();

        System.out.println("\n=== USUARIO ===");
        System.out.println("Username: " + u.getUsername());
        System.out.println("Correo: " + u.getCorreo());
        System.out.println("Nivel: " + u.getNivel());
        System.out.println(u.isActivo() ? "Estado: Activo" : "Estado: No Activo");


        System.out.println("\n--- Prueba Datos inválidos ---");
        u.setUsername("");
        u.setCorreo("   ");
        u.setNivel(-2);

        System.out.println("Username: " + u.getUsername());
        System.out.println("Correo: " + u.getCorreo());
        System.out.println("Nivel: " + u.getNivel());

        u.desactivar();
        System.out.println("\nActivo tras desactivar(): " + u.isActivo());
    }
}