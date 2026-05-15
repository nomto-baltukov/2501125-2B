import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler implements Constant {
    public ArrayList<Customer> dataRead(File file) {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim().replaceAll(",", "");
                String[] datas = line.split(" ");
                if (datas[0].charAt(0) == '9') {
                    customers.add(
                            new Special(datas[0], datas[1], Integer.parseInt(datas[2])));
                } else
                    customers.add(
                            new Normal(datas[0], datas[1], Integer.parseInt(datas[2])));
            }
            reader.close();
            if (customers.isEmpty()) {
                error("데이터가없습니다.");
            } else
                System.out.printf(" %d개의데이터를성공적으로읽었습니다.\n",
                        customers.size());
        } catch(NullPointerException| IOExceptione) {
            error(e.getMessage());
        }
        return customers;
    }
}
