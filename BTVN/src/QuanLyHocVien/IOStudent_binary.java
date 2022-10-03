package QuanLyHocVien;


import java.io.*;
import java.util.ArrayList;


    public class IOStudent_binary {
        static File file = new File("Students.txt");

        public static void write(ArrayList<HocVien> listHocVien){
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(listHocVien);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        public static ArrayList<HocVien> read(){
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                return (ArrayList<HocVien>) objectInputStream.readObject();
            }catch (Exception e){
                e.printStackTrace();
                return new ArrayList<>();
            }
        }
    }

