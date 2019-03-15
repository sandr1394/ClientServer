import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Client client = new Client(7777);
        try {
            client.startClientConnection();
        } catch(IOException ioe){
            System.out.println("Input-Output Exception occurred: "+ioe.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception occurred: "+e.getMessage());
        }
    }
}

