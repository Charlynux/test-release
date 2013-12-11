package release.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Main Class
 *
 */
public class HelloWorld {
    
    /**
     * Logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        LOGGER.debug("hello, world");
    }

}
