package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {

    private List<Song> list = new ArrayList<>();

    public SongRepository() {
        // músicas iniciais
        list.add(new Song(1, "Bohemian Rhapsody", "Queen",
                "A Night at the Opera", "1975"));
        list.add(new Song(2, "Imagine", "John Lennon",
                "Imagine", "1971"));
    }

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        if (id == null) {
            return null;
        }
        return list.stream()
                .filter(song -> id.equals(song.getId()))
                .findFirst()
                .orElse(null);
    }

    public void addSong(Song s) {
        if (s == null) {
            return;
        }
        list.add(s);
    }

    public void updateSong(Song s) {
        if (s == null || s.getId() == null) {
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            Song current = list.get(i);
            if (s.getId().equals(current.getId())) {
                list.set(i, s);
                return;
            }
        }
    }

    public void removeSong(Song s) {
        if (s == null || s.getId() == null) {
            return;
        }
        list.removeIf(song -> s.getId().equals(song.getId()));
    }
}