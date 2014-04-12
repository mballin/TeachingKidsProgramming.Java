package org.teachingkidsprogramming.answerSets;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Number height;
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  /*
   * After you finish, watch the video recap at http://youtu.be/nQlsrnaMeuw
   * 
   * Other Related Videos:
   * Sub recipe-> Method : http://youtu.be/C6fnqjceVcs
   */
  private static void drawHouse(Number height)
  {
    //   Change the color of the line the tortoise draws to lightGray --#15
    Tortoise.setPenColor(Colors.Grays.LightGray);
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}
