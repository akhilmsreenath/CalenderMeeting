import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/meeting")
public class MeetingSchedulerController {

    //Establish Database connection here



		@RequestMapping(value = "/{timeSlot}/employee/{ID}", method = RequestMethod.GET)
		public String employeeCheck(Employee employee,@PathVariable("timeSlot") Date timeSlot, @PathVariable("ID") int ID, ModelMap model) {
		String status ;
		//Check the availibility of Each Employee in meeting table and EmployeeMeeting table with particular Time Slots and EmployeeId
		
		//store the result of the Employee status in status variable.
		
		
			model.addAttribute("status", status);
			return "EmployeeStatus";
		}
		
		@RequestMapping(value = "/{timeSlot}/room/{ID}", method = RequestMethod.GET)
		public String roomCheck(Room room,@PathVariable("timeSlot")  Date timeSlot,@PathVariable("ID") int ID, ModelMap model) {
		String status;
		//Check the availibility of Room in meeting table  with particular Time Slot and room number.
		
            //store the status of Room availibility status in status variable
			model.addAttribute("status", status);
			return "RoomStatus";
		}
		
		@RequestMapping(value = "/schedule", method = RequestMethod.POST)
		public String schedulemeeting(Meeting meeting,Employee employee,Room room,ModelMap model) {
			//Before scheduling a meeting check the availibility of Room and Employees
				//Book a time slot .create a new row in meeting table and EmployeeMeetingwith meeting id.
		
		
			model.addAttribute("status", meeting.msg.success);
			return "Resource created";
		}
		
		
		
		
		
	}
