package net.evenh.trace.demo;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DummyController {
  private static final Logger log = LoggerFactory.getLogger(DummyController.class);

  /**
   * When invoking this method, a trace gets generated and attempted shipped to Tempo.
   */
  @GetMapping
  public Map<String, String> hello() {
    log.info("served request");
    return Map.of("hello", "world");
  }
}
