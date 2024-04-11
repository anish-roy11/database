package com.example.test.oracleDBComplexQuery.test2.service;


import com.example.test.oracleDBComplexQuery.test2.controller.Test2Controller;
import com.example.test.oracleDBComplexQuery.test2.entity.*;
import com.example.test.oracleDBComplexQuery.test2.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class Test2Service {

    private static final Logger logger = Logger.getLogger(Test2Service.class.getName());

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    StudentsRepository studentsRepository;

    @Autowired
    LaptopRepository laptopRepository;

    @Autowired
    Students2Repository students2Repository;

    @Autowired
    Laptop2Repository laptop2Repository;

    @Autowired
    PartyPersonRepository partyPersonRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    Product2Repository product2Repository;


    public String oneToOneMappingDemo()
    {
        logger.info("log entry:/oneToOneMappingDemo  method");
        String result="success";
        Student student = new Student();
        student.setStudentId(101);
        student.setStudentName("Pawan");
        student.setAbout("about1");

        Laptop laptop = new Laptop();
        laptop.setLaptopId(1001);
        laptop.setBrand("lenovo");
        laptop.setModelNumber("W520");

        student.setLaptop2(laptop);

        studentsRepository.save(student);
        logger.info("log exit:/oneToOneMappingDemo  method");

        return result;
    }





    public String oneToOneMappingWithJoiningTableDemo()
    {
        logger.info("log entry:/oneToOneMappingWithJoiningTableDemo  method");
        String result="success";
        Student2 student2 = new Student2();
        student2.setStudent2Id(101);
        student2.setStudentName("Pawan");
        student2.setAbout("about1");

        Laptop2 laptop2 = new Laptop2();
        laptop2.setLaptop2Id(1001);
        laptop2.setBrand("lenovo");
        laptop2.setModelNumber("W520");

        student2.setLaptop2(laptop2);

        students2Repository.save(student2);
        logger.info("log exit:/oneToOneMappingWithJoiningTableDemo  method");

        return result;
    }



    public String oneToManyMappingDemo()
    {
        logger.info("log entry:/oneToManyMappingDemo  method");
        String result="success";

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setPartyPersonId(190876);
        partyPerson1.setFName("Pawan");
        partyPerson1.setLName("Kumar");
        partyPerson1.setSex("M");


        PartyPerson partyPerson2 = new PartyPerson();
        partyPerson2.setPartyPersonId(190876);
        partyPerson2.setFName("Deepika");
        partyPerson2.setLName("Kumari");
        partyPerson2.setSex("F");


        Address address1 = new Address();
        address1.setAddressId(1001);
        address1.setAddrLine1("addrLine1");
        address1.setAddrLine2("fdfdf");
        address1.setAddrLine3("fsff");
        address1.setCity("lucknow");
        address1.setCountry("IND");
        address1.setState("MH");
        address1.setPartyPersonObj(partyPerson1);


        Address address2 = new Address();
        address2.setAddressId(1002);
        address2.setAddrLine1("addrLin1");
        address2.setAddrLine2("kharadi");
        address2.setAddrLine3("chandan");
        address2.setCity("pune");
        address2.setCountry("IND");
        address2.setState("MH");
        address2.setPartyPersonObj(partyPerson1);


        List<Address> addrList1 = new ArrayList<Address>();
        addrList1.add(address1);
        addrList1.add(address2);


        partyPerson1.setAddressList1(addrList1);
        partyPersonRepository.save(partyPerson1);



        logger.info("log exit:/oneToManyMappingDemo  method");

        return result;
    }








    public String manyToManyMappingDemo()
    {
        logger.info("log entry:/manyToManyMappingDemo  method");
        String result="success";

        Product product1 = new Product();
        product1.setProductId(10001);
        product1.setProductName("iPhone 12");
        product1.setProductType("Phone");
        product1.setProductDescription("Phone-iphone");


        Product product2 = new Product();
        product2.setProductId(10002);
        product2.setProductName("lenovo T450");
        product2.setProductType("Laptop");
        product2.setProductDescription("Laptop");

        Product product3 = new Product();
        product3.setProductId(10003);
        product3.setProductName("One Plus 9");
        product3.setProductType("Phone");
        product3.setProductDescription("Phone-One-plus");


        Product product4 = new Product();
        product4.setProductId(10004);
        product4.setProductName("HP Pavilion");
        product4.setProductType("Laptop");
        product4.setProductDescription("HP Pavilion high performance");



        Category category1 = new Category();
        category1.setCategoryId(1001);
        category1.setCategoryName("Electronics");
        category1.setCategoryDescription("Electronics items - phone");


        Category category2 = new Category();
        category2.setCategoryId(1002);
        category2.setCategoryName("Electrical");
        category2.setCategoryDescription("Laptop");


        Category category3 = new Category();
        category3.setCategoryId(1001);
        category3.setCategoryName("Electronics");
        category3.setCategoryDescription("Electronics items - phone");


        Category category4 = new Category();
        category4.setCategoryId(1002);
        category4.setCategoryName("Electrical");
        category4.setCategoryDescription("Laptop");


        List<Category> categoryList1 = new ArrayList<Category>();
        categoryList1.add(category1);
        categoryList1.add(category2);
        product1.setCategoryObjList1(categoryList1);

        List<Category> categoryList2 = new ArrayList<Category>();
        categoryList2.add(category3);
        categoryList2.add(category4);
        product2.setCategoryObjList1(categoryList2);


        List<Product> productList1 = new ArrayList<Product>();
        productList1.add(product1);
        productList1.add(product2);
        category1.setProductObjList1(productList1);

        List<Product> productList2 = new ArrayList<Product>();
        productList2.add(product3);
        productList2.add(product4);
        category2.setProductObjList1(productList2);

        productRepository.save(product1);
        productRepository.save(product2);

        logger.info("log exit:/manyToManyMappingDemo  method");

        return result;
    }








    public String manyToManyMappingUsingJoinTableDemo()
    {
        logger.info("log entry:/manyToManyMappingUsingJoinTableDemo  method");
        String result="success";

        Product2 product2Obj1 = new Product2();
        product2Obj1.setProduct2Id(10001);
        product2Obj1.setProduct2Name("iPhone 12");
        product2Obj1.setProduct2Type("Phone");
        product2Obj1.setProduct2Description("Phone-iphone");


        Product2 product2Obj2 = new Product2();
        product2Obj2.setProduct2Id(10002);
        product2Obj2.setProduct2Name("lenovo T450");
        product2Obj2.setProduct2Type("Laptop");
        product2Obj2.setProduct2Description("Laptop");

        Product2 product2Obj3 = new Product2();
        product2Obj3.setProduct2Id(10003);
        product2Obj3.setProduct2Name("One Plus 9");
        product2Obj3.setProduct2Type("Phone");
        product2Obj3.setProduct2Description("Phone-One-plus");

        Product2 product2Obj4 = new Product2();
        product2Obj4.setProduct2Id(10004);
        product2Obj4.setProduct2Name("HP Pavilion");
        product2Obj4.setProduct2Type("Laptop");
        product2Obj4.setProduct2Description("HP Pavilion high performance");



        Category2 category2Obj1 = new Category2();
        category2Obj1.setCategory2Id(1001);
        category2Obj1.setCategory2Name("Electronics");
        category2Obj1.setCategory2Description("Electronics items - phone");


        Category2 category2Obj2 = new Category2();
        category2Obj2.setCategory2Id(1002);
        category2Obj2.setCategory2Name("Electrical");
        category2Obj2.setCategory2Description("Laptop");


        Category2 category2Obj3 = new Category2();
        category2Obj3.setCategory2Id(1001);
        category2Obj3.setCategory2Name("Electronics");
        category2Obj3.setCategory2Description("Electronics items - phone");


        Category2 category2Obj4 = new Category2();
        category2Obj4.setCategory2Id(1002);
        category2Obj4.setCategory2Name("Electrical");
        category2Obj4.setCategory2Description("Laptop");


        List<Category2> category2List1 = new ArrayList<Category2>();
        category2List1.add(category2Obj1);
        category2List1.add(category2Obj2);
        product2Obj1.setCtgry2ObjList1(category2List1);

        List<Category2> category2List2 = new ArrayList<Category2>();
        category2List2.add(category2Obj3);
        category2List2.add(category2Obj4);
        product2Obj2.setCtgry2ObjList1(category2List2);


        List<Product2> product2List1 = new ArrayList<Product2>();
        product2List1.add(product2Obj1);
        product2List1.add(product2Obj2);
        category2Obj1.setPrd2ObjList1(product2List1);

        List<Product2> product2List2 = new ArrayList<Product2>();
        product2List2.add(product2Obj3);
        product2List2.add(product2Obj4);
        category2Obj2.setPrd2ObjList1(product2List2);

        product2Repository.save(product2Obj1);
        product2Repository.save(product2Obj2);

        logger.info("log exit:/manyToManyMappingUsingJoinTableDemo  method");

        return result;
    }
}
