package in.satheesh.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movies 
{
	private double rating;
	private String mName;
	private int year;
	
	
	public int compareTo(Movies m)
	{
		return this.year - m.year;
	}
	
	public Movies (double rat , String name,int ye)
	{
		this.mName = name;
		this.rating = rat;
		this.year = ye;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
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
class Ratingcompare implements Comparator<Movies>
{
	@Override
	public int compare(Movies m1, Movies m2)
	{
		if(m1.getRating() < m2.getRating()) return -1;
		if(m1.getRating() > m2.getRating()) return 1;
		else return 0;
		
	}
}
class NameCompare implements Comparator<Movies>
{
	@Override
	public int compare(Movies m1,Movies m2)
	{
		return m1.getmName().compareTo(m2.getmName());
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Movies> list = new ArrayList<Movies>();
		list.add(new Movies(8.3,"Force Awakens",2015));
		list.add(new Movies(9.0,"Avengers End Game",2018));
		list.add(new Movies(7.8,"Star Wars",1977));
		list.add(new Movies(8.6,"Spider Man",2007));
		list.add(new Movies(7.3,"Anaconda",1998));
		
		  System.out.println("Sorted By rating : ");
		System.out.println("===================");
		Ratingcompare rc = new Ratingcompare();
		Collections.sort(list, rc);
		for(Movies movie : list)
		{
			System.out.println(movie.getmName()+" "+movie.getRating()+ ""+movie.getYear());
		}
		
		System.out.println("Sorted by Name : ");
		System.out.println("==================");
		NameCompare nc = new NameCompare();
		Collections.sort(list, nc);
		for(Movies movie : list)
		{
			System.out.println(movie.getmName()+"   "+movie.getRating()+ ""+movie.getYear());
		}
	}

	}


