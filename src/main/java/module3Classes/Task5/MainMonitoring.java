package module3Classes.Task5;

public class MainMonitoring {
    public static void main(String[] args) {
        MonitoringSystem generalIndicatorsMonitoringModule = new MonitoringSystem() {
            public void startMonitoring() {
                System.out.println("Monitoring of general indication has started!");
            }
        };
        MonitoringSystem errorMonitoringModule = new MonitoringSystem() {
            public void startMonitoring() {
                System.out.println("Bug tracking monitoring has started!");
            }
        };
        MonitoringSystem securityModule = new MonitoringSystem() {
            public void startMonitoring() {
                System.out.println("Security monitoring has started!");
            }
        };
        generalIndicatorsMonitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
