import java.io.*;
import java.net.*;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DownloadManager {
    private String file_url;
    private int min_range;
    private int max_range;
    private String location;
    HttpURLConnection urlconnection = null;
    FileOutputStream file_output = null;

    DownloadManager(String file_url, int min_range, int max_range, String location){
        this.file_url = file_url;
        this.min_range = min_range;
        this.max_range = max_range;
        this.location = location;
    }

    public void download(){
        String range = String.format("bytes=%d-%d", min_range, max_range);
        try{
            URL url = new URL(file_url);
            urlconnection = (HttpURLConnection) url.openConnection();
            urlconnection.setRequestProperty("Range", range);
            urlconnection.connect();
            System.out.println(urlconnection.getResponseCode());
            ReadableByteChannel rbc = Channels.newChannel(urlconnection.getInputStream());
            
            file_output = new FileOutputStream(location, true);
            file_output.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            file_output.close();
            urlconnection.disconnect();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public boolean pause(){
        //Close the 
        try{
            file_output.close();
            urlconnection.disconnect();
            return true;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return false;
    }   
    
    public boolean resume(){
        return true;
    }

    public double progress(){
        return 0.0;
    }
}
