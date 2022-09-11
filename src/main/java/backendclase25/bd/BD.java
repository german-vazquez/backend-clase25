package backendclase25.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
    private static final String DRIVER="org.h2.Driver";
    private static final String URL="jdbc:h2:~/clase25";
    private static final String USER="sa";
    private static final String PASS="";
    private static final String SCRIPT=URL+";INIT=RUNSCRIPT FROM 'create.sql'";

    public static Connection getConnection() throws Exception{
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL,USER,PASS);
    }

    public static void crearTablas(){
        Connection connection=null;
        try {
            Class.forName(DRIVER);
            connection=DriverManager.getConnection(SCRIPT,USER,PASS);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}
