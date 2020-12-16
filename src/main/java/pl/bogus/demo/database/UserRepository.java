package pl.bogus.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bogus.demo.model.User;

public interface UserRepository  extends JpaRepository<User,Long> {
}
