import java.util.*;

public class Movie{
    private String title;
    private String studio;
    private String rating;

    // first constructor
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    // second constructor
    public Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    // getPG method to get an array of movies with "PG" rating
    public static Movie[] getPG(Movie[] movies){
        ArrayList<Movie> pgMovies = new ArrayList<>();
        for(Movie movie : movies){
            if(movie.rating.equals("PG")){
                pgMovies.add(movie);
            }
        }
        return pgMovies.toArray(new Movie[0]);
    }

    public String getTitle(){
        return title;
    }
    public String getStudio(){
        return studio;
    }
    public String getRating(){
        return rating;
    }

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enter details for the "Casino Royale" movie
        System.out.println("Enter details for the movie 'Casino Royale':");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Studio: ");
        String studio = scanner.nextLine();
        System.out.print("Rating: ");
        String rating = scanner.nextLine();

        //instance of Movie class
        Movie casinoRoyale = new Movie(title, studio, rating);

        // displaying the details of Casino Royale
        System.out.println("\nMovie Details:");
        System.out.println("Title: " + casinoRoyale.getTitle());
        System.out.println("Studio: " + casinoRoyale.getStudio());
        System.out.println("Rating: " + casinoRoyale.getRating());

        //creating an (previously input)array of movies
        Movie[] movies = {
            casinoRoyale,
            new Movie("Finding Nemo", "Pixar", "PG"),
            new Movie("Inception", "Warner Bros.", "PG-13"),
            new Movie("Toy Story", "Pixar"),
            new Movie("Avatar", "20th Century Fox", "PG-13")
        };

        // get array of movies with "PG" rating
        Movie[] pgMovies = Movie.getPG(movies);

        // displaying the details of movies with "PG" rating
        System.out.println("\nMovies with 'PG' rating:");
        for (Movie movie : pgMovies) {
            System.out.println("Title: " + movie.getTitle() + ", Studio: " + movie.getStudio() + ", Rating: " + movie.getRating());
        }
        scanner.close();
    }
}

