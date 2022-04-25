package com.example.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.music.model.Track;
import com.example.music.service.TrackService;

@RestController
@RequestMapping("/api")
public class TrackController {
        @Autowired
        TrackService trkService;
        
        @PostMapping("/music")
        public Track createTrack(@RequestBody Track trk) {
            return trkService.createTrack(trk);
        }
        
        @GetMapping("/music")
        public List<Track> readTrack() {
            return trkService.getTracks();
        }

        @PutMapping("/music/{trkId}")
        public Track readTrack(@PathVariable(value = "trkId") Long id, @RequestBody Track trkDetails) {
            return trkService.updateTrack(id, trkDetails);
        }
        
        @PatchMapping("/music/{trkId}")
        public Track fixTrack(@PathVariable(value = "trkId") Long id, @RequestBody Track trkDetails) {
            return trkService.fixTrack(id, trkDetails);
        }

        @DeleteMapping("/music/{trkId}")
        public void deleteTracks(@PathVariable(value = "trkId") Long id) {
            trkService.deleteTrack(id);
        }


}

