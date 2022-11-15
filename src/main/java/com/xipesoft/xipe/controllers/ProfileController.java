package com.xipesoft.xipe.controllers;


import com.xipesoft.xipe.dto.ProfileDto;
import com.xipesoft.xipe.entities.Profile;
import com.xipesoft.xipe.servicies.ProfileServicies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProfileController {
    @Autowired
    ProfileServicies profileServicies;

    public ProfileController(ProfileServicies profileServicies){
        this.profileServicies = profileServicies;
    }

    @PostMapping("/perfil/crear")
    public ResponseEntity<Profile> crearProfile(@RequestBody ProfileDto profile){
        Profile response = profileServicies.crearProfile(profile);
        if (response == null){
            return ResponseEntity.badRequest().body(response);
        }
        return  ResponseEntity.ok().body(response);
    }

}
