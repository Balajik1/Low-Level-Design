public class Main {
    public static void main(String[] args){
        try{
            EmployeeDao empTableObj=new EmployeeDaoProxy();
            //empTableObj.createEmployee("employee","Balaji Employee");
            empTableObj.createEmployee("admin","Balaji Employee");
        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }


}
