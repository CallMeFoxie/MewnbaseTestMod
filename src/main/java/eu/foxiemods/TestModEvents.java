package eu.foxiemods;

import eu.foxiemods.mewnloader.MewnEvent;
import eu.foxiemods.mewnloader.MewnEventRegister;

import static com.badlogic.gdx.Gdx.app;

public class TestModEvents {
   @MewnEventRegister(eventName = "gameTickPre")
   public void gameTickPre(MewnEvent.GameTickPre event) {
      app.debug("FOO", "tickPre");
   }
}
