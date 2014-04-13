package org.teachingkidsprogramming.answerSets;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 1; i <= 4; i++)
    {
      drawSquare();
      Tortoise.turn(90);
    }
  }
  // Related Videos:
  // Sub recipe-> Method : http://youtu.be/C6fnqjceVcs
  private static void drawSquare()
  {
    for (int i = 1; i <= 4; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      Tortoise.move(50);
      Tortoise.turn(90);
    }
  }
}
