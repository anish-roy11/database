package com.example.test.oracleDBComplexQuery.impl;


import com.example.test.database.entity.EmployeeEntity;
import com.example.test.database.impl.EmployeeService;
import com.example.test.database.repository.EmployeeRepository;
import com.example.test.oracleDBComplexQuery.entity.OracleTableAA1Entity;
import com.example.test.oracleDBComplexQuery.entity.StudentEntity;
import com.example.test.oracleDBComplexQuery.repository.OracleTableAA1Repository;
import com.example.test.oracleDBComplexQuery.repository.OracleTableBB1Repository;
import com.example.test.oracleDBComplexQuery.repository.OracleTableCC1Repository;
import com.example.test.oracleDBComplexQuery.entity.OracleEmployeeEntity;
import com.example.test.oracleDBComplexQuery.controller.OracleDBController;
import com.example.test.oracleDBComplexQuery.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class OracleDBService {

    //@Autowired
    //OracleEmployeeRepository oracleEmployeeRepository;

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    OracleTableAA1Repository oracleTableAA1Repository;

    @Autowired
    StudentRepository studentRepository;


    private static final Logger logger = Logger.getLogger(OracleDBService.class.getName());

    public List<Object[]> getComplexQueryResult() {
        logger.info("logEntry:getComplexQueryResult method");

        //List<Object> resultSet = null;

        String facilityId = "101";
        String complexQuery =  "select a.CARID, a.status, a.action, "+
                                  "b.FACILITY_REF_NUMBER, b.FACILITY_ID, "+
                                  "c.FACILITY_TYPE " +
                               "from SYSTEM.TABLE_AA1 a, SYSTEM.TABLE_BB1 b, SYSTEM.TABLE_CC1 c "+
                               //"where a.CARID = b.CARID and b.FACILITY_ID = c.FACILITY_ID "+
                               "where a.CARID = b.CARID and b.FACILITY_ID = c.FACILITY_ID "+
                                  "and c.FACILITY_ID = :facilityId"  ;
                //"and c.FACILITY_ID =" + facilityId + "";

        logger.info("complexQuery===" + complexQuery);
        logger.info("facilityId===101");

        Query queryResultSubWorkflow = entityManager.createNativeQuery(complexQuery);
        queryResultSubWorkflow.setParameter("facilityId","101");
        List<Object[]> resultSet = queryResultSubWorkflow.getResultList();


        logger.info("after fetching result set");
        logger.info("result set size= "+ resultSet.size());
        resultSet.forEach(System.out :: println);
        for(int i=0; i < resultSet.size(); i++)
        {
            logger.info(" ");
            logger.info(" ");
            logger.info("i=="+ i);
            Object[] obj = resultSet.get(i);
            logger.info("obj[0]==" + obj[0]);
            logger.info("obj[1]==" + obj[1]);
            logger.info("obj[2]==" + obj[2]);
            logger.info("obj[3]==" + obj[3]);
            logger.info("obj[4]==" + obj[4]);
            logger.info("obj[5]==" + obj[5]);
        }

        logger.info("logExit:getComplexQueryResult method");
        return resultSet;
    }






    public List<OracleTableAA1Entity> getOracleTableAA1Entity() {
        logger.info("logEntry:getOracleTableAA1Entity method");

        List<OracleTableAA1Entity> oracleTableAA1EntityList2 = oracleTableAA1Repository.findAll();
        logger.info("oracleTableAA1EntityList2.size=="+oracleTableAA1EntityList2.size());
        oracleTableAA1EntityList2.forEach(System.out :: println);

        logger.info("logExit:getOracleTableAA1Entity method");
        return oracleTableAA1EntityList2;
    }






    public StudentEntity createStudent(StudentEntity student) {
        logger.info("logEntry:createStudent method");
        StudentEntity std = null;
        String result=null;
        try{
            std = studentRepository.save(student);
        }catch(Exception ex)
        {
                logger.info("logEntry:catch block of deleteStudent method");
                ex.printStackTrace();
                result = ex.toString() + ":" + ex.getMessage() + ":" + ex.getStackTrace().toString();
        }

        logger.info("logExit:createStudent method");
        return std;
    }



    public List<StudentEntity> getStudents() {
        logger.info("logEntry:getStudents method");
        List<StudentEntity> studentEntityList = studentRepository.findAll();

        logger.info("studentEntityList.size=="+studentEntityList.size());
        studentEntityList.forEach(System.out :: println);
        logger.info("logExit:getStudents method");
        return studentEntityList;
    }





    public StudentEntity updateStudent(StudentEntity studentEntity) {
        logger.info("logEntry:updateStudent method");
        logger.info("studentEntity.getTableid()="+studentEntity.getTableid());
        logger.info("studentEntity.getFirstname()="+studentEntity.getFirstname());
        logger.info("studentEntity.getLastname()="+studentEntity.getLastname());
        logger.info("studentEntity.getRollno()="+studentEntity.getRollno());
        logger.info("studentEntity.getGender()="+studentEntity.getGender());
        Optional<StudentEntity> studentEntity2 = studentRepository.findById(studentEntity.getTableid());
        StudentEntity studentEntity3 = new StudentEntity();
        if(null != studentEntity2.get())
        {
            logger.info("logentry:if(null != studentEntity2.get())");
            studentEntity3.setTableid(studentEntity.getTableid());
            studentEntity3.setFirstname(studentEntity.getFirstname());
            studentEntity3.setLastname(studentEntity.getLastname());
            studentEntity3.setGender(studentEntity.getGender());
            studentEntity3.setRollno(studentEntity.getRollno());
            studentEntity3 = studentRepository.save(studentEntity3);
        }


        logger.info("logExit:updateStudent method");
        return studentEntity3;
    }






    public String deleteStudent(StudentEntity studentEntity) {
        logger.info("logEntry:deleteStudent method");
        StudentEntity studentEntity3 = new StudentEntity();
        String result = null;
        try{

//        logger.info("studentEntity.getTableid()="+studentEntity.getTableid());
//        logger.info("studentEntity.getFirstname()="+studentEntity.getFirstname());
//        logger.info("studentEntity.getLastname()="+studentEntity.getLastname());
//        logger.info("studentEntity.getRollno()="+studentEntity.getRollno());
//        logger.info("studentEntity.getGender()="+studentEntity.getGender());
            Optional<StudentEntity> studentEntity2 = studentRepository.findById(studentEntity.getTableid());

            if(null != studentEntity2.get())
            {
                studentEntity3 = studentEntity2.get();
                logger.info("logentry:if(null != studentEntity2.get())");
                studentRepository.delete(studentEntity3);
                result = "Student deleted successfully";
            }
            else
            {
                result = "Student not found";
            }
        }catch(Exception ex)
        {
            logger.info("logEntry:catch block of deleteStudent method");
            ex.printStackTrace();
            result = ex.toString() + ":" + ex.getMessage() + ":" + ex.getStackTrace().toString();
        }


        logger.info("logExit:deleteStudent method");
        return result;
    }

}
