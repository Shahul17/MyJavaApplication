package day8;
// array of our type
public class MovieStore {

Movie[] movies;	
MovieStore(){
	movies=new Movie[3];
}
	void addMovie() {
		
	
		for(int i=0;i<movies.length;i++) {
movies[i]= new Movie();
movies[i].GetMovieDetails();
		}

	}
	void listallmovies() {
		for(int i=0;i<movies.length;i++) {
			movies[i].PrintMovieDetils();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieStore moviestore = new MovieStore();
		moviestore.addMovie();
		moviestore.listallmovies() ;
	}

}
