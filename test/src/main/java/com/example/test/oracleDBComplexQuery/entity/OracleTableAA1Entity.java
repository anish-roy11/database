package com.example.test.oracleDBComplexQuery.entity;



import javax.persistence.*;

/*

import com.example.test.oracleDBComplexQuery.impl.OracleEmployeeService;
import com.example.test.oracleDBComplexQuery.repository.OracleTableAA1Repository;
import com.example.test.oracleDBComplexQuery.repository.OracleTableBB1Repository;
import com.example.test.oracleDBComplexQuery.repository.OracleTableCC1Repository;
import com.example.test.oracleDBComplexQuery.controller.OracleDBController;
import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.sql.Time;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder



@NamedNativeQueries({

        @NamedNativeQuery(name="query1",query="select * from tableA a, tableB b where b.buId=:businessUnitId"),
        @NamedNativeQuery(name="query2",query="select * from tableA a, tableC c where c.buId=:businessUnitId")
})

 */


@Entity
@Table(name="TABLE_AA1")
public class OracleTableAA1Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TAB_A_ID")
    private String tabA_id;

    @Column(name = "CARID")
    private String carId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "ACTION")
    private String action;

    public String getTabA_id() {
        return tabA_id;
    }

    public void setTabA_id(String tabA_id) {
        this.tabA_id = tabA_id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "OracleTableAA1Entity{" +
                "tabA_id='" + tabA_id + '\'' +
                ", carId='" + carId + '\'' +
                ", status='" + status + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
