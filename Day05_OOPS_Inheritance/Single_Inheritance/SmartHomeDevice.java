package Day05_OOPS_Inheritance.Single_Inheritance;

// It's a super class
class Device{
    int deviceId;
    String status;

    // Constructor of Device class toi initialize the data member of Device class
    Device(int deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    // Dsplay the details
    void displayStatus(){
        System.out.println("Device id is "+this.deviceId);
        System.out.println("Device status is "+status);
    }

}
// Thermostat extending the device class
class Thermostat extends Device{

    int temperatureSetting;
    // Constructor of Thermostat to initialize the data member of Thermostat class
    Thermostat(int deviceId,String status,int temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature change to "+this.temperatureSetting);
    }
}
public class SmartHomeDevice {
    public static void main(String[] args) {
        Thermostat th=new Thermostat(2003,"Normal",30);

        th.displayStatus();
    }
}

