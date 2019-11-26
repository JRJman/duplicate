import java.io.File;
import java.io.IOException;

public class Duplicate {

    public static String path = "C:\\Users\\user\\SUT.txt";

    public int duplicator(int number) {
        return number * 2;
    }

    public void createFile() {
        try {
            File output = new File(path);
            boolean isFileCreated = output.createNewFile();
            if (isFileCreated){
                System.out.println("File successfully created!");
            }
            else{
                System.out.println("File already exist!");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }

    public void deleteFile() {
        try{
            File output = new File(path);

            if(output.delete()){
                System.out.println(output.getName() + " is deleted!");
            }else{
                System.out.println("Delete failed");
            }
        }catch(Exception e){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }

}
