package eu.foxiemods;

import eu.foxiemods.mewnloader.MewnEventBus;
import eu.foxiemods.mewnloader.MewnMod;

import static com.badlogic.gdx.Gdx.app;

public class TestMod implements MewnMod {
   @Override
   public String getModName() {
      return "MewnTestMod";
   }

   @Override
   public String getVersion() {
      return "1.0.0";
   }

   @Override
   public java.lang.String getModId() {
      return "mewntestmod";
   }

   @Override
   public void preinit() {
      app.debug("mod", "preinit");
      MewnEventBus.registerEventHandlers(this, new TestModEvents());
   }

   @Override
   public void init() {
      app.debug("mod", "init");
   }

   @Override
   public void postinit() {
      app.debug("mod", "postinit");
   }
}
