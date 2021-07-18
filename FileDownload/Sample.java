import java.net.*;

public class Sample {
   public static void main(String[] args){
       try{
        long le;
        URL url = new URL("https://file-examples-com.github.io/uploads/2017/10/file-sample_150kB.pdf");
        HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
        urlconnection.setRequestMethod("HEAD");
        urlconnection.connect();
        le = urlconnection.getContentLength();
        System.out.println(le);
        urlconnection.disconnect();
       }
       catch(Exception e){
        System.out.println("Downloading failed due to: " + e);
    }
   } 
}
