package com.ilogic.Repository;

import com.ilogic.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by gerry on 2017/2/28.
 */
    @Transactional
    public interface UserDao extends CrudRepository<User, Long> {

        /**
         * This method will find an User instance in the database by its email.
         * Note that this method is not implemented and its working code will be
         * automagically generated from its signature by Spring Data JPA.
         */
        public User findByEmail(String email);

    }
