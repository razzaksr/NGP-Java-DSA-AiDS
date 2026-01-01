package lld;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Service implements DAO{
    private File data;
    public Service(){
        this.data = new File("businfo.doc");
        if(!data.exists()) {
            try {
                this.data.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public void assign(CollegeBus bus) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assign'");
    }

    @Override
    public void update(CollegeBus bus) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public List<CollegeBus> fetchAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchAll'");
    }

    @Override
    public CollegeBus fetchByRegNo(String regNo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchByRegNo'");
    }

    @Override
    public void deleteByRegNo(String regNo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByRegNo'");
    }
    
}
