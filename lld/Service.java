package lld;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Service implements DAO{
    // perm m/y
    private File data;
    // in memory
    private List<CollegeBus> buses;
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

    public void writeToFile(){
        try{
            FileOutputStream fos=new FileOutputStream(data);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(buses);
            oos.close();
            fos.close();
        }catch(IOException ex)
        {ex.printStackTrace();}
    }

    public void readFromFile(){
        try{
            FileInputStream fis = new FileInputStream(data);
            if(data.length()<=0) buses = new ArrayList<>();
            else{
                ObjectInputStream ois = new ObjectInputStream(fis);
                buses = (List<CollegeBus>) ois.readObject();
                ois.close();
            }
            fis.close();
        }catch(IOException | ClassNotFoundException ex)
        {ex.printStackTrace();}
    }

    @Override
    public void assign(CollegeBus bus) {
        readFromFile();// deserialization
        buses.add(bus);// append in existsing
        writeToFile();// serialization
        System.out.println("Bus assigned successfully");
    }

    @Override
    public void update(CollegeBus bus) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public List<CollegeBus> fetchAll() {
        readFromFile();
        return buses;
    }

    @Override
    public void deleteByRegNo(String regNo) {
        readFromFile();// deserialization
        for(int index=0;index<buses.size();index++){
            if(buses.get(index).getRegNo().equals(regNo)){
                buses.remove(index);
                writeToFile();// serialization
                System.out.println("Bus deleted successfully");
                return;
            }
        }
        System.out.println("Bus not found");
    }
    
}
