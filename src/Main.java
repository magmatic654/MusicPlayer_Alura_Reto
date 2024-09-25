import Models.Audio;
import Models.Podcast;
import Models.Song;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Audio audio = new Audio();
        audio.setTitle("Audio 1");
        audio.setLength(6);
        audio.like();
        audio.like();
        audio.like();
        audio.like();
        audio.play();

        Song song = new Song();
        song.like();
        song.setTitle("Nirvana");
        song.setLength(10);
        song.play();
        song.play();
        song.play();

        Podcast podcast = new Podcast();
        List<String> collaborators = new ArrayList<>();
        collaborators.add("Dross");
        collaborators.add("Rubius");
        podcast.setCollaborators(collaborators);
        podcast.setLength(4);
        podcast.setTitle("Los horrores en la cabaña de Suiza");
        podcast.like();
        podcast.like();
        podcast.like();
        podcast.like();
        podcast.like();
        podcast.like();
        podcast.like();
        podcast.like();
        podcast.like();
        podcast.dislike();
        podcast.play();
    }
}
