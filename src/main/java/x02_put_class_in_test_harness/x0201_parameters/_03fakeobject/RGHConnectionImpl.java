package x02_put_class_in_test_harness.x0201_parameters._03fakeobject;

public class RGHConnectionImpl implements RGHConnection {
    public RGHConnectionImpl(int port, String Name, String passwd) {

    }

    @Override
    public void connect() {}

    @Override
    public void disconnect(){}

    @Override
    public ACTIOReport ACTIOReportFor(int customerID){
        //connect to remote server to get report
        return new ACTIOReport();
    }

    @Override
    public void formPacket(){}


}

