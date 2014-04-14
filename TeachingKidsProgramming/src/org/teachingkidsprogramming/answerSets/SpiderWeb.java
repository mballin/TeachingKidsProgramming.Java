package org.teachingkidsprogramming.answerSets;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(Colors.Grays.Silver);
    double lineLength = 10.5;
    double zoom = 1.1;
    for (int i = 1; i <= 10; i++)
    {
      lineLength = weaveOneLayer(lineLength, zoom);
      zoom = 1.3;
    }
  }
  private static double weaveOneLayer(double lineLength, double zoom)
  {
    for (int i = 1; i <= 6; i++)
    {
      drawTriangle(lineLength);
      Tortoise.turn(360 / 6);
      lineLength += zoom;
    }
    return lineLength;
  }
  private static void drawTriangle(double lineLength)
  {
    for (int i = 1; i <= 3; i++)
    {
      Tortoise.move(lineLength);
      Tortoise.turn(360 / 3);
    }
  }
}
