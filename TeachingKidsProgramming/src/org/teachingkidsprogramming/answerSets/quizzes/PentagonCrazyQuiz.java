package org.teachingkidsprogramming.answerSets.quizzes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.answerSets.quizzes.graders.PentagonCrazyQuizGrader;
import org.teachingkidsprogramming.answerSets.quizzes.graders.PentagonQuizAdapter;

public class PentagonCrazyQuiz extends PentagonQuizAdapter
{
  public void question1()
  {
    thread();
  }
  private void thread()
  {
    Tortoise.move(6);
  }
  public void question2()
  {
    for (int i = 1; i <= 76; i++)
    {
      stitch();
    }
  }
  public void question3()
  {
    ColorWheel.addColor(Colors.Greens.Lime);
  }
  public void question4()
  {
    ColorWheel.addColor(Colors.Reds.Red);
  }
  public static void main(String[] args)
  {
    new PentagonCrazyQuizGrader().grade(new PentagonCrazyQuiz());
  }
}
