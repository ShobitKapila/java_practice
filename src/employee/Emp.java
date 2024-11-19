package employee;
public class Emp
{
    String name,cat;
    int id;
    double basic=85000;
    double  hra,da,grossp;
    double pf=3600;
    double it;
    public void getEmp(String name,int id,String cat)
    {
        this.name=name;
        this.id=id;
        this.cat=cat;
    }
    public void getSal()
    {
        hra=0.06*basic;
        da=0.25*basic;
        grossp=hra+da+basic+pf;
        System.out.println(grossp);
    }
    public void detectIT()
    {
        if(grossp>500000)
        {
            it=0.1*grossp;//10% tax
        }
    }
}
