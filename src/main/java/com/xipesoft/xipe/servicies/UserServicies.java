package com.xipesoft.xipe.servicies;

import com.xipesoft.xipe.dto.UsersDto;
import com.xipesoft.xipe.entities.Profile;
import com.xipesoft.xipe.entities.Users;
import com.xipesoft.xipe.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServicies {
    @Autowired
    UsersRepository usersRepository;

    public UserServicies(UsersRepository usersRepository){

        this.usersRepository = usersRepository;
    }
/*
    public Users crearUser(UsersDto newUser) {
        Profile profile = new Profile();
        profile.setId(newUser.getProfile().getId());
        profile.setPhone(newUser.getProfile().getPhone());
        profile.setPassword(newUser.getProfile().getPassword());

        Users users = new Users();
        users.setEmail(newUser.getEmail());
        users.setProfile(profile);
        users.setCreatedAt(LocalDateTime.now());

        return this.usersRepository.save(users);
    }
*/
    public void crearyActualizarUser(Users users){
        usersRepository.save(users);
    }

    public List<Users> verUsers() {
        List<Users> users = new ArrayList<Users>();
        users.addAll(usersRepository.findAll());
        return users;
    }

    public void eliminarUser(Long id){

        usersRepository.deleteById(id);
    }
}
