package com.xipesoft.xipe.servicies;

import com.xipesoft.xipe.dto.ProfileDto;
import com.xipesoft.xipe.entities.Profile;
import com.xipesoft.xipe.entities.Users;
import com.xipesoft.xipe.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

//Notación para indicar que es un servicio
@Service

public class ProfileServicies {

    //Inyección de dependecias (crea una instancia cuando lo requiera)
    @Autowired

    ProfileRepository profileRepository;

    public ProfileServicies(ProfileRepository profileRepository){

        this.profileRepository = profileRepository;
    }
    public Profile crearProfile(ProfileDto nuevoProfile){
        Users users = new Users();
        users.setId(nuevoProfile.getUsers().getId());
        users.setEmail(nuevoProfile.getUsers().getEmail());

        Profile profile = new Profile();
        profile.setPhone(nuevoProfile.getPhone());
        profile.setPassword(nuevoProfile.getPassword());
        profile.setUsers(users);
        profile.setCreatedAt(LocalDateTime.now());
        return this.profileRepository.save(profile);
    }
    public List<Profile> listaProfile(){
        return profileRepository.findAll();
    }
    public Optional<Profile> getProfile(Long id){
        return profileRepository.findById(id);
    }
    public void borrarProfile(Long id){
        profileRepository.deleteById(id);
    }
}
