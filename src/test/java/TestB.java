import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

@Execution(CONCURRENT)

public class TestB {
   private static final Logger log = LoggerFactory.getLogger(TestB.class);

   @org.junit.jupiter.api.Test
   public void test1() throws Exception {
      log.debug("Start B1");
      Thread.sleep(2000);
      log.debug("End B1");
   }

   @org.junit.jupiter.api.Test
   public void test2() throws Exception {
      log.debug("Start B2");
      Thread.sleep(2000);
      log.debug("End B2");
   }
}
