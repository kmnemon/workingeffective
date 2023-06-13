package x02_put_class_in_test_harness.x0201_parameters._02fakeobject;

public interface RGHConnection {
    void connect();

    void disconnect();

    ACTIOReport ACTIOReportFor(int customerID);

    void formPacket();
}
