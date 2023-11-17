package application.repository;

import org.springframework.data.repository.CrudRepository;
import application.model.User;

public interface UserRepository extends CrudRepository<User,long> {
    public User findByUsername(String username);
    
}