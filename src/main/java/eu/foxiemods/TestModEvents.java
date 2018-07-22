package eu.foxiemods;

import eu.foxiemods.mewnloader.MewnEvent;

import static com.badlogic.gdx.Gdx.app;

public class TestModEvents {
   public void gameTickPre(MewnEvent.GameTickPre event) {
      app.debug("FOO", "tickPre");
   }
}
