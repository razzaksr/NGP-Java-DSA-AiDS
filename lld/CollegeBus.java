package lld;

import java.util.List;

public class CollegeBus {
    private String regNo;
    private int routeId;
    private List<String> stops;
    private List<String> students;
    private String driverName;
    private long contact;
    @Override
    public String toString() {
        return "CollegeBus [regNo=" + regNo + ", routeId=" + routeId + ", stops=" + stops + ", students=" + students
                + ", driverName=" + driverName + ", contact=" + contact + "]";
    }
    public CollegeBus() {
    }
    public CollegeBus(String regNo, int routeId, List<String> stops, List<String> students, String driverName,
            long contact) {
        this.regNo = regNo;
        this.routeId = routeId;
        this.stops = stops;
        this.students = students;
        this.driverName = driverName;
        this.contact = contact;
    }
    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    public int getRouteId() {
        return routeId;
    }
    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }
    public List<String> getStops() {
        return stops;
    }
    public void setStops(List<String> stops) {
        this.stops = stops;
    }
    public List<String> getStudents() {
        return students;
    }
    public void setStudents(List<String> students) {
        this.students = students;
    }
    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public long getContact() {
        return contact;
    }
    public void setContact(long contact) {
        this.contact = contact;
    }
}
