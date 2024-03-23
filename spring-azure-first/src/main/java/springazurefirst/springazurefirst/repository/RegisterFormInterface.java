package springazurefirst.springazurefirst.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import springazurefirst.springazurefirst.model.RegistoreModel.RegistoreModel;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RegisterFormInterface extends MongoRepository<RegistoreModel, UUID> {

    boolean existsByUserName(String name);
    Optional<RegistoreModel> findByUserName(String name);


}
