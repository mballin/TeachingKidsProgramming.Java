package org.teachingkidsprogramming.answerSets;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = 100;
    for (int i = 1; i <= sides; i++)
    {
      Tortoise.setPenColor(Colors.Blues.Blue);
      Tortoise.move(i);
      Tortoise.turn(360 / 8);
    }
  }
  /*
   * After you finish, watch the video recap at http://youtu.be/5bqUZEsJh_Q
   */
}
