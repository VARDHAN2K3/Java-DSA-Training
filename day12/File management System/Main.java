import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    FileManager fm = new FileManager();
	    int ch = 0;
	    do{
	        System.out.println("\t##File Management System##");
	        System.out.println("1. Upload File");
	        System.out.println("2. Rename File");
	        //System.out.println("3. Update File");
	        System.out.println("3. Delete File");
	        System.out.println("4. Display Files");
	        //System.out.println("6. Close");
	        System.out.print("\nSelect an Option 1/2/3/4/>5 to exit: ");
	        ch = sc.nextInt();
	        MyFiles file = null;
	        switch(ch){
	            case 1:
	                System.out.print("\nEnter File Name: ");
	                String name = sc.next();
	               // System.out.print("Enter File type: ");
	               // String type = s.next();
	                file = new MyFiles();
	                file.setFid(file);
	                file.setFname(name);
	                file.setExtension(name);
	                file.setType();
	                //System.out.println(file.getFid() + " " + file.getFname() + "" + file.getExtension());
	                //System.out.println(file.getType());
	                fm.uploadFile(file);
	                break;
	            case 2:
	                System.out.print("\nEnter Current File Name: ");
	                String current = sc.next();
	                file = new DummyFiles();
	                file.setFname(current);
	                file.setExtension(current);
	               // System.out.print("Enter New File name: ");
	               // String newName = sc.next();
	                //System.out.println(MyFiles.getExe(current) + " " + MyFiles.getExe(newName));
	               // if(MyFiles.getExe(current).equals(MyFiles.getExe(newName))){
	               //     fm.renameFile(current, newName);
	               // }
	               fm.renameFile(file);
	                break;
	            //case 3:
	                //break;
	            case 3:
	                System.out.print("\nEnter File name to delete: ");
	                String fname = sc.next();
	                file = new DummyFiles();
	                file.setFname(fname);
	                file.setExtension(fname);
	                fm.deleteFile(file);
	                break;
	            case 4:
	                String folder = "";
	                do{
	                    System.out.println("\nAudio");
                        System.out.println("Image");
                        System.out.println("Video");
                        System.out.println("Document");
                        System.out.println("Exit");
                        System.out.print("\nEnter folder name to view Files: ");
                        folder = sc.next().toLowerCase();
                        if(folder.equals("audio") || folder.equals("image") 
                        || folder.equals("video") || folder.equals("document"))
                            fm.displayFiles(folder);
                        else
                            folder = "exit";
                    }while(!folder.equals("exit"));
                    System.out.println("\nFile Display mode exited");
	                break;
	            default:
	                System.out.println("\nExited File Explorer");
	        }
	        System.out.println();
	    }while(ch < 5);
	}
}