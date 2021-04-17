import java.io.File;

public class Download{

    private  String file_url = "";
    private  int min_range = 0;
    private  int max_range = 1000;
    private  String location = "/home/srinidhi/Myworks/java_tutorial/FileDownload/file_example.pdf";
    DownloadManager downloadManager = null;
    public static void main(String[] args){
                
    }

    Download(String file_url, int min_range, int max_range){
        this.file_url = file_url;
        this.min_range = min_range;
        this.max_range = max_range;
    }

    public void download(){
        System.out.println("File url: " + file_url);
        System.out.println("Min range: " + String.valueOf(min_range));
        System.out.println("Max range: "+ String.valueOf(max_range));
        downloadManager = new DownloadManager(file_url, min_range, max_range, location);
        downloadManager.download();
    }

    public void pause(){
        downloadManager.pause();
    }
    public void checkFileSize(){
        File file = new File(location);
        System.out.println("File size: " + file.length());
    } 


}
