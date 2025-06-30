package com.codewithmosh.store.services;

import com.codewithmosh.store.entities.User;
import com.codewithmosh.store.repositories.ProfileRepository;
import com.codewithmosh.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final EntityManager entityManager;
    private final ProfileRepository profileRepository;

    @Transactional
    public void showEntityStates(){
        var user = User.builder().name("panos").email("panos@test").password("1234").build();

        if(entityManager.contains(user)){
            System.out.println("Persistent");
        }
        else{
            System.out.println("Transient or Detached");
        }

        userRepository.save(user);

        if(entityManager.contains(user)){
            System.out.println("Persistent");
        }
        else{
            System.out.println("Transient or Detached");
        }
    }

    @Transactional
    public void showRelatedEntites(){
        //var user = userRepository.findById(2L).orElseThrow();
        var profile = profileRepository.findById(2L).orElseThrow();
        System.out.println(profile.getUser().getEmail());
    }
}
