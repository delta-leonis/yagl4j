package io.leonis.frosty;

/**
 * This is the game-pad listener interface. This interface is used to listen to
 * game-pad callbacks.
 *
 * @author Mark Lefering
 */
public interface GamePadListener {

  /**
   * This is the controller added callback. This callback is called whenever a
   * controller is added to the system.
   *
   * @param gamePadID The game-pad ID.
   */
  void onGamePadAdded(final long gamePadID);

  /**
   * This the controller removed callback. This callback is called whenever a
   * controller is removed from the system.
   *
   * @param gamePadID The game-pad ID.
   */
  void onGamePadRemoved(final long gamePadID);

  /**
   * This is the controller axis motion callback. This callback is called
   * whenever there is a motion on a axis of a game-pad
   *
   * @param gamePadID The game-pad ID.
   * @param axis The axis of the motion.
   * @param value The value of the axis.
   */
  void onGamePadAxisMotion(
      final long gamePadID, final byte axis, final short value
  );

  /**
   * This is the controller button down callback. This callback is called
   * whenever a button is pressed on a controller.
   *
   * @param gamePadID The game-pad ID.
   * @param button The button that has been pressed.
   */
  void onGamePadButtonDown(final long gamePadID, final byte button);

  /**
   * This is the controller button up callback. This callback is called whenever
   * a button is released on a controller.
   *
   * @param gamePadID The game-pad ID.
   * @param button The button that has been released.
   */
  void onGamePadButtonUp(final long gamePadID, final byte button);

  /**
   * This is the controller remapped callback. This callback is called whenever
   * a controller has been remapped.
   *
   * @param gamePadID The game-pad ID.
   */
  void onGamePadRemapped(final long gamePadID);

  /**
   * This is the error callback. This callback is called whenever a error has
   * occurred.
   *
   * @param error The error that occurred.
   */
  void onGamePadError(final String error);
}
