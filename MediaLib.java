public class MediaLib
{
  private Book book;
  private Movie movie; //new instance variable
  private Song song;
  public static String owner = "PLTW";
  private static int numEntries=0;
  private static int numBooks=0;
  private static int numMovies=0;
  private static int numSongs=0;

  public void addBook(Book b)
  {
    if (book==null){
      book = b;
      numEntries++;
      numBooks++;

    }
    else{
      System.out.println("The library already has a book called" + b.getTitle());
    }
  }

  public void addMovie(Movie m){
    if (movie ==null){
      movie=m;
      numEntries++;
      numMovies++;
    }
    else{
      System.out.println("The library already has a movie called " + m.getTitle());
    }

  }

  public String toString()
  {
    String info = "Library contents: \n";
    if (book !=null){
      info+="Book: " +book+ "\n";
    }
    if (movie !=null){
      info+="Movie: " +movie+ " \n";
    }
    if (song!=null){
      info+="Song: "+song+ " \n";
    }
    return info;
  }

  public Book getBook()
  {
    return book;
  }
  //public void testBook(Book tester){
    //tester.setTitle("Title change");
    //System.out.println(tester);}
  public static String getOwner(){
    return owner;
  }
  public static void changeOwner(String newOwner){ //void to change info
    owner=newOwner;
  }
  public static int getNumEntries(){
    return numEntries;
  }
  public static int getNumBooks(){
    return numBooks;
  }
  public static int getNumMovies(){
    return numMovies;
  }
  public static int getNumSongs(){
    return numSongs;
  }
  public void addSong(Song s){
    if (song== null){
      song=s;
      numEntries++;
      numSongs++;
    }
    else{
      System.out.println("The library already has a song called " + s.getTitle());
    }
  }


 

}
