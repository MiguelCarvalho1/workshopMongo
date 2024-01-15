package com.miguel.workshopmongo.services;


import java.util.Optional;

import com.miguel.workshopmongo.domain.Post;
import com.miguel.workshopmongo.repository.PostRepository;
import com.miguel.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}