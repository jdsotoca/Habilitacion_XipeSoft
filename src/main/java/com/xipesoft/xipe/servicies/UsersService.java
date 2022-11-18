package com.xipesoft.xipe.servicies;

import com.xipesoft.xipe.dto.UsersModel;
import com.xipesoft.xipe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private final UserRepository userRepository;

    public UsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UsersModel registerUser(String profile, String password, String email){
        if (profile == null || password == null ) {
            return null;
        } else {
            if(userRepository.findFirsByProfile(profile).isPresent()){
                System.out.println("Duplicate profile");
                return null;

            }

            UsersModel usersModel = new UsersModel();
            usersModel.setProfile(profile);
            usersModel.setPassword(password);
            usersModel.setEmail(email);
            return userRepository.save(usersModel);
        }

    }

    public UsersModel authenticate(String profile,String password) {
        return userRepository.findByProfileAndPassword(profile, password).orElse(null);
    }


}
