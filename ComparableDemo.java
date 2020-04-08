package in.satheesh.strings;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>
{
	private String rating;
	private String mName;
	private int year;
	
	
	@Override
	public int compareTo(Movie m)
	{
		return this.year - m.year;
	}
	
	public Movie (String rat , String name,int ye)
	{
		this.mName = name;
		this.rating = rat;
		this.year = ye;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

	
}
public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens","8.3",2015));
		list.add(new Movie("Avengers End Game","9.0",2018));
		list.add(new Movie("Star Wars","7.8",1977));
		list.add(new Movie("Spider Man","8.6",2007));
		list.add(new Movie("Anaconda","7.3",1998));
		list.add(new Movie("The wall","8.2",2020));
		
		Collections.sort(list);
		System.out.println("Movies After Sorting : ");
		for(Movie movie : list)
		{
			System.out.println(movie.getmName()+" "+movie.getRating()+ ""+movie.getYear());
		}

	}

}
