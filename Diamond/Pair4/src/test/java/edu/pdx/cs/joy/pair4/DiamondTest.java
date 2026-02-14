package edu.pdx.cs.joy.pair4;

import org.junit.jupiter.api.Test;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void cleanDiamondsD(){
    Diamond.cleanDiamonds('D');
  }

  @Test
  void cleanDiamondsH(){
    Diamond.cleanDiamonds('H');
  }
}


