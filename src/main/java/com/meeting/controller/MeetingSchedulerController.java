import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/meeting")
public class MeetingSchedulerController {

    //Establish Database connection here



		@RequestMapping(value = "/time/{timeSlot}/employee/{ID}", method = RequestMethod.GET)
		public String employeeCheck(Employee employee,@PathVariable("timeSlot") String timeSlot, @PathVariable("ID") int ID, ModelMap model) {
		String status ;
		DateTime myDate;
    if (!string.IsNullOrEmpty(timeSlot))
    {
        myDate = DateTime.Parse(timeSlot.Replace("!", ":"));
    }
		//Check the availibility of Each Employee in meeting table and EmployeeMeeting table with particular Time Slots and EmployeeId
		
		//store the result of the Employee status in status variable.
		
		
			model.addAttribute("status", status);
			return "EmployeeStatus";
		}
		
		@RequestMapping(value = "/time/{timeSlot}/room/{ID}", method = RequestMethod.GET)
		public String roomCheck(Room room,@PathVariable("timeSlot")  Date timeSlot,@PathVariable("ID") int ID, ModelMap model) {
		String status;
		//Check the availibility of Room in meeting table  with particular Time Slot and room number.
		
            //store the status of Room availibility status in status variable
			model.addAttribute("status", status);
			return "RoomStatus";
		}
		

		
		@RequestMapping(value = "/time/{timeSlot}/team/{ID}", method = RequestMethod.GET)
		public String teamCheck(Team team,@PathVariable("timeSlot") String timeSlot, @PathVariable("ID") int ID, ModelMap model) {
		String status ;
			DateTime myDate;
    if (!string.IsNullOrEmpty(timeSlot))
    {
        myDate = DateTime.Parse(timeSlot.Replace("!", ":"));
    }
		//Check the availibility of Entire team from team table and meeting table
		
		//store the result of the team availibility status in status variable.
		
		
			model.addAttribute("status", status);
			return "TeamStatus";
		}
		
		
		@RequestMapping(value = "/team/schedule", method = RequestMethod.POST)
		public String teamSchedule(Meeting meeting,Employee employee,Room room,Team team, ModelMap model) {
		String status ;
		//Parse the JSON from the body of the post
			//get the timeslot,team ID,Employee ID's and Room number to schedule a meeting
			//Before scheduling a meeting check the availibility of all the Employees in the team and also check availibility of Room 
			//Book a time slot .create a new row in meeting table and EmployeeMeeting with meeting id.
		
			model.addAttribute("status", status);
			return "Resource created";
		}
		
		
		
		
		
		
		
	}
