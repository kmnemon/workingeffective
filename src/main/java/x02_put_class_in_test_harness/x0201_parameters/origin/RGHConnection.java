package x02_put_class_in_test_harness.x0201_parameters.origin;

public interface RGHConnection {
    void connect();

    void disconnect();

    ACTIOReport ACTIOReportFor(int customerID);
}
