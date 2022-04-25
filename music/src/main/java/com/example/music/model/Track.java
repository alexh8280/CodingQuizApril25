package com.example.music.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "track")
public class Track {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="trk_id")
            private Long id;
        
        @Column(name="name")
        private String name;
        
        @Column(name="genre")
        private String genre;
        
        @Column(name="artist")
        private String artist;
        
        @Column(name="duration")
        private long durationInSeconds;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public float getDuration() {
			return durationInSeconds;
		}

		public void setDuration(long durationInSeconds) {
			this.durationInSeconds = durationInSeconds;
		}
        
        
}

		
        
