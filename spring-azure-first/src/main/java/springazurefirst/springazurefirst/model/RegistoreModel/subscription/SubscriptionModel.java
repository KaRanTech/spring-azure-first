package springazurefirst.springazurefirst.model.RegistoreModel.subscription;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import springazurefirst.springazurefirst.constants.Subscription;
import springazurefirst.springazurefirst.model.RegistoreModel.RegistoreModel;

import java.sql.Timestamp;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionModel {
    @Id
    private String subId;
    private String userName;
    private RegistoreModel userDetails;
    private Subscription perk;
    private Timestamp subscibeData;
    private Timestamp subscriptionEdndata;
    private String price;
    private String status;

}
