package com.example.test.printJavaClassObjectIntoJson.controller;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.test.printJavaClassObjectIntoJson.dao.Address;
import com.example.test.printJavaClassObjectIntoJson.dao.ModifyContractRequest;
import com.example.test.printJavaClassObjectIntoJson.dao.PartyName;
import com.example.test.printJavaClassObjectIntoJson.dao.ResponseCode;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;

@RequestMapping("api/v1/modify-contract")
@RestController
public class ContractServiceController {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ContractServiceController.class.getName());

     //public  ModifyContractRequest modifyContractRequest;

    //@Autowired
    //ModifyContractRequest modifyContractRequest;






    //@PostMapping("/print-modifycontract-bo")
    @RequestMapping(value = "/print-modifycontract-bo", method= RequestMethod.GET)
    //public void addPerson2_returnsPerson(@Valid @NotNull @RequestBody ModifyContractRequest modifyContractRequest) {
    //public void addPerson2_returnsPerson(ModifyContractRequest modifyContractRequest) {
    public ModifyContractRequest printModifyContractRequest() {
        logger.info("logentry print-modifycontract-bo url  method");



        PartyName partyName = new PartyName();
        partyName.setFirstName("Shaun");
        partyName.setLastName("Peterson");
        partyName.setMiddleName("Azoulay");

        Address address = new Address();
        address.setAddressLine1("address line 1");
        address.setAddressLine2("address line 2");
        address.setAddressLine3("address line 3");
        address.setCity("Pune");
        address.setCountry("India");
        address.setState("MH");
        address.setCountry("India");
        address.setZipcode("456324");

        ResponseCode responseCode = new ResponseCode();
        responseCode.setSuccess("S");
        responseCode.setResponseCode("RC_0");

        ModifyContractRequest modifyContractRequest = new ModifyContractRequest();
        modifyContractRequest.setName(partyName);
        modifyContractRequest.setAddress(address);
        modifyContractRequest.setResponseCode(responseCode);
        modifyContractRequest.setA("ValueOf__A");
        modifyContractRequest.setB("ValueOf__B");


        logger.info("print modifyContractRequest using ToStringBuilder of apache commons library----start");
        logger.info("modifyContractRequest.toJson()=" + modifyContractRequest.toJson());
        logger.info("--------------------------------------------------------------------------------------------");
        logger.info("--------------------------------------------------------------------------------------------");
        logger.info("--------------------------------------------------------------------------------------------");
        logger.info("modifyContractRequest.toString()=" + modifyContractRequest.toString());
        logger.info("print modifyContractRequest using ToStringBuilder of apache commons library----end");




        logger.info("print modifyContractRequest using jackson jar files----start");

        //working fine
        ObjectMapper mapper = new ObjectMapper();
        try {
            String modifyContractRequestJsonUsingJackson = mapper.writeValueAsString(modifyContractRequest);
            logger.info("modifyContractRequestJsonUsingJackson==" + modifyContractRequestJsonUsingJackson);
        } catch (Exception e) {
            //logger.log("An error to convert object to json" );
            logger.log(Level.SEVERE,"An error to convert object to json");


        }
        logger.info("print modifyContractRequest using jackson jar files----end");

        logger.info("logexit print-modifycontract-bo url  method");
        return modifyContractRequest;


    }



}
