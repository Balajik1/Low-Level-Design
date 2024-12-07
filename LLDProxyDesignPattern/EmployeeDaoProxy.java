public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDaoImpl employeeDao;
    EmployeeDaoProxy(){
        employeeDao=new EmployeeDaoImpl();
    }
    @Override
    public void createEmployee(String client, String name) throws Exception {
        if(client.equalsIgnoreCase("admin")){
            employeeDao.createEmployee(client,name);
            return;
        }
        throw new Exception("Access Denied at create Employee");
    }

    @Override
    public void getEmployee(String client, int id) throws Exception {
        if(client.equalsIgnoreCase("admin")){
            employeeDao.getEmployee(client,id);
            return;
        }
        throw new Exception("Access Denied at getEmployee");
    }

    @Override
    public void deleteEmployee(String client, String id) throws Exception {
        if(client.equalsIgnoreCase("admin")){
            employeeDao.deleteEmployee(client,id);
            return;
        }
        throw new Exception("Access Denied at deleteEmployee");
    }
}
