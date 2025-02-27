public class Main {
    public static void main(String[] args) {
        // switch case antiguo (clasico)
        int dia1 = 1;
        String nom_dia1;
        switch (dia1) {
            case 1:
                nom_dia1 = "lunes";
                break;
            case 2:
                nom_dia1 = "martes";
                break;
            case 3:
                nom_dia1 = "miércoles";
                break;
            default:
                nom_dia1 = "error";
        }

        System.out.println(nom_dia1); //salida segun "dia1"
//---------------------------------------------------------------------------------
        // switch case nuevo
        int dia2 = 2;

        String nom_dia2 = switch (dia2) {
            case 1 -> "lunes";
            case 2 -> "martes";
            case 3 -> "miercoles";
            default -> "error";
        };

        System.out.println(nom_dia2); // salida segun "dia2"
    }
}
