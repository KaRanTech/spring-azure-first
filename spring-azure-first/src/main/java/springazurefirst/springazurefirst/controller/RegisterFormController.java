package springazurefirst.springazurefirst.controller;

import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springazurefirst.springazurefirst.model.RegistoreModel.RegistoreModel;
import springazurefirst.springazurefirst.service.RegisterFormService;


@RestController
@RequestMapping("/registerform")
@Slf4j
public class RegisterFormController {
    Logger logger = LoggerFactory.getLogger(RegisterFormController.class);

    @Autowired
    private RegisterFormService regiService;

    @PostMapping("/register")
    public String newRegisterForm(@RequestBody RegistoreModel model) throws JsonProcessingException {
        logger.info("Save the Registore Model");
        return regiService.newRegisterForm(model);
    }

    @GetMapping("/{userName}")
    public ResponseEntity<RegistoreModel> getUser(@PathVariable String userName){
      return regiService.getUserInfo(userName);
    }
}
