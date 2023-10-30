public class NextMain {
    public static void main(String[] args) {

        Movie theMovie = Movie.getMovie("Science", "StarWars");
        theMovie.watchMovie();

//        Adventure Killer = (Adventure) Movie.getMovie("c", "Killer");
//        Killer.watchMovie();
//
//        Object comedy = Movie.getMovie("C", "clown");
//        Comedy comedyMovie = (Comedy) comedy;
//        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Adventure");
        if (unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
            // test type, object and instances;
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScience();
        }
    }
}
