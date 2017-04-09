package ovallero.sesion;

public class Autogestion {

    public static final String[] DOMINIOS = {"cbasicas", "civil", "computos", "decanato", "egresado", "electrica",
            "electronica", "extension", "industrial", "mecanica", "metalurgica", "org", "posgrado", "punilla",
            "quimica", "radio", "sa", "sae", "scdt", "sistemas", "tecnicatura", "virtual", "frc"};


    private String legajo, dominio, contraseña;

    public Autogestion(String legajo, int dominio, String contraseña) throws SesionException{
        validar(legajo, dominio, contraseña);

        this.legajo = legajo.trim();
        this.dominio = DOMINIOS[dominio];
        this.contraseña = contraseña.trim();


    }

    private void validar(String legajo, int dominio, String contraseña) throws SesionException{
        if(legajo == null ||
                legajo.trim().isEmpty() ||
                !legajo.trim().matches("\\d+")) throw new SesionException("Legajo vacío o invalido.");
        if(dominio < 0 || dominio > DOMINIOS.length - 1) throw new SesionException("Dominio vacío.");
        if(contraseña == null ||
                contraseña.trim().isEmpty() ||
                !contraseña.matches("\\S+")) throw new SesionException("Contraseña vacía.");
    }
}
