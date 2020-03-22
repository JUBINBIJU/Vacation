import java.util.Scanner;
public class FuelMonitorDemo
{
public static void main(String args[])
{
FuelMonitor f1=new FuelMonitor(100,20);
f1.setFuel(60);
f1.getData();
}
}
class FuelMonitor
{
private int tank_capacity,efficiency,fuel_in_tank;
FuelMonitor(int tc,int eff,int ft)
{
tank_capacity=tc;
efficiency=eff;
fuel_in_tank=ft;
}
FuelMonitor(int tc,int eff)
{
this(tc,eff,0);
}
int getTankCapacity()
{
return tank_capacity;
}
int getEfficiency()
{
return efficiency;
}
void setFuel(int f)
{
fuel_in_tank=f;
}
int addFuel()
{
return getTankCapacity()-fuel_in_tank;
}
int driveDistance()
{
return fuel_in_tank*getEfficiency();
}
void getData()
{
System.out.println(" Fuel in tank : "+fuel_in_tank +"\n Distance
travelled: "+this.driveDistance()+"\n Remaining space :
"+this.addFuel());
}
}
