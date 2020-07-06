package utility;
import model.User;
public interface EligibilityInterface
{
	public boolean checkUser (User user);
	public boolean checkQuizAnswer (String points);
}