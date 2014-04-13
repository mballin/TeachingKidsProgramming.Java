package org.teachingkidsprogramming.answerSets;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(Colors.Grays.Black);
    int branchLength = 60;
    drawBranch(branchLength);
  }
  private static void drawBranch(int branchLength)
  {
    if (branchLength > 0)
    {
      adjustColor(branchLength);
      Tortoise.move(branchLength);
      drawLowerBranches(branchLength);
    }
  }
  private static void adjustColor(int branchLength)
  {
    if (branchLength == 10)
    {
      Tortoise.setPenColor(Colors.Greens.Lime);
    }
    if (branchLength == 20)
    {
      Tortoise.setPenColor(Colors.Greens.ForestGreen);
    }
    if (branchLength == 30)
    {
      Tortoise.setPenColor(Colors.Greens.DarkGreen);
    }
    if (branchLength == 40)
    {
      Tortoise.setPenColor(Colors.Greens.Olive);
    }
    if (branchLength == 50)
    {
      Tortoise.setPenColor(Colors.Browns.Sienna);
    }
    if (branchLength == 60)
    {
      Tortoise.setPenColor(Colors.Browns.SaddleBrown);
    }
  }
  private static void drawLowerBranches(int branchLength)
  {
    Tortoise.turn(30);
    drawShorterBranch(branchLength);
    Tortoise.turn(-60);
    drawShorterBranch(branchLength);
    Tortoise.turn(30);
    adjustColor(branchLength);
    Tortoise.move(-branchLength);
  }
  private static void drawShorterBranch(int branchLength)
  {
    drawBranch(branchLength - 10);
  }
}