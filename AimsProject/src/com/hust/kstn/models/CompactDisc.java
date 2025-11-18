package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media {
    private List<String> artists = new ArrayList<>();
    private List<String> directors = new ArrayList<>();
    private List<Track> tracks = new ArrayList<>();

    // Full constructor
    public CompactDisc(String title, String category, double cost,
                       List<String> artists, List<String> directors, List<Track> tracks) {
        super(title, cost, category);
        if (artists != null) this.artists.addAll(artists);
        if (directors != null) this.directors.addAll(directors);
        if (tracks != null) this.tracks.addAll(tracks);
    }

    public List<String> getArtists() {
        return artists;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    // Calculate total length (sum of track lengths)
    public int totalLength() {
        int sum = 0;
        for (Track t : tracks) {
            if (t != null) sum += t.getLength();
        }
        return sum;
    }

    // Add a track (check null and duplicate by title+length)
    public void addTrack(Track track) {
        if (track == null) {
            System.out.println("Cannot add null track");
            return;
        }
        for (Track t : tracks) {
            if (t != null && t.getTitle().equals(track.getTitle()) && t.getLength() == track.getLength()) {
                System.out.println("Track already exists in this CD");
                return;
            }
        }
        tracks.add(track);
        System.out.println("Track added: " + track.getTitle());
    }

    // Remove a track (check null and existence)
    public void removeTrack(Track track) {
        if (track == null) {
            System.out.println("Cannot remove null track");
            return;
        }
        int idx = -1;
        for (int i = 0; i < tracks.size(); i++) {
            Track t = tracks.get(i);
            if (t != null && t.getTitle().equals(track.getTitle()) && t.getLength() == track.getLength()) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("Track not found in this CD");
            return;
        }
        tracks.remove(idx);
        System.out.println("Track removed: " + track.getTitle());
    }

    @Override
    public String toString() {
        return "CD[" + getId() + "] [" + (getTitle() != null ? getTitle() : "N/A") + "] [" + getCost() + "] [" + (getCategory() != null ? getCategory() : "N/A") + "] [" + totalLength() + "]" +
               "\nArtists: " + artists + "\nDirectors: " + directors + "\nTracks: " + tracks;
    }
}
