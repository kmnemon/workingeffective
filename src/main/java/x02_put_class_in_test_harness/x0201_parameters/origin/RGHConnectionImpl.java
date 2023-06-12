package x02_put_class_in_test_harness.x0201_parameters.origin;

public class RGHConnectionImpl implements RGHConnection {
    public RGHConnectionImpl(int port, String Name, String passwd) {

    }

    @Override
    public void connect() {}

    @Override
    public void disconnect(){}

    @Override
    public ACTIOReport ACTIOReportFor(int customerID){
        return new ACTIOReport();
    }

    public void formPacket(){}


}

