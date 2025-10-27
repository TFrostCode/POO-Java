package Ejercicio01;

import java.util.regex.Pattern;

public class Validator {
    public static void validarDNI(String dni) throws IllegalArgumentException {
        // Expresión regular para DNI español: 8 dígitos y una letra mayúscula (excepto I, O, U)
        final Pattern patronDNI = Pattern.compile("^\\d{8}[A-HJ-NP-TV-Z]$");
        if (dni == null || !patronDNI.matcher(dni).matches()) {
            throw new IllegalArgumentException("El formato del DNI no es válido. Debe tener 8 números seguidos de una letra mayúscula.");
        }
    }
}
