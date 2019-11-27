package controllers;

import daos.EmployeeDao;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;  
import java.util.List;
import models.Department;
import models.Employee;
import models.Job;
/**
 *
 * @author Elsa
 */
public class EmployeeController {
    private EmployeeDao dao;

    public EmployeeController() {
        this.dao = new EmployeeDao();
    }

    public EmployeeController(EmployeeDao dao) {
        this.dao = dao;
    }

    public List<Employee> getAll() {
        return this.dao.selectEmployess();
    }

    public String create( String firstname, String lastname,
            String email, String phone, String hire, String job, String salary,
            String commision, String manager, String department,String id) {
       
        
//            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
//            String dateInString=hire;
//            try {
//                Date date=dateFormat.parse(hire);
//                System.out.println(dateFormat.format(date));
//        } catch (Exception e) {
//            e.printStackTrace();;
//        }
         
//         return this.dao.createEmployee(new Employee(Integer.parseInt(id), 
//                 firstname, lastname, email, phone, hire, Integer.parseInt(salary), Integer.parseInt(commision)
//                 , new Employee(Integer.parseInt(manager)), new Job(job), new Department(Integer.parseInt(department))))
//                ? "Success to Create Employee" : "Failed to Create Employee";
return null;
    }
    public String update(String firstname, String lastname,
            String email, String phone, String hire, String job, String salary,
            String commision, String manager, String department,String id) {
       
//       SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
//            String dateInString=hire;
//            try {
//                Date date=dateFormat.parse(hire);
//                System.out.println(dateFormat.format(date));
//        } catch (Exception e) {
//            e.printStackTrace();;
//        }
        
//return this.dao.createEmployee(new Employee(Integer.parseInt(id), firstname, 
//                lastname, email, phone, hire, Integer.parseInt(salary), 
//                Integer.parseInt(commision), new Employee(Integer.parseInt(manager)), 
//                new Job(job), new Department(Integer.parseInt(department)))) 
//                ? "Success to Update Employee" : "Failed to Update Employee";
return null;
    }
    
    public String delete(String id){
        return this.dao.deleteEmployee(new Employee(Integer.parseInt(id))) ?
                "Success to Delete Employee" : "Failed to Delete Employee";
    }
    public Employee selectById(String id){
        return this.dao.selectById(Integer.parseInt(id));
               
    }
     public List<Employee> search(String key){
        return this.dao.searchEmployee(key);
    }

}
