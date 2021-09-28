package i05.a507.certblock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CertblockApplication {

  public static void main(String[] args) {
    SpringApplication.run(CertblockApplication.class, args);
  }

}
