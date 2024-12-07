public interface EmployeeDao {
    public void createEmployee(String client,String name) throws  Exception;
    public void getEmployee(String client,int id) throws  Exception;
    public void deleteEmployee(String client,String id) throws Exception;
}
