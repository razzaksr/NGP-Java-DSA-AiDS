package lld;

import java.util.List;

public interface DAO {
    public void assign(CollegeBus bus);
    public void update(CollegeBus bus);
    public List<CollegeBus> fetchAll();
    public CollegeBus fetchByRegNo(String regNo);
    public void deleteByRegNo(String regNo);
}
