public class Song {
    private String title;
    private int rating;


    public Song(String t){
        title=t;
        rating=0;
    }
   
    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }
 
    public String toString()
    {
        String info = "\"" + title + "\",  is  rated" + rating;
        if (rating != 0)
        {
            info += ", rating is " + rating;
        }
        return info;
    }

    //mutators
    public void setTitle(String t) {
        title = t;
    }

    public void adjustRating(int r){
        if (r>=0 && r<=10){
            rating=r;
        }
    }

    public boolean equals(Song s){
        if (this.title.equals(s.title)){
            return true;
      }
      else{
        return false;
      }
  }

}
