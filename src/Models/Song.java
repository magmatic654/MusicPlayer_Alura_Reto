package Models;

public class Song extends Audio{
    private String author;

    protected String getAuthor() {
        return this.author;
    }

    protected void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void play(){
        this.setTotalReproductions(this.getTotalReproductions() + 1);
        System.out.println(
                "\nReproduciendo: " + this.getTitle() +
                "\nAutor: " + this.getAuthor() +
                "\nMinutes: " + this.getLength() +
                "\nReproducciones: " + this.getTotalReproductions() +
                "\nEstrellas: " + this.getClasification());
    }

}
