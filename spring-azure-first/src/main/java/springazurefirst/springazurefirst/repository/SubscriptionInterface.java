package springazurefirst.springazurefirst.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import springazurefirst.springazurefirst.model.RegistoreModel.subscription.SubscriptionModel;

@Repository
public interface SubscriptionInterface extends MongoRepository<SubscriptionModel,Long> {

}
