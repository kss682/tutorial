


import java.io.*;
import java.net.*;
public class FileDownload {
	
	  final private String USER_AGENT = "";
	    private String file_url;
	    private long min_range;
	    private long max_range;
	    private String location;
	    private int progress;
	    private long downloadedsize;
	    HttpURLConnection urlconnection = null;
	    FileOutputStream file_output = null;
	    long total;

	    FileDownload(){
	        this.progress = 0;
	        this.downloadedsize = 0;
	        this.total = 0;
	    }
	    public void setFileUrl(String file_url){
	        this.file_url = file_url;
	    }

	    public void setDownloadRange(long min_range, long max_range){
	        this.min_range = min_range;
	        this.max_range = max_range;
	    }

	    public void setFileLocation(String location){
	        this.location = location;
	    }

	    public void startDownload(){
	        //Better file download method to keep track of progress
	        String range = String.format("bytes=%d-%d", min_range, max_range);
	        InputStream input = null;
	        try{
	            URL url = new URL(file_url);
	            urlconnection = (HttpURLConnection) url.openConnection();
	          //  urlconnection.setRequestProperty("Range", range);
	            urlconnection.connect();
	            System.out.println("Response code: " + urlconnection.getResponseCode());
	           // ReadableByteChannel rbc = Channels.newChannel(urlconnection.getInputStream());

	            int filelength = urlconnection.getContentLength();
	            input = urlconnection.getInputStream();

	            
	          //  File file = new File("A:/test/file.bin");
	            file_output = new FileOutputStream("A:/test/file.bin", true);
	            byte data[] = new byte[4096];
	           
	            int count;
	            int test = 0;
	            
	            while((count=input.read(data))!=-1){
	                total+=count;
	                downloadedsize = total;
	                progress = (int) (total*100/filelength);
	                file_output.write(data,0,count);
	                System.out.println(progress);
	                test++;
	                if(test==1715) {
	                	pauseDownload();
	                }
	                	
	            }

	            //file_output.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
	            file_output.close();
	            urlconnection.disconnect();
	        }
	        catch(IOException ioe){
	            ioe.printStackTrace();
	        }
	        catch(Exception e){
	            System.out.println("Downloading failed due to: " + e);
	        }

	    }

	    public void pauseDownload(){
	        /*
	            1.Closing the connection.
	            2.Call procedures to store the file info at that point.
	        */
	        try{
	            file_output.close();
	            urlconnection.disconnect();
	            System.out.println("Download paused");
	            System.out.println("File size downloaded: " + getFileSize());
	        }
	        catch(Exception e){
	            System.out.println("Pausing download failed due to: " + e);
	        }
	        resumeDownload();
	    }
	    public void resumeDownload(){
	        /*
	            1. Calls getFileSize()
	            2. sets new range to DownloadRange
	            3. call startDownad()
	        */
	        long current_file_size;
	        try{
	            current_file_size = getFileSize();
	            if(current_file_size <= max_range){
	                setDownloadRange(current_file_size+min_range, max_range);
	                System.out.println("Resuming download: " + min_range + "-" + max_range);
	                startDownload();
	            }
	            else{
	                System.out.println(String.format("Current file size %d exceeds %d", current_file_size, max_range));
	            }

	        }
	        catch(Exception e){
	            System.out.println("Resuming download failed due to: " + e);
	        }
	    }

	    public long getDownloadSize(){
	        try{
	            long dwnld_size = 0;
	            URL url = new URL(file_url);
	            urlconnection = (HttpURLConnection) url.openConnection();
	            urlconnection.setRequestMethod("HEAD");
	            urlconnection.connect();
	            dwnld_size = urlconnection.getContentLength();
	            urlconnection.disconnect();
	            return dwnld_size;
	        }
	        catch(Exception e){
	            System.out.println("Failed to retrive download size due to: " + e);
	            return -1;
	        }
	    }

	    public double getDwnldProgress(){
	        return progress;
	    }
	    public long getFileSize(){
	        return downloadedsize;
	    }
	
	
	public static void main(String[] args) throws Exception {
        FileDownload fd = new FileDownload();
        fd.setFileUrl("https://speed.hetzner.de/100MB.bin");
        fd.setDownloadRange(0, 100000000);
        fd.setFileLocation("/home/srinidhi/Myworks/java_tutorial/FileDownload/");
        fd.startDownload();
        
	}
}
