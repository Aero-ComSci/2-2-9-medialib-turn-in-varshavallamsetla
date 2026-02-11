public class Movie {
    private String title;
    private double duration;
    private int rating;

    public Movie(String t, double d){
        title=t;
        duration=d;
        rating=0;
    }
   
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }
 
    public int getRating() {
        return rating;
    }
 
    public String toString()
    {
        String info = "\"" + title + "\",  is " + duration + " hours long.";
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

    public void setDuration(double d) {
        duration = d;
    }

    public void adjustRating(int r){
        if (r>=0 && r<=10){
            rating=r;
        }
    }

    public boolean equals(Movie m){
        if (this.title.equals(m.title)&& this.duration==m.duration){
            return true;
      }
      else{
        return false;
      }
  }

}
