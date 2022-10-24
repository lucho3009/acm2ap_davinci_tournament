import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        String lugarDelParcial = new String("Aula 116, Da Vinci");

        Season torneoDaVinci = new Season();   //creamos torneo
        Date fechaPosibleParcial = new Date(2022,8,29); //creamos fecha


        Player profeSergio = new Player("Sergio Medina",2,"Defender");
        Player profeSuplente = new Player("Juan manuel",3,"forwer");
        Player profeWeb = new Player ("SebasM",6,"midfildier");
        Player profeJava = new Player ("Montoto",8,"forwer");
        Player profeBasedeDatos = new Player ("Victor G",10,"Goalkeeper");
        Player profeWebII = new Player ("bauti",11,"defender");

        Player alumnoLuis = new Player("Luis Diaz",1,"Goalkeeper");
        Player alumnoJose = new Player ("Jose Araoz",4,"midfildier");
        Player alumnoJesus = new Player ("Jesus Antonio",7,"forwer");
        Player alumnoCesar = new Player ("Cesar R",10,"defender");
        Player alumnoNacho = new Player ("Nachito",11,"Captain");



        TeamSeason profesoresPOO = new TeamSeason("Profes POO");
        TeamSeason estudiantesFC = new TeamSeason("Estudiantes FC");
        TeamSeason recursantesFC = new TeamSeason("Recursantes FC");

        profesoresPOO.addPlayer(profeSergio);
        profesoresPOO.addPlayer(profeWeb);
        profesoresPOO.addPlayer(profeJava);
        profesoresPOO.addPlayer(profeBasedeDatos);
        profesoresPOO.addPlayer(profeWebII);

        estudiantesFC.addPlayer(alumnoLuis);
        estudiantesFC.addPlayer(alumnoCesar);
        estudiantesFC.addPlayer(alumnoJesus);
        estudiantesFC.addPlayer(alumnoNacho);
        estudiantesFC.addPlayer(alumnoJose);

        Match primerParcial = new Match(
                lugarDelParcial,
                new Date (2022,8,29),
                profesoresPOO,
                estudiantesFC
        );     // creamos partido
        

        profesoresPOO.setPosition(1);
        estudiantesFC.setPosition(0);



    }
}