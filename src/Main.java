import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        String lugarDelParcial = new String("Aula 116, Da Vinci");

        Season torneoDaVinci = new Season();   //creamos torneo
        Date fechaPosibleParcial = new Date(2022,8,29); //creamos fecha


        Match primerParcial = new Match(
                lugarDelParcial,
        new Date (2022,8,29)
    );     // creamos partido


        TeamSeason profesoresPOO = new TeamSeason("Profes POO");
        TeamSeason estudiantesFC = new TeamSeason("Estudiantes FC");
        TeamSeason recursantesFC = new TeamSeason("Recursantes FC");
        profesoresPOO.setPosition(1);
        estudiantesFC.setPosition(0);

        Player alumnoLuis = new Player("Luis Diaz",1,"Goalkeeper");
        Player profeSergio = new Player("Sergio Medina",2,"Defender");
        Player profeSuplemente = new Player("Juan manuel",3,"forwer");

        primerParcial.setLocalTeam(profesoresPOO);
        primerParcial.setVisitantTeam(estudiantesFC);

    }
}