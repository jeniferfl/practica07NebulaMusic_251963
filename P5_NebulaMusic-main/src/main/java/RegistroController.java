import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistroController {
    @PostMapping("/crear-cuenta")
    public String crearCuenta(
            @RequestParam String nombre,
            @RequestParam String email,
            @RequestParam String contrasenia,
            @RequestParam String alias,
            @RequestParam String genero,
            @RequestParam String suscripcion,
            @RequestParam String fechaNacimiento,
            @RequestParam String terminos,
            @RequestParam(required = false) String comentarios) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + email);
        System.out.println("Contraseña: " + contrasenia);
        System.out.println("Alias: " + alias);
        System.out.println("Género: " + genero);
        System.out.println("Suscripción: " + suscripcion);
        System.out.println("Fecha: " + fechaNacimiento);
        System.out.println("Términos: " + terminos);
        System.out.println("Comentarios: " + comentarios);
        return "index";
    }
}
