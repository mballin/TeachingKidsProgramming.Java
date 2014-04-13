package org.teachingkidsprogramming.answerSets;

import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

import com.spun.util.ThreadUtils;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    MessageBox.showMessage("One morning the Tortoise woke up in a dream.");
    animateStartStory();
    String wakeUpOrExplore = MessageBox.askForTextInput("Do you want to 'wake up' or 'explore' the dream?");
    if (wakeUpOrExplore.equalsIgnoreCase("wake up"))
    {
      wakeUp();
    }
    else if (wakeUpOrExplore.equalsIgnoreCase("explore"))
    {
      approachOoze();
    }
    else
    {
      badAnswer();
    }
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color currentColor = Colors.Grays.Black;
    for (int i = 1; i <= 25; i++)
    {
      Tortoise.getBackgroundWindow().setBackground(currentColor);
      currentColor = Colors.lighten(currentColor);
      ThreadUtils.sleep(100);
    }
  }
  private static void badAnswer()
  {
    MessageBox.showMessage("You don't know how to read directions.  You can't play this game.  The End.");
  }
  private static void approachOoze()
  {
    MessageBox
        .showMessage("You approach a glowing, green bucket of ooze, worried that you will get in trouble, you pick up the bucket.");
    String whereToPour = MessageBox
        .askForTextInput("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
    if (whereToPour.equalsIgnoreCase("toilet"))
    {
      pourIntoToilet();
    }
    else if (whereToPour.equalsIgnoreCase("backyard"))
    {
      pourIntoBackyard();
    }
    else
    {
      badAnswer();
    }
  }
  private static void pourIntoBackyard()
  {
    MessageBox
        .showMessage("As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    String faintOrScream = MessageBox
        .askForTextInput("As the man starts to prepare you as soup, do you...  'Scream' or 'Faint'?");
    if (faintOrScream.equalsIgnoreCase("faint"))
    {
      tortoiseSoup();
    }
    else if (faintOrScream.equalsIgnoreCase("scream"))
    {
      startStory();
    }
    else
    {
      badAnswer();
    }
  }
  private static void tortoiseSoup()
  {
    MessageBox.showMessage("You made a delicious soup!  Yum!  The End.");
  }
  private static void pourIntoToilet()
  {
    MessageBox
        .showMessage("As you pour the ooze into the toilet it backs up, gurgles and explodes covering you in radio-active waste.");
    String beANinja = MessageBox.askForTextInput("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
    if (beANinja.equalsIgnoreCase("yes"))
    {
      ninjaTortoise();
    }
    else if (beANinja.equalsIgnoreCase("heck yes"))
    {
      ninjaTortoise();
    }
    else
    {
      badAnswer();
    }
  }
  private static void ninjaTortoise()
  {
    MessageBox.showMessage("Awesome Dude!  You live out the rest of your life fighting crimes and eating pizza!");
  }
  private static void wakeUp()
  {
    MessageBox.showMessage("You Wake up and have a boring day.  The End.");
  }
}
