package example.temporal.activities;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface GreetingActivities {
  @ActivityMethod(name = "Say Hello")
  String composeGreeting(String greeting, String name);
}
