package dk.KEA.mysomeapp.repo;

import dk.KEA.mysomeapp.entity.Post;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

@Configuration
public interface PostRepository extends CrudRepository<Post, Long> {
}
