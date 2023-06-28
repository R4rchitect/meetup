package com.teamra.hexagonalapp.infrastructure.persistence.jpa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IH2JPAUserRepository extends CrudRepository<UserEntity, Integer> {
    
    @Query(value="SELECT * FROM usuarios where id_usuario = :id_usuario", nativeQuery=true)
    UserEntity findByIdUser(@Param("id_usuario") Integer id);

}
