package com.xipesoft.xipe.repositories;

import com.xipesoft.xipe.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository <Users,Long>{
}
