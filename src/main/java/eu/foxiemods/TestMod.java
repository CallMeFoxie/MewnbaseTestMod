package eu.foxiemods;

import eu.foxiemods.mewnloader.MewnMod;

public class TestMod implements MewnMod {
   @Override
   public String getModName() {
      return "MewnTestMod";
   }

   @Override
   public String getVersion() {
      return "1.0.0";
   }
}
