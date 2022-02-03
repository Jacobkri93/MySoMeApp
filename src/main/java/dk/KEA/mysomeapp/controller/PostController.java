package dk.KEA.mysomeapp.controller;

import dk.KEA.mysomeapp.entity.Post;
import dk.KEA.mysomeapp.errors.NotFoundException;
import dk.KEA.mysomeapp.repo.PostRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

@RequestMapping("api/post")
public class PostController {

    PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

//    Get all the current posts!
    @GetMapping
    Iterable<Post> getAll() {
        return postRepository.findAll();
    }


    //Create a new post!
    @PostMapping()
    Post createPost (@RequestBody Post post){return postRepository.save(post);}

    //Read 1 post by ID
    @GetMapping("/{id}")
    Post getPost(@PathVariable("id") Long id) {
        return postRepository.findById(id).orElseThrow(() -> new NotFoundException("Post not found"));
    }

    //Update a post!
    @PutMapping("/{id}")
    Post editPost(@RequestBody Post post, @PathVariable("id") Long id) {
        Post p = postRepository.findById(id).get();
        p.setHashtag(post.getHashtag());
        p.setContent(post.getContent());
        return postRepository.save(p);
    }

    //Delete a post
    @DeleteMapping("/{id}")
    void deletePost(@PathVariable("id") Long id) {
        postRepository.deleteById(id);
    }
}
