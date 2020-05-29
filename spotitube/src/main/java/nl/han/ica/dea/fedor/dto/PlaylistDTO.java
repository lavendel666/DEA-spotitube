package nl.han.ica.dea.fedor.dto;

import java.util.List;

public class PlaylistDTO {
    private int id;
    private String name;
    private boolean owner;
    private List<TrackDTO> tracks;
    private int duration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    public List<TrackDTO> getTracks() {
        return tracks;
    }

    public void setTracks(List<TrackDTO> tracks) {
        this.tracks = tracks;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }
}
