package DeliveryConfiguration_SJ.jdbc;


import java.util.List;

public class ModuleJDBC {
    protected static DataBaseCon DBCon = new DataBaseCon();

    public static void main(String[] args) {
        List<String> runDaemon= DBCon.readDataBasePDK("Select DISPLAY_NAME,RUN_DAEMON Module From NPDREPORTMANAGER_DQIBLD.TB_FF_MODULE_SUMMARY_SCHEMA","Module");
        System.out.println(runDaemon);
        System.out.println(runDaemon.size());
        System.out.println(runDaemon.get(3));

    }
}
