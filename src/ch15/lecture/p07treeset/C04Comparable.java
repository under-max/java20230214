package ch15.lecture.p07treeset;

import java.util.*;

public class C04Comparable {
	public static void main(String[] args) {
		TreeSet<Movie> movie = new TreeSet<>();
		
		movie.add(new Movie("topgun"));
		movie.add(new Movie("Avengers"));
		movie.add(new Movie("Slamdunk"));
		movie.add(new Movie("Avatar"));
		
		System.out.println(movie);
	}
}

class Movie implements Comparable<Movie>{
	private String title;

	public Movie(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(title, other.title);
	}
	
	@Override
	public int compareTo(Movie o) {
		// o-< 이객체가 파라미터보다 작으면 음수 
		// 같으면 0
		// 크면 양수
		
		return this.title.compareTo(o.title);
	}
}