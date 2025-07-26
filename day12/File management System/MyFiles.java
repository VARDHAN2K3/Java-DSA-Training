public class MyFiles{
    private String fId;
    private String fName;
    private String extension;
    private String type;
    private int cnt = 0;
    // MyFiles(String name){
    //     //Fid = id;
    //     fName = name;
    //     //this.type = type;
    // }
    void setFid(MyFiles id){
        fId = id.toString();
    }
    String getFid(){
        return fId;
    }
    void setFname(String name){
        fName = "";
        int i = 0;
        while(i < name.length() && name.charAt(i) != '.'){
            fName += name.charAt(i);
            i++;
        }
    }
    void setFname(String name, int c){
        fName = name + c;
    }
    String getFname(){
        return fName;
    }
    void setExtension(String name){
        extension = "";
        int i = fName.length();
        while(i < name.length()){
            extension += name.charAt(i);
            i++;
        }
    }
    String getExtension(){
        return extension;
    }
    void setType(){
        if(extension.equals(".mp3") || extension.equals(".wav"))
            type = "audio";
        else if(extension.equals(".mp4") || extension.equals(".mkv"))
            type = "video";
        else if(extension.equals(".jpg") || extension.equals(".jpeg") || extension.equals(".png") || extension.equals(".gif"))
            type = "image";
        else if(extension.equals(".txt") || extension.equals(".py") || extension.equals(".java") || extension.equals(".c"))
            type = "document";
        else
            type = null;
    }
    String getType(){
        return type;
    }
    int increamentCount(){
        return ++cnt;
    }
    // static String getExe(String name){
    //     String temp = "";
    //     for(int i = name.length()-1; name.charAt(i) != '.'; i--)
    //         temp += name.charAt(i);
    //     String res = ".";
    //     for(int i = temp.length()-1; i >= 0; i--)
    //         res += temp.charAt(i);
    //     return res;
    // }
}
class DummyFiles extends MyFiles{
    //No Own Implementation
}