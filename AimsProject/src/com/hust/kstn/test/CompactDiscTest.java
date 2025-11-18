package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

import java.util.ArrayList;
import java.util.List;

public class CompactDiscTest {
    public static void main(String[] args) {
        List<Track> initialTracks = new ArrayList<>();
        initialTracks.add(new Track("Intro", 60));
        initialTracks.add(new Track("Main Theme", 180));

        CompactDisc cd = new CompactDisc("Greatest Hits", "Music", 12.99, null, null, initialTracks);

        System.out.println("-- CD info --");
        System.out.println(cd);

        System.out.println("Total length: " + cd.totalLength());

        System.out.println("\n-- Add a new track --");
        Track t1 = new Track("Bonus Track", 200);
        cd.addTrack(t1);
        System.out.println(cd);

        System.out.println("\n-- Try adding duplicate track --");
        cd.addTrack(new Track("Bonus Track", 200));

        System.out.println("\n-- Remove a track --");
        cd.removeTrack(t1);
        System.out.println(cd);

        System.out.println("\n-- Try removing non-existing track --");
        cd.removeTrack(new Track("Nope", 10));

        System.out.println("\n-- Add a track with zero length (edge) --");
        Track zero = new Track("Silent", 0);
        cd.addTrack(zero);
        System.out.println(cd);
    }
}
