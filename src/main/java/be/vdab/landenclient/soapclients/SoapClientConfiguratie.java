package be.vdab.landenclient.soapclients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfiguratie {
  @Bean
  public Jaxb2Marshaller marshaller() {
    // een marshaller zet XML om naar Java objecten en omgekeerd
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath("be.vdab.landenclient.soapmessages");
    return marshaller;
  }
}
