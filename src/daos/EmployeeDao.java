package daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import models.Department;
import models.Employee;
import models.Job;
import tools.Connections;

/**
 *
 * @author Elsa
 */
public class EmployeeDao {
private Connection connection;

    public EmployeeDao() {
        this.connection = new Connections().getConnection();
    }

    public EmployeeDao(Connection connection) {
        this.connection = connection;
    }
    Job job=new Job();

    public List<Employee> selectEmployess() {
        List<Employee> employees = new ArrayList<>();
        String query = "select\n"
                + "e.employee_id,  \n"
                + "e.first_name, e.last_name, \n"
                + "e.email, e.phone_number, e.hire_date, e.job_id,j.job_title, e.salary,\n"
                + "e.commission_pct,e.manager_id, m.first_name as manager,e.department_id, d.department_name\n"
                + "from\n"
                + "employees e join departments d\n"
                + "on e.department_id=d.department_id\n"
                + "join employees m\n"
                + "on e.manager_id=m.employee_id\n"
                + "join jobs j\n"
                + "on j.job_id=e.job_id\n"
                + "order by e.employee_id asc\n"
                + "";
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt(1));
                employee.setFirstname(rs.getString("first_name"));
                employee.setLastname(rs.getString("last_name"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone_number"));
                employee.setHire(rs.getDate("hire_date"));
                employee.setJob(new Job(rs.getString("Job_id"), rs.getString("job_title")));
                employee.setSalary(rs.getInt("salary"));
                employee.setCommission(rs.getInt("commission_pct"));
                employee.setManager(new Employee(rs.getInt("employee_id"), rs.getString("manager")));
                employee.setDepartment(new Department(rs.getInt("Department_id"), rs.getString("department_name")));
                employees.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    public boolean createEmployee(Employee employee) {

        String query = "insert into employees (first_name, last_name,email,phone_number, hire_date, job_id,"
                + "salary, commission_pct, manager_id,department_id, employee_id) values (?,?,?,?,?,?,?,?,?,?,?)";
        return execute(query, employee);

    }
//

    public boolean updateEmployee(Employee employee) {

        String query = "update employees set first_name=?, last_name=?,email=?,phone_number=?, hire_date=?, job_id=?,"
                + "salary=?, commission_pct=?, manager_id=?,department_id=? where employee_id=?";
        return execute(query, employee);
    }
//

    public boolean deleteEmployee(Employee employee) {

        String query = "delete from employees where employee_id=?";
        return execute(query, employee);
    }

    public Employee selectById(int id) {
        Employee employee = new Employee();

        String query = "select\n"
                + "e.employee_id,  \n"
                + "e.first_name, e.last_name, \n"
                + "e.email, e.phone_number, e.hire_date, e.job_id,j.job_title, e.salary,\n"
                + "e.commission_pct,e.manager_id, m.first_name as manager, e.department_id, d.department_name\n"
                + "from\n"
                + "employees e join departments d\n"
                + "on e.department_id=d.department_id\n"
                + "join employees m\n"
                + "on e.manager_id=m.employee_id\n"
                + "join jobs j\n"
                + "on j.job_id=e.job_id\n"
                + "where e.employee_id=?\n"
                + "";
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
         
                while (rs.next()) {

                    employee.setId(rs.getInt(1));
                    employee.setFirstname(rs.getString("first_name"));
                    employee.setLastname(rs.getString("last_name"));
                    employee.setEmail(rs.getString("email"));
                    employee.setPhone(rs.getString("phone_number"));
                    employee.setHire(rs.getDate("hire_date"));
                    employee.setJob(new Job(rs.getString("Job_id"), rs.getString("job_title")));
                    employee.setSalary(rs.getInt("salary"));
                    employee.setCommission(rs.getInt("commission_pct"));
                    employee.setManager(new Employee(rs.getInt("employee_id"), rs.getString("manager")));
                    employee.setDepartment(new Department(rs.getInt("Department_id"), rs.getString("department_name")));                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return employee;
    }
    public List<Employee> searchEmployee(String key) {
        List<Employee> employees = new ArrayList<>();
        String query = "Select * from employees where employee_id like ? or first_name like ?"
                + "or last_name like ? or email like ? or phone_number like ?"
                + "or hire_date like ? or job_id like ? or salary like ? or commission_pct like ?"
                + "or manager_id like ? or department_id like ?";
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setString(1, "%" + key + "%");
            ps.setString(2, "%" + key + "%");
            ps.setString(3, "%" + key + "%");
            ps.setString(4, "%" + key + "%");
            ps.setString(5, "%" + key + "%");
            ps.setString(6, "%" + key + "%");
            ps.setString(7, "%" + key + "%");
            ps.setString(8, "%" + key + "%");
            ps.setString(9, "%" + key + "%");
            ps.setString(10, "%" + key + "%");
            ps.setString(11, "%" + key + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();

                employee.setId(rs.getInt(1));
                employee.setFirstname(rs.getString("first_name"));
                employee.setLastname(rs.getString("last_name"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone_number"));
                employee.setHire(rs.getDate("hire_date"));
                employee.setJob(new Job(rs.getString("Job_id")));
                employee.setSalary(rs.getInt("salary"));
                employee.setCommission(rs.getInt("commission_pct"));
                employee.setManager(new Employee(rs.getInt("employee_id")));
                employee.setDepartment(new Department(rs.getInt("Department_id")));
                employees.add(employee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    public boolean execute(String query, Employee employee) {

        boolean result = false;
        System.out.println(employee.getJob());
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            if (employee.getFirstname() == null) {
                ps.setInt(1, employee.getId());
            } else {
                ps.setString(1, employee.getFirstname());
                ps.setString(2, employee.getLastname());
                ps.setString(3, employee.getEmail());
                ps.setString(4, employee.getPhone());
                ps.setDate(5, employee.getHire());
                ps.setString(6, employee.getJob().getId());
                ps.setInt(7, employee.getSalary());
                ps.setInt(8, employee.getCommission());
                ps.setInt(9, employee.getManager().getId());
                ps.setInt(10, employee.getDepartment().getId());
                ps.setInt(11, employee.getId());
            }
            ps.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

}
