package utility;
import model.*;
public class EligibilityCheck extends BasicEligibility  implements EligibilityInterface
{
	public boolean basicEligibilityCheck(User user)
	{
		if(checkUser(user) && checkQuizAnswer("points"))
			return true;
		return false;
	}
	public boolean checkUser (User user)
	{
		int age=user.getAge();
		int height = user.getHeight();
		int weight=user.getWeight();
		String country=user.getCountry();
		if((18 <= age && age <= 35) && (155 <=height && height <=170 ) && (55<= weight && weight <= 90) && (country == "ProGrad"))
			return true;
		return false;
		
	}
	public boolean checkQuizAnswer (String points)
	{
		int num=Integer.parseInt(points);
		if(num>80)
			return true;
		return false;
		
	}
}






