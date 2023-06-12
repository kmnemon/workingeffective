package x02_put_class_in_test_harness.x0201_parameters.mockito;

public class RGHConnection {
    public RGHConnection(int port, String Name, String passwd) {

    }

    public void connect() {}

    public void disconnect(){}

    public ACTIOReport ACTIOReportFor(int customerID){
        return new ACTIOReport();
    }

    public void formPacket(){}


}

