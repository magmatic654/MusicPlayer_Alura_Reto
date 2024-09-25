package Models;

import java.util.List;

public class Podcast extends Audio {
    private List<String> collaborators;

    public String getCollaborators() {
        return String.join(", ", this.collaborators);
    }

    public void setCollaborators(List<String> collaborators) {
        this.collaborators = collaborators;
    }

    @Override
    public void play(){
        this.setTotalReproductions(this.getTotalReproductions() + 1);
        System.out.println(
                "\nReproduciendo: " + this.getTitle() +
                        "\nColaboradores: " + getCollaborators() +
                        "\nMinutes: " + this.getLength() +
                        "\nReproducciones: " + this.getTotalReproductions() +
                        "\nEstrellas: " + this.getClasification());
    }

}
