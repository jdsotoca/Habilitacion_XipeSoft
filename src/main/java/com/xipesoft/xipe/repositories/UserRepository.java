package com.xipesoft.xipe.repositories;

import com.xipesoft.xipe.dto.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <UsersModel, Long>{

    Optional<UsersModel> findByProfileAndPassword (String profile, String password);

    Optional<UsersModel> findFirsByProfile(String profile);

}
