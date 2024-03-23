package springazurefirst.springazurefirst.service;


import org.springdoc.api.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springazurefirst.springazurefirst.constants.Subscription;
import springazurefirst.springazurefirst.model.RegistoreModel.subscription.SubscriptionModel;
import springazurefirst.springazurefirst.repository.SubscriptionInterface;


import java.util.*;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionInterface subscriptionInterface;

    public ResponseEntity<SubscriptionModel> subscribe(SubscriptionModel model){
        if(perkValidation(model.getPerk())) {
            model.setSubId(UUID.randomUUID().toString());
            model.getUserDetails().setId(UUID.randomUUID());
            subscriptionInterface.save(model);
            return  ResponseEntity.status(HttpStatus.OK).body(model);
        }
        ErrorMessage errorMessage = new ErrorMessage("In valid Perk");
     return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(model);
    }

    private boolean perkValidation(Subscription perk){
        List<Subscription> list = new ArrayList<Subscription>(EnumSet.allOf(Subscription.class));
        if(list.contains(perk.getName())){
        return  true;
        }
        return false;
    }
}