package Models;

public class Audio {
    private String title;
    private int length;
    private int totalReproductions;
    private int likes, dislikes;
    private int clasification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    protected void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }

    protected int getLikes() {
        return likes;
    }

    protected void setLikes(int likes) {
        this.likes = likes;
    }

    protected int getDislikes() {
        return dislikes;
    }

    protected void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    protected float getClasification() {
        if (getLikes() == 0 && getDislikes() == 0){
            return -1;
        }else{
        return  5 * ((float) this.getLikes() / (this.getLikes() + this.getDislikes()));
        }
    }

    public void like (){
        this.setLikes(this.getLikes() + 1);
    }

    public void dislike(){
        this.setDislikes(this.getDislikes() + 1);
    }

    public void play(){
        this.setTotalReproductions(this.getTotalReproductions() + 1);
        System.out.println("\nReproduciendo: " + this.getTitle() +
                "\nMinutes: " + this.getLength() +
                "\nReproducciones: " + this.getTotalReproductions() );

    }


}
