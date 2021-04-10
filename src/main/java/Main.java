import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());


    public static void main(String[] args) throws InterruptedException {
        for(int i = 1; i< Integer.parseInt(args[0]); i++){
            Marker assertationMarker = MarkerManager.getMarker("assertation");
            Marker gibberishMarker = MarkerManager.getMarker("gibberish");
            ThreadContext.put("iteration", String.valueOf(i));

            logger.fatal("This is a FATAL message");
            logger.error("This is an ERROR message");
            logger.warn("This is a WARN message");
            logger.info("This is an INFO message");
            logger.debug("This is a DEBUG message");
            logger.trace("This is a TRACE message");
            logger.error( "This is an ERROR message that contains 'FAIL'");
            logger.info(assertationMarker, "The mouse ran up the clock.");
            logger.error(gibberishMarker, "Hickory, dickory, dock.");

            Thread.sleep(3000);

        }



    }
}
