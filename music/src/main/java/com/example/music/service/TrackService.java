package com.example.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.music.model.Track;
import com.example.music.repository.TrackRepository;
import java.util.List;

@Service
public class TrackService {

        @Autowired
            TrackRepository trkRepository;     
        // CREATE 
        public Track createTrack(Track trk) {
            return trkRepository.save(trk);
        }

        // READ
        public List<Track> getTracks() {
            return trkRepository.findAll();
        }

        // DELETE
        public void deleteTrack(Long trkId) {
            trkRepository.deleteById(trkId);
        }
        
        // UPDATE
        public Track updateTrack(Long trkId, Track trackDetails) {
                Track trk = trkRepository.findById(trkId).get();
                trk.setName(trackDetails.getName());
                trk.setGenre(trackDetails.getGenre());
                trk.setArtist(trackDetails.getArtist());
                trk.setDuration((long) trackDetails.getDuration());
                
                return trkRepository.save(trk);                                
        }
        
        // PATCH
        public Track fixTrack(Long Id, Track trackDetails) {
        		Track trk = trkRepository.findById(Id).get();
        		trk.setName(trackDetails.getName());
        		trk.setGenre(trackDetails.getGenre());
        		trk.setArtist(trackDetails.getArtist());
        		trk.setDuration((long) trackDetails.getDuration());
        		return trkRepository.save(trk);

        	}
        


}