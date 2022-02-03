package dk.KEA.mysomeapp.repo;

import dk.KEA.mysomeapp.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

@Configuration
public interface UserRepository extends CrudRepository<User,Long>  {
}
