import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

@Execution(CONCURRENT)

public class TestA {
   private static final Logger log = LoggerFactory.getLogger(TestA.class);

   @org.junit.jupiter.api.Test
   public void test1() throws Exception {
      log.debug("Start A1");
      Thread.sleep(2000);
      log.debug("End A1");
   }

   @org.junit.jupiter.api.Test
   public void test2() throws Exception {
      log.debug("Start A2");
      Thread.sleep(2000);
      log.debug("End A2");
   }
}
