package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Repository
@Transactional
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    Optional<User> findByLogin(String login);
    @Override
    Optional<User> findById(Long id);
    @Override
    User save(User user);

    void deleteUserById(Long id);
}
