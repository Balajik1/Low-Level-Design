public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void createEmployee(String client, String name) throws Exception {
        System.out.println("Created Employee : "+name);
    }

    @Override
    public void getEmployee(String client, int id) throws Exception {
        System.out.println("get Employee :: id : "+id);
    }

    @Override
    public void deleteEmployee(String client, String id) throws Exception {
        System.out.println("Delete Employee : id"+id);
    }
}
