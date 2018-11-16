package main;

/**
 *
 * @author Antonio
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger logger;

    static {
        try {
            // you need to do something like below instead of Logger.getLogger(....);
            // Logger.getLogger se usaba hasta la versión 2.7 y muchos ejemplos de internet estan asi
            logger = LogManager.getLogger(Main.class);
        } catch (Throwable e) {
            System.out.println("Don't work");
        }
    }

    public static void main(String[] args) {
        String s = "Ya no hay fallo. Se ha creado un archivo de configuracion";
        System.out.println("--- " + s);
        logger.info("02 agosto 2018");
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("iiiiinfo message");
        logger.warn("warn message");        
        logger.error("error message");
        logger.fatal("fatal message");
        System.out.println("system.out");
        
    }

}
