package springazurefirst.springazurefirst.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springazurefirst.springazurefirst.model.RegistoreModel.subscription.SubscriptionModel;
import springazurefirst.springazurefirst.service.SubscriptionService;


@RestController
@RequestMapping("/subscription")
public class SubscriptionController {

    @Autowired
    private SubscriptionService service;

    @PostMapping("/subscribe")
    public ResponseEntity<SubscriptionModel>
                 subscribe(@RequestBody SubscriptionModel model){
        return service.subscribe(model);
    }
}
