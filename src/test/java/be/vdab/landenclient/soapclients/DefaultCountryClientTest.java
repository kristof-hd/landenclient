package be.vdab.landenclient.soapclients;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultCountryClientTest {
  @Autowired
  private DefaultCountryClient client;
  @Test
  public void deCodeBEMoetHetLandBelgiumTerugGeven() {
    assertEquals("Belgium", client.getCountry("BE").getName());
  }
}
