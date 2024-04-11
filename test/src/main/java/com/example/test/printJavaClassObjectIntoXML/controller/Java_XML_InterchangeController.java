package com.example.test.printJavaClassObjectIntoXML.controller;


import com.example.test.printJavaClassObjectIntoJson.controller.ContractServiceController;
import com.example.test.printJavaClassObjectIntoXML.dao.Author;
import com.example.test.printJavaClassObjectIntoXML.dao.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringWriter;
import java.util.logging.Level;


@RequestMapping("api/v1/java-xml-interchangeController")
@RestController
public class Java_XML_InterchangeController {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ContractServiceController.class.getName());


    @RequestMapping(value = "/java-object-to-xml", method= RequestMethod.GET)
    //public void addPerson2_returnsPerson(@Valid @NotNull @RequestBody ModifyContractRequest modifyContractRequest) {
    //public void addPerson2_returnsPerson(ModifyContractRequest modifyContractRequest) {
    public Book javaObjectToXml_marshalling() {
        logger.info("logentry javaObjectToXml_marshalling  method");

        // create `Book` object
        Book book = new Book(17L, "Head First Java", "ISBN-45565-45",
                new Author(5L, "Bert", "Bates"));

        try {
            // create an instance of `JAXBContext`
            JAXBContext context = JAXBContext.newInstance(Book.class);

            // create an instance of `Marshaller`
            Marshaller marshaller = context.createMarshaller();

            // enable pretty-print XML output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // write XML to `StringWriter`
            StringWriter sw = new StringWriter();

            // convert book object to XML
            marshaller.marshal(book, sw);

            // print the XML
            logger.info("book xml==" + sw.toString());

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }

        logger.info("logExit javaObjectToXml_marshalling  method");
        return book;

    }
























    @RequestMapping(value = "/xml-to-java-object", method= RequestMethod.GET)
    //public void addPerson2_returnsPerson(@Valid @NotNull @RequestBody ModifyContractRequest modifyContractRequest) {
    //public void addPerson2_returnsPerson(ModifyContractRequest modifyContractRequest) {
    public Book xmlTojavaObject_unmarshalling() {
        logger.info("logentry xmlTojavaObject_unmarshalling  method");

        Book book = null;
        try {
            // create an instance of `JAXBContext`
            JAXBContext context = JAXBContext.newInstance(Book.class);

            // create an instance of `Unmarshaller`
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // XML file path
            File file = new File("C:\\1nOS\\installedFiles\\Intellij_IDEA\\1_testPRJ\\1_myFiles\\5_xmlFiles\\Book.xml");
            //String bookXmlString = null;

            // convert XML file to `Book` object
            book = (Book) unmarshaller.unmarshal(file);


            // print book object
            //System.out.println(book);
            logger.info("book java object = "+ book);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
        logger.info("logExit xmlTojavaObject_unmarshalling  method");
        return book;

    }
}
