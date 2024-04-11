package com.example.test.miscellaneous.service.stream_map;

import com.example.test.miscellaneous.controller.MiscellaneousTestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class StreamMapTest {
    private static final Logger logger = Logger.getLogger(StreamMapTest.class.getName());

    public String streamMapTestMethod(){
        String result="success";
        logger.info("log entry:streamMapTestMethod method");

        logger.info("==========================================================");
        //create lists of Address - start
        Address addressTypePermanent = new Address("permanent","fullAddrLine1");
        Address addressTypeResidential = new Address("residential","fullAddrLine2");
        Address addressTypeCorrespondence = new Address("correspondene","fullAddrLine3");

        Address address_1 = new Address();
        List<Address> addressList_1 = new ArrayList<Address>();
        addressList_1.add(addressTypePermanent);
        addressList_1.add(addressTypeResidential);

        List<Address> addressList_2 = new ArrayList<Address>();
        addressList_2.add(addressTypePermanent);
        addressList_2.add(addressTypeCorrespondence);

        List<Address> addressList_3 = new ArrayList<Address>();
        addressList_3.add(addressTypeResidential);
        addressList_3.add(addressTypeCorrespondence);

        //create lists of Address - end

        logger.info("==========================================================");
        //create lists of Employee - start
        Employee employee_1 = new Employee("Rohit",
                "Kumar",
                null,
                "09SEDF",
                "IT",23, 100000,addressList_1);

        Employee employee_2 = new Employee("Rohit2",
                "Kumar2",
                null,
                "09SEDG",
                "Accounts",32, 200000,addressList_3);

        Employee employee_3 = new Employee("Rohit3",
                "Kumar3",
                null,
                "09SEDH",
                "IT",29, 300000,addressList_1);
        Employee employee_4 = new Employee("Rohit4",
                "Kumar4",
                null,
                "09SEDI",
                "Administration",43, 700000,addressList_3);

        Employee employee_5 = new Employee("Rohit5",
                "Kumar5",
                null,
                "09SEDJ",
                "Accounts",25, 300000, addressList_2);

        Employee employee_6 = new Employee("Rohit6",
                "Kumar6",
                null,
                "09SEDK",
                "Administration",46,  400000, addressList_2);


        Employee employee_7 = new Employee("Rohit7",
                "Kumar",
                null,
                "09SEDF",
                "IT",23, 100000,addressList_1);

        Employee employee_8 = new Employee("Rohit8",
                "Kumar2",
                null,
                "09SEDG",
                "Accounts",32, 200000, addressList_3);

        Employee employee_9 = new Employee("Rohit9",
                "Kumar3",
                null,
                "09SEDH",
                "IT",29, 300000,addressList_1);
        Employee employee_10 = new Employee("Rohit10",
                "Kumar4",
                null,
                "09SEDI",
                "Administration",43, 700000, addressList_3);

        Employee employee_11 = new Employee("Rohit11",
                "Kumar5",
                null,
                "09SEDJ",
                "Accounts",25, 300000, addressList_2);

        Employee employee_12 = new Employee("Rohit12",
                "Kumar6",
                null,
                "09SEDK",
                "Administration",46,  400000, addressList_2);

        List<Employee> employeeList_1= new ArrayList<Employee>();
        employeeList_1.add(employee_1);
        employeeList_1.add(employee_2);
        employeeList_1.add(employee_3);
        employeeList_1.add(employee_4);
        employeeList_1.add(employee_5);
        employeeList_1.add(employee_6);

        List<Employee> employeeList_2= new ArrayList<Employee>();
        employeeList_2.add(employee_7);
        employeeList_2.add(employee_8);
        employeeList_2.add(employee_9);
        employeeList_2.add(employee_10);
        employeeList_2.add(employee_11);
        employeeList_2.add(employee_12);

        List<Employee> employeeList_3= new ArrayList<Employee>();
        employeeList_3.add(employee_1);
        employeeList_3.add(employee_8);
        employeeList_3.add(employee_3);
        employeeList_3.add(employee_10);
        employeeList_3.add(employee_5);
        employeeList_3.add(employee_12);
        //create lists of Employee - end

        logger.info("==========================================================");
        //create lists of Company - start
        Company company_1 = new Company("IBM",employeeList_1);
        Company company_2 = new Company("TCS",employeeList_2);
        Company company_3 = new Company("CTS",employeeList_3);


        List<Company> companyList_1= new ArrayList<Company>();
        companyList_1.add(company_1);
        companyList_1.add(company_2);
        companyList_1.add(company_2);

        //create lists of Company - end

        logger.info("printing employeeList_1 after its creation:");

        for(int i=0; i < employeeList_1.size(); i++){

            logger.info(" employeeList_1.get(i).getDepartment()=="+employeeList_1.get(i).getDepartment());
        }






        employeeList_1.stream()
                .filter(Objects::nonNull)
                .forEach(abc -> {
            if (abc.getDepartment().equalsIgnoreCase("Administration")) {
                abc.setDepartment("Administration2");
            }
            else {
                abc.setDepartment("XYZ");
            }
        });




        logger.info("====================================================");
        logger.info("printing employees after setting its department");
        for(int i=0; i < employeeList_1.size(); i++){

            logger.info(" employeeList_1.get(i).getDepartment()=="+employeeList_1.get(i).getDepartment());
        }


        logger.info("====================================================");
        List<Employee> employeeList_12= new ArrayList<Employee>();

        employeeList_12 =  employeeList_1.stream().
                filter(i -> i.getDepartment()
                        .equalsIgnoreCase("Administration2"))
                .collect(Collectors.toList());

        logger.info("printing employees after  getting department=Administration2");
        for(int i=0; i < employeeList_12.size(); i++){

            logger.info(" employeeList_12.get(i).getDepartment()=="+employeeList_12.get(i).getDepartment());
        }



        logger.info("====================================================");

        logger.info("printing employees after  sorting over department");

        employeeList_1.stream()
                .sorted((p1, p2)->p1.getDepartment()
                        .compareTo(p2.getDepartment()))
                .forEach(System.out::println);


        logger.info("====================================================");
        logger.info("printing employees after  sorting over age");
        employeeList_1.stream()
                .map(Employee::getAge)
                .sorted()
                .forEach(System.out::println);






        logger.info("====================================================");
        logger.info("get employees who have salary greater than 10000:");
        List<Employee> employeeList_11 =  employeeList_1.stream()
                .filter(e -> e.getSalary() > 10000)
                .collect(Collectors.toList());




        logger.info("====================================================");
        logger.info("print employees who have salary greater than 10000:");
        employeeList_1.stream().
                filter(e -> e.getSalary() > 10000)
                .forEach(System.out::println);




        logger.info("====================================================");
        logger.info("demo of stream.map over integer list");
        List<Integer> list1 = Arrays.asList(3, 6, 9, 12, 15);
        list1.stream()
                .map(number -> number * 3)
                .forEach(System.out::println);




        logger.info("====================================================");
        employeeList_1.stream()
                .flatMap( emp -> emp.getAddressList()
                        .stream()
                        .filter(addr -> addr.getAddrType().equalsIgnoreCase("permanent"))
                ).collect(Collectors.toList());

//listOfObjectA = listOfObjectA.stream().filter(a -> a.getListOfB().stream().anyMatch(b -> b.getId() == 10));


        logger.info("====================================================");

        List<Employee> employeeList_14 = employeeList_1.stream()
                .filter(emp -> emp.getAddressList()
                        .stream()
                        .allMatch(addr -> addr.getAddrType()
                                .equalsIgnoreCase("permanent")))
                .collect(Collectors.toList());


        logger.info("====================================================");
        List<Company> company_filteredList_1 = companyList_1.stream()
                .filter(company -> company.getEmployeeList()
                        .stream()
                        .allMatch(emp -> emp.getEmpId().equalsIgnoreCase("09SEDG")))
                .collect(Collectors.toList());






        return result;

    }
}
