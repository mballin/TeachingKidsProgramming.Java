package org.teachingkidsprogramming.answerSets;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Enter an adverb");
    String currentEdVerb = MessageBox.askForTextInput("Enter a verb ending with -ed");
    String currentBodyPart = MessageBox.askForTextInput("Enter a body part");
    String currentStory = "Today ";
    currentStory = currentStory + "I woke " + currentAdverb + ". ";
    currentStory = currentStory + "Then I " + currentEdVerb + " ";
    currentStory += "my " + currentBodyPart + ". ";
    MessageBox.showMessage(currentStory);
  }
}