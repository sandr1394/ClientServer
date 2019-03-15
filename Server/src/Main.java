import config.DatabaseConfig;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try {
           Server server = new Server(7777);
           server.startAccountListener();

        } catch(ClassNotFoundException cnfe){
            System.out.println("Can't found class: "+cnfe.getMessage());
        }
        catch(SQLException sqle){
            System.out.println("SQL Exception occurred: "+ sqle.getMessage());
        }
        catch(IOException ioe){
            System.out.println("Input-Output Exception occurred: "+ioe.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception occurred: "+e.getMessage());
        }
    }
}

