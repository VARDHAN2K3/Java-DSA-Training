
import java.util.Scanner;

interface FileOperations{
    public void uploadFile(MyFiles file);
    public void renameFile(MyFiles file);
    // // public void updateFile();
    public void deleteFile(MyFiles file);
    public void displayFiles(String folder);
}

public class FileManager implements FileOperations{
    private static final int memory = 100;
    private MyFiles[] myFiles = new MyFiles[memory];
    private int cnt = 0;
    private Scanner sc;
    FileManager(){
        sc = new Scanner(System.in);
    }
    
    @Override
    public void uploadFile(MyFiles file){
        if(file.getType() != null){
            int found = 0;
            int c = 0;
            if(cnt < memory){
                for(int i = 0; i < memory; i++){
                    if(myFiles[i] != null && file.getFname().equals(myFiles[i].getFname()) &&
                        file.getType().equals(myFiles[i].getType())){
                        c = myFiles[i].increamentCount();
                        found = 1;
                        break;
                    }
                }
                for(int i = 0; i < memory; i++){
                    if(myFiles[i] == null){
                        if(found == 1)
                            myFiles[i] = renameDuplicate(file,c);
                        else
                            myFiles[i] = file;
                        break;
                    }
                }
                System.out.println("Uploaded in " + file.getType() + "-Folder Successfully");
                cnt++;
            }
            else
                System.out.println("Storage Full (Delete Unwanted Files)");
        }
        else
            System.out.println("Invalid File Type (Please specify appropiate extension)");
        // if(cnt < memory && file.getType() != null){
        //     myFiles[cnt++] = file;
        //     System.out.println("Uploaded in " + file.getType() + "-Folder Successfully");
        // }
        // else
        //     System.out.println("Invalid File Type (Please specify appropiate extension");
    }
    
    @Override
    public void renameFile(MyFiles file){
        int flag = 0, exeFlag = 0;
        String newName = "";
        for(int i = 0; i < memory; i++){
            if(myFiles[i] != null 
            && file.getFname().equals(myFiles[i].getFname())
            && file.getExtension().equals(myFiles[i].getExtension())){
                System.out.println(myFiles[i].getFname() + myFiles[i].getExtension() + " Found");
                System.out.print("Enter New File name: ");
	            newName = sc.next();
	            if(file.getExtension().equals(myFiles[i].getExtension())){
                    myFiles[i].setFname(newName);
                    System.out.println("File " + file.getFname() + file.getExtension() + " renamed as " + newName);
                    exeFlag = 1;
	            }
	            flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println(file.getFname() + file.getExtension() + " is not found");
        else if(exeFlag == 0)
            System.out.println(newName + " Extension does not match");
    }
    
    @Override
    public void deleteFile(MyFiles file){
        int flag = 0;
        for(int i = 0; i < memory; i++){
            if(myFiles[i] != null 
            && file.getFname().equals(myFiles[i].getFname())
            && file.getExtension().equals(myFiles[i].getExtension())){
                myFiles[i] = null;
                cnt--;
                System.out.println(file.getFname() + file.getExtension() + " was Deleted from Directory");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println(file.getFname() + file.getExtension() + " Did Not exist in the  Directory");
    }
    
    @Override
    public void displayFiles(String folder){
        if(!folder.equals("exit")){
            System.out.println("\n~/" + folder);
            for(int i = 0; i < memory; i++){
                if(myFiles[i] != null && folder.equals(myFiles[i].getType()))
                    System.out.println("  |-" + myFiles[i].getFname() + myFiles[i].getExtension() + "\t" + myFiles[i].getFid());
            }
        }
    }
    
    MyFiles renameDuplicate(MyFiles file, int c){
        file.setFname(file.getFname(), c);
        return file;
    }
}